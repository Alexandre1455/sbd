package sbd.crudcar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import sbd.crudcar.dto.CustomerInsertDTO;

@Entity
@Table(name = "tb_customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String tel;
	private String senha;
	
	public Customer() {}
	
	public Customer(Long id, String nome, String email, String tel, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tel = tel;
		this.senha = senha;
	}

	public Customer(CustomerInsertDTO dto) {
		this.nome = dto.getNome();
		this.email = dto.getEmail();
		this.tel = dto.getTel();
		this.senha = dto.getSenha();
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
