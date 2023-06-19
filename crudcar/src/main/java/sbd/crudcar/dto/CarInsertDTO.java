package sbd.crudcar.dto;

import sbd.crudcar.entities.Car;

public class CarInsertDTO {
	private String modelo;
	private Integer ano;
	private String renavam;
	private String placa;
	private String cor;
	private Double precoDiaria;
	
	public CarInsertDTO() {}

	public CarInsertDTO(String modelo, Integer ano, String renavam, String placa, String cor, Double precoDiaria) {
		this.modelo = modelo;
		this.ano = ano;
		this.renavam = renavam;
		this.placa = placa;
		this.cor = cor;
		this.precoDiaria = precoDiaria;
	}
	
	public CarInsertDTO(Car car) {
		this.modelo = car.getModelo();
		this.ano = car.getAno();
		this.renavam = car.getRenavam();
		this.placa = car.getPlaca();
		this.cor = car.getCor();
		this.precoDiaria = car.getPrecoDiaria();
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

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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
