package br.com.pharmsys.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SistemaFisiologico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	private String nomeSistema;
	
	@OneToMany
	private List<Orgao> orgao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}

	public List<Orgao> getOrgao() {
		return orgao;
	}

	public void setOrgao(List<Orgao> orgao) {
		this.orgao = orgao;
	}

}
