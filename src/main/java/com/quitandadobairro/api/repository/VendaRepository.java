package com.quitandadobairro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quitandadobairro.api.models.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
	Venda findById(long id);

}

