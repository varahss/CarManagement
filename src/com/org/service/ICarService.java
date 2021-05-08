package com.org.service;

import java.util.List;

import com.org.dto.CarDto;
import com.org.model.Car;

public interface ICarService {
	public String createCar(List<CarDto> carsDto );
	public List<Car> fetchCarByColor(String color);
	public List<Car> fetchCarByType(String type) ;
}
