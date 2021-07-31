package com.example.completablefuture.helper;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

import com.example.completablefuture.client.grocery.Grocery;
import com.example.completablefuture.client.hotel.Hotel;
import com.example.completablefuture.process.Processor;
import com.example.completablefuture.schema.Response;
import com.example.completablefuture.util.Constants;

@Component
public class BuildResponse implements Processor {

	@Override
	public CompletableFuture<Response> processData(Map<String, Object> intermediateData) {

		Hotel hotel = (Hotel) intermediateData.get(Constants.HOTEL_RESPONSE);
		Grocery grocery = (Grocery) intermediateData.get(Constants.GROCERY_RESPONSE);

		Response response = new Response();
		
		response.setAvailable(grocery.isAvailable());
		response.setQuantity(grocery.getQuantity());
		response.setItemName(grocery.getItemName());

		response.setCity(hotel.getCity());
		response.setDescription(hotel.getDescription());
		response.setId(hotel.getId());
		response.setName(hotel.getName());
		response.setRating(hotel.getRating());

		return CompletableFuture.completedFuture(response);
	}

}
