package com.junior.bookstore.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String nomeAutor;
	private String texto;

	@ManyToOne //Muitos para 1
	@JoinColumn(name ="categoria_id") 
	private Categoria categoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String titulo, String nomeAutor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Livro(Integer id) {
		super();
		this.id = id;
	}

}
