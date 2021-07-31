package com.example.completablefuture.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.completablefuture.schema.Response;
import com.example.completablefuture.servicemanager.ServiceManager;

@RestController
public class FutureRestController {

	@Autowired
	private ServiceManager serviceManager;

	@GetMapping("getData")
	public ResponseEntity<Response> getFutureData(String accountNumber)
			throws InterruptedException, ExecutionException {

		return ResponseEntity.ok().body(serviceManager.getResponse());
	}

}
