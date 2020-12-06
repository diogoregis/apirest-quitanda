package com.quitandadobairro.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quitandadobairro.api.models.Venda;
import com.quitandadobairro.api.repository.VendaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Venda")
public class VendaResource {
	
	@Autowired
	VendaRepository vendaRepository;
	
	@ApiOperation(value="Retorna lista completa de todas as Vendas")
	@GetMapping("/vendas")
	public List<Venda> listaVenda(){
		return vendaRepository.findAll();
	}
	
	@ApiOperation(value="Retorna uma Venda expecífica")
	@GetMapping("/venda/{id}")
	public Venda listaVendaUnico(@PathVariable(value="id") long id){
		return vendaRepository.findById(id);
	}
	
	@ApiOperation(value="Salva uma Venda")
	@PostMapping("/venda")
	public Venda salvaVenda(@RequestBody @Validated Venda venda) {
		return vendaRepository.save(venda);
	}
	
	@ApiOperation(value="Deleta uma Venda")
	@DeleteMapping("/venda")
	public void deletaVenda(@RequestBody @Validated Venda venda) {
		vendaRepository.delete(venda);
	}
	
	@ApiOperation(value="Atualiza uma Venda Existente")
	@PutMapping("/venda")
	public Venda atualizaVenda(@RequestBody @Validated Venda venda) {
		return vendaRepository.save(venda);
	}
	 

}