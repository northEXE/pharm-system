package br.com.pharmsys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sinal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	
	private String nomeSinal;
	
	
	private String descricaoSinal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeSinal() {
		return nomeSinal;
	}

	public void setNomeSinal(String nomeSinal) {
		this.nomeSinal = nomeSinal;
	}

	public String getDescricaoSinal() {
		return descricaoSinal;
	}

	public void setDescricaoSinal(String descricaoSinal) {
		this.descricaoSinal = descricaoSinal;
	}
	
}
