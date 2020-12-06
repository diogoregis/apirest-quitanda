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

import com.quitandadobairro.api.models.Cliente;
import com.quitandadobairro.api.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Clientes")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@ApiOperation(value="Retorna lista completa de todos os Clientes")
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um Cliente expecífico")
	@GetMapping("/cliente/{id}")
	public Cliente listaClienteUnico(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um Cliente")
	@PostMapping("/cliente")
	public Cliente salvaCliente(@RequestBody @Validated Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@ApiOperation(value="Deleta um cliente")
	@DeleteMapping("/cliente")
	public void deletaCliente(@RequestBody @Validated Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@ApiOperation(value="Atualiza um Cliente Existente")
	@PutMapping("/cliente")
	public Cliente atualizaCliente(@RequestBody @Validated Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	 

}
