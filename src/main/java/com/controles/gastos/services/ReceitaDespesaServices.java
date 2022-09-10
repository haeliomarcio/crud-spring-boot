package com.controles.gastos.services;

import org.springframework.stereotype.Service;

import com.controles.gastos.models.ReceitaDespesaModel;
import com.controles.gastos.repositories.ReceitaDespesaRepository;

@Service
public class ReceitaDespesaServices {

	final ReceitaDespesaRepository receitaDespesaRepository;
	
	public ReceitaDespesaServices(ReceitaDespesaRepository receitaDespesaRepository) {
		this.receitaDespesaRepository = receitaDespesaRepository;
	}
	
	public ReceitaDespesaModel save(ReceitaDespesaModel receitaDespesaModel) {
		return receitaDespesaRepository.save(receitaDespesaModel);
	}
	
	
	
}
