package br.edu.unifacear.unilibrary.Unilibrary.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String titulo;
	@OneToOne
	private Autor autor;
	@OneToOne
	private Editora editora;
	private String descricao;
	
	public Livro() {}

	public Livro(Integer id, String titulo, Autor autor, Editora editora, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.descricao = descricao;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
