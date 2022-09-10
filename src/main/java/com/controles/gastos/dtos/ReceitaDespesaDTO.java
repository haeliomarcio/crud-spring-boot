package com.controles.gastos.dtos;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;

public class ReceitaDespesaDTO {
	
	@NotBlank
	private String description;
	
	@NotBlank
	private double value;
	
	@NotBlank
	private LocalDateTime data_criacao;

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public LocalDateTime getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDateTime data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	

}
