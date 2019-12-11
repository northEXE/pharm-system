package br.com.pharmsys.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tratamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	
	private String nomeTratamento;
	
	
	private String indicacao;
	
	
	private String contraIndicacao;
	
	@ManyToMany
	private List<Medicamento> medicamentos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeTratamento() {
		return nomeTratamento;
	}

	public void setNomeTratamento(String nomeTratamento) {
		this.nomeTratamento = nomeTratamento;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getContraIndicacao() {
		return contraIndicacao;
	}

	public void setContraIndicacao(String contraIndicacao) {
		this.contraIndicacao = contraIndicacao;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}
