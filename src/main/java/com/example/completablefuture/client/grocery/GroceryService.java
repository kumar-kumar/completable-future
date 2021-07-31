package com.example.completablefuture.client.grocery;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

import com.example.completablefuture.process.Processor;

@Component
public class GroceryService implements Processor {

	@Override
	public CompletableFuture<Grocery> processData(Map<String, Object> intermediateData) {
		// TODO Auto-generated method stub
		Grocery grocery = new Grocery("Banana", "5", true);

		return CompletableFuture.completedFuture(grocery);
	}

}
