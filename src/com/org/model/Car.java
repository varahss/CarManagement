package com.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "car_details")
public class Car {
	@Id
	@GenericGenerator(name = "user_details", strategy = "increment")
	@GeneratedValue(generator = "user_details")
	private long id;
	private String manufacturer;
	private String name;
	private String type;
	private String color;
	private LocalDateTime creatorStamp = LocalDateTime.now();
	private LocalDateTime updatedStamp;
	
	public Car(String manufacturer, String name, String type, String color) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.type = type;
		this.color = color;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", name=" + name + ", type=" + type + ", color="
				+ color + ", creatorStamp=" + creatorStamp + ", updatedStamp=" + updatedStamp + "]";
	}
	public long getId() {
		return id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDateTime getCreatorStamp() {
		return creatorStamp;
	}
	public void setCreatorStamp(LocalDateTime creatorStamp) {
		this.creatorStamp = creatorStamp;
	}
	public LocalDateTime getUpdatedStamp() {
		return updatedStamp;
	}
	public void setUpdatedStamp(LocalDateTime updatedStamp) {
		this.updatedStamp = updatedStamp;
	}
	
}
