package com.controles.gastos.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controles.gastos.dtos.ReceitaDespesaDTO;
import com.controles.gastos.models.ReceitaDespesaModel;
import com.controles.gastos.services.ReceitaDespesaServices;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
@RequestMapping("/receita-despesa")
public class ReceitaDespesaController {
	
	final ReceitaDespesaServices receitaDespesaServices;
	
	public ReceitaDespesaController(ReceitaDespesaServices receitaDespesaServices) {
		this.receitaDespesaServices = receitaDespesaServices;
	}
	
	@PostMapping
	public ResponseEntity<Object> saveReceitaDespesa(@RequestBody @Valid ReceitaDespesaDTO receitaDespesaDto) {
		var receitaDespesaModel = new ReceitaDespesaModel();
		BeanUtils.copyProperties(receitaDespesaDto, receitaDespesaModel);
		
		receitaDespesaModel.setDataCriacao(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.OK).body(receitaDespesaServices.save(receitaDespesaModel));
	}
	
	
	
	
}
