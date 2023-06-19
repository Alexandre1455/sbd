package sbd.crudcar.dto;

public class CustomerInsertDTO {
	private String nome;
	private String email;
	private String tel;
	private String senha;
	
	public CustomerInsertDTO() {}

	public CustomerInsertDTO(String nome, String email, String tel, String senha) {
		this.nome = nome;
		this.email = email;
		this.tel = tel;
		this.senha = senha;
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
