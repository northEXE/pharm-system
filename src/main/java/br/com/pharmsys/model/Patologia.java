package br.com.pharmsys.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patologia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;

	private String nomePatologia;

	@ManyToMany
	private List<Sintoma> sintomas;

	@ManyToMany
	private List<Sinal> sinais;

	@OneToMany
	private List<Tratamento> tratamentos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomePatologia() {
		return nomePatologia;
	}

	public void setNomePatologia(String nomePatologia) {
		this.nomePatologia = nomePatologia;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	public List<Sinal> getSinais() {
		return sinais;
	}

	public void setSinais(List<Sinal> sinais) {
		this.sinais = sinais;
	}

	public List<Tratamento> getTratamentos() {
		return tratamentos;
	}

	public void setTratamentos(List<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}

}
