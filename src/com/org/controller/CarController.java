package com.org.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.dto.CarDto;
import com.org.model.Car;
import com.org.model.Response;
import com.org.service.CarService;

import org.springframework.cache.annotation.CachePut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.ResponseEntity;


@RestController 
@RequestMapping(value = "/CarManagement", produces = MediaType.APPLICATION_JSON_VALUE)

public class CarController {
	
	@Autowired
	private CarService carService;

	@PostMapping("/car")
	public ResponseEntity<Response> createCars(@RequestBody List<CarDto> cars){
		return new ResponseEntity<>(new Response(200, 
				"Car created", carService.createCar(cars)),HttpStatus.OK);
	}
	
	@GetMapping("/carColor/{color}")
	public ResponseEntity<Response> getColorBasedCars(@PathVariable("color") String color){
		return new ResponseEntity<>(new Response(200, 
				"Car fetched", carService.fetchCarByColor(color)),HttpStatus.OK);
	}
	
	@GetMapping("/carType/{type}")
	public ResponseEntity<Response> getTypeBasedCars(@PathVariable("type") String type){
		return new ResponseEntity<>(new Response(200, 
				"Car fetched", carService.fetchCarByType(type)),HttpStatus.OK);
	}
}
