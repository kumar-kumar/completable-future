package com.example.completablefuture.servicemanager;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.completablefuture.client.grocery.GroceryService;
import com.example.completablefuture.client.hotel.HotelService;
import com.example.completablefuture.helper.BuildResponse;
import com.example.completablefuture.schema.Response;
import com.example.completablefuture.util.Constants;

@Component
public class ServiceManager {

	@Autowired
	private GroceryService groceryService;

	@Autowired
	private HotelService hotelService;

	@Autowired
	private BuildResponse buildResponse;

	public Response getResponse() throws InterruptedException, ExecutionException {

		Map<String, Object> intermediateData = new HashMap<>();

		Response response = (Response) groceryService.process(Constants.GROCERY_RESPONSE, intermediateData)
				.thenCompose(v -> hotelService.process(Constants.HOTEL_RESPONSE, intermediateData))
				.thenCompose(v -> buildResponse.process(Constants.FINAL_REPONSE, intermediateData)).get();

		return response;
	}

}
