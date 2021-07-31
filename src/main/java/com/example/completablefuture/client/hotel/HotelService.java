package com.example.completablefuture.client.hotel;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

import com.example.completablefuture.process.Processor;

@Component
public class HotelService implements Processor {

	@Override
	public CompletableFuture<Hotel> processData(Map<String, Object> intermediateData) {

		Hotel hotel = new Hotel(1234, "Washington",
				"Contemporary lodging with an indoor pool & a fitness center, plus free WiFi & a hot breakfast bar.",
				"Houstan", 5);

		return CompletableFuture.completedFuture(hotel);
	}

}
