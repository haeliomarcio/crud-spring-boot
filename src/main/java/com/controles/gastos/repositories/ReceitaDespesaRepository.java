package com.controles.gastos.repositories;


import com.controles.gastos.models.ReceitaDespesaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReceitaDespesaRepository extends JpaRepository<ReceitaDespesaModel, UUID>{
	
	
}
