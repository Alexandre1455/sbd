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
	private String modelo;
	private Integer ano;
	private String renavam;
	private String placa;
	private String cor;
	
	@Column(name = "preco_diaria")
	private Double precoDiaria;
	
	public Car() {}

	public Car(String modelo, Integer ano, String renavam, String placa, String cor, Double precoDiaria) {
		this.modelo = modelo;
		this.ano = ano;
		this.renavam = renavam;
		this.placa = placa;
		this.cor = cor;
		this.precoDiaria = precoDiaria;
	}
	
	public Car(CarInsertDTO car) {
		this.modelo = car.getModelo();
		this.ano = car.getAno();
		this.renavam = car.getRenavam();
		this.placa = car.getPlaca();
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