package com.example.completablefuture.process;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface Processor {

	public CompletableFuture<?> processData(Map<String, Object> intermediateData);

	public default void setResponseInMap(String key, Object value, Map<String, Object> intermediateData) {

		intermediateData.put(key, value);

	}

	public default CompletableFuture<?> process(String key, Map<String, Object> intermediateData) {
		return processData(intermediateData).thenAccept(value -> setResponseInMap(key, value, intermediateData));
	}

}
