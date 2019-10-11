package com.restapi.netflix.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_NETFLIX")
public class Netflix implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	
	private String titulo;
	
	private String genero;
	
	private BigDecimal faixaEtaria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(BigDecimal faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


}
