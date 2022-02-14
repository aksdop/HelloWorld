package com.AppRH.AppRH.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotEmpty;

@Entity
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String cnpj;
	
	@NotEmpty
	private String responsavel;
	
	@NotEmpty
	private String email;
	
	@ManyToOne
	private Vaga vaga;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String descricao) {
		this.telefone = descricao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String data) {
		this.cnpj = data;
	}


	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}


