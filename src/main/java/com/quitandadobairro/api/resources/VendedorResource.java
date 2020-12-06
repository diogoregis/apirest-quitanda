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

import com.quitandadobairro.api.models.Vendedor;
import com.quitandadobairro.api.repository.VendedorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Vendedor")
public class VendedorResource {
	
	@Autowired
	VendedorRepository vendedorRepository;
	
	@ApiOperation(value="Retorna lista completa de todos os Vendedores")
	@GetMapping("/vendedores")
	public List<Vendedor> listaVendedor(){
		return vendedorRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um Vendedor expecífico")
	@GetMapping("/vendedor/{id}")
	public Vendedor listaVendedorUnico(@PathVariable(value="id") long id){
		return vendedorRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um Vendedor")
	@PostMapping("/vendedor")
	public Vendedor salvaVendedor(@RequestBody @Validated Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}
	
	@ApiOperation(value="Deleta um Vendedor")
	@DeleteMapping("/vendedor")
	public void deletaVendedor(@RequestBody @Validated Vendedor vendedor) {
		vendedorRepository.delete(vendedor);
	}
	
	@ApiOperation(value="Atualiza um Vendedor Existente")
	@PutMapping("/vendedor")
	public Vendedor atualizaVendedor(@RequestBody @Validated Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}
	 

}
