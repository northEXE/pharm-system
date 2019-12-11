package br.com.pharmsys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sintoma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	
	private String nomeSintoma;
	
	
	private String descricaoSintoma;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricaoSintoma() {
		return descricaoSintoma;
	}

	public void setDescricaoSintoma(String descricaoSintoma) {
		this.descricaoSintoma = descricaoSintoma;
	}

	public String getNomeSintoma() {
		return nomeSintoma;
	}

	public void setNomeSintoma(String nomeSintoma) {
		this.nomeSintoma = nomeSintoma;
	}
	
}
