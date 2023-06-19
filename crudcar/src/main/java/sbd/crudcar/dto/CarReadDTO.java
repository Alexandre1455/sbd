package sbd.crudcar.dto;

import sbd.crudcar.entities.Car;

public class CarReadDTO {
	private Long id;
	private String modelo;
	private Integer ano;
	private String cor;
	private Double precoDiaria;
	
	public CarReadDTO() {}

	public CarReadDTO(String modelo, Integer ano, String cor, Double precoDiaria) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.precoDiaria = precoDiaria;
	}
	
	public CarReadDTO(Car car) {
		this.id = car.getId();
		this.modelo = car.getModelo();
		this.ano = car.getAno();
		this.cor = car.getCor();
		this.precoDiaria = car.getPrecoDiaria();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(Double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	
}
