package br.com.pharmsys.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orgao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;

	private String nomeOrgao;
	
	private String localizacao;
	
	@OneToOne
	private SistemaFisiologico sistemaFisiologico;
	
	@OneToMany
	private List<Patologia> patologias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public SistemaFisiologico getSistemaFisiologico() {
		return sistemaFisiologico;
	}

	public void setSistemaFisiologico(SistemaFisiologico sistemaFisiologico) {
		this.sistemaFisiologico = sistemaFisiologico;
	}

	public List<Patologia> getPatologias() {
		return patologias;
	}

	public void setPatologias(List<Patologia> patologias) {
		this.patologias = patologias;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
