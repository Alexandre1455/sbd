package sbd.crudcar.dto;

import sbd.crudcar.entities.Car;

public class CarReadDTO {
	private Long id;
	private String modelo;
	private Integer year;
	private String color;
	private Double dailyRate;
	
	public CarReadDTO() {}

	public CarReadDTO(String modelo, Integer year, String color, Double dailyRate) {
		this.modelo = modelo;
		this.year = year;
		this.color = color;
		this.dailyRate = dailyRate;
	}
	
	public CarReadDTO(Car car) {
		this.id = car.getId();
		this.modelo = car.getModel();
		this.year = car.getYear();
		this.color = car.getColor();
		this.dailyRate = car.getDailyRate();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return modelo;
	}

	public void setModel(String modelo) {
		this.modelo = modelo;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}
	
}
