package sbd.crudcar.dto;

import sbd.crudcar.entities.Car;

public class CarInsertDTO {
	private String model;
	private Integer year;
	private String renavam;
	private String plate;
	private String color;
	private Double dailyRate;
	
	public CarInsertDTO() {}

	public CarInsertDTO(String model, Integer year, String renavam, String plate, String color, Double dailyRate) {
		this.model = model;
		this.year = year;
		this.renavam = renavam;
		this.plate = plate;
		this.color = color;
		this.dailyRate = dailyRate;
	}
	
	public CarInsertDTO(Car car) {
		this.model = car.getModel();
		this.year = car.getYear();
		this.renavam = car.getRenavam();
		this.plate = car.getPlate();
		this.color = car.getColor();
		this.dailyRate = car.getDailyRate();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
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
