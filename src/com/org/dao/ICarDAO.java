package com.org.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.model.Car;


@Repository
public interface ICarDAO extends JpaRepository<Car, Long> {
	List<Car> findByColor(String color);
	List<Car> findByType(String type);
}
