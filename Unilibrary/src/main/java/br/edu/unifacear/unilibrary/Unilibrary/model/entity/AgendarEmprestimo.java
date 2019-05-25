package br.edu.unifacear.unilibrary.Unilibrary.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class AgendarEmprestimo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Aluno aluno;
	private Boolean status;
	@OneToOne
	private Fila fila;
	
	public AgendarEmprestimo() {
	
	}

	public AgendarEmprestimo(Integer id, Aluno aluno, Boolean status, Fila fila) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.status = status;
		this.fila = fila;
	}
	
	public Integer getId() {
		return this.id;	
	}
	
	public void setId(Integer id) {
		this.id = id;	
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}
}
