package sbd.crudcar.dto;

import sbd.crudcar.entities.Customer;

public class CustomerReadDTO {
	private Long id;
	private String nome;
	private String email;
	private String tel;
	
	public CustomerReadDTO(Long id, String nome, String email, String tel) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tel = tel;
	}
	
	public CustomerReadDTO(Customer customer) {
		this.id = customer.getId();
		this.nome = customer.getNome();
		this.email = customer.getEmail();
		this.tel = customer.getTel();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
