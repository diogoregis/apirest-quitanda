package com.quitandadobairro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quitandadobairro.api.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	Vendedor findById(long id);

}