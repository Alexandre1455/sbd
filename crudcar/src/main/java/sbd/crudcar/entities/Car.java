package sbd.crudcar.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import sbd.crudcar.dto.CarInsertDTO;

@Entity
@Table(name = "tb_cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	
	@Column(name = "model_year")
	private Integer year;
	private String renavam;
	private String plate;
	private String color;
	
	@Column(name = "daily_rate")
	private Double dailyRate;
	
	public Car() {}

	public Car(String model, Integer year, String renavam, String plate, String color, Double dailyRate) {
		this.model = model;
		this.year = year;
		this.renavam = renavam;
		this.plate = plate;
		this.color = color;
		this.dailyRate = dailyRate;
	}
	
	public Car(CarInsertDTO car) {
		this.model = car.getModel();
		this.year = car.getYear();
		this.renavam = car.getRenavam();
		this.plate = car.getPlate();
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