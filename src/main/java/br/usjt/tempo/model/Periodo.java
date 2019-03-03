package br.usjt.tempo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Periodo {

	@Id @GeneratedValue
	private Long id;
	
	private String diaNaSemana;
	private Double temperaturaMinima;
	private Double temperaturaMaxima;
	private Double humidade;
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaNaSemana() {
		return diaNaSemana;
	}
	public void setDiaNaSemana(String diaNaSemana) {
		this.diaNaSemana = diaNaSemana;
	}
	public Double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(Double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public Double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(Double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public Double getHumidade() {
		return humidade;
	}
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
