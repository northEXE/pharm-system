package br.com.pharmsys.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iD")
	private Integer id;
	
	@Column(name="nome_medic")
	private String nomeMedicamento;
	
	
	private Double miligramagem;
	
	
	private String diaAdministracao;
	
	
	private String classificacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public Double getMiligramagem() {
		return miligramagem;
	}

	public void setMiligramagem(Double miligramagem) {
		this.miligramagem = miligramagem;
	}

	public String getDiaAdministracao() {
		return diaAdministracao;
	}

	public void setDiaAdministracao(String diaAdministracao) {
		this.diaAdministracao = diaAdministracao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	
}
