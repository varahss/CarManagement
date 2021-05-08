package com.org.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.ICarDAO;
import com.org.dto.CarDto;
import com.org.model.Car;

@Service
public class CarService implements ICarService {

	@Autowired
	private ICarDAO carDao;


	@Override
	public String createCar(List<CarDto> carsDto) {
		List<Car> cars=new ArrayList<>();
		for (CarDto carDto : carsDto) {
			Car car=new Car();
			BeanUtils.copyProperties(carDto, car);
			car.setUpdatedStamp(LocalDateTime.now());
			carDao.save(car);
			cars.add(car);
		}
		// TODO Auto-generated method stub
		return "Cars added";
	}


	public List<Car> fetchCarByColor(String color) {
	List<Car> cars= carDao.findByColor(color);
		return cars;
	}


	@Override
	public List<Car> fetchCarByType(String type) {
		List<Car> cars= carDao.findByType(type);
		return cars;
	}

	

}
