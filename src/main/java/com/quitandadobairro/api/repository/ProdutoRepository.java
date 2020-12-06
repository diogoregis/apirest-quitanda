package com.quitandadobairro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quitandadobairro.api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);

}
