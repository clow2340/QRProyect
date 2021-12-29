package com.qrproyect.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qrproyect.model.Cliente;
import com.qrproyect.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	private ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}
	
	//crear cliente con rest
	@PostMapping("create")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
		return new ResponseEntity<Cliente>(clienteService.saveClient(cliente), HttpStatus.CREATED);
	}
	
	//Obtiene la lista de clientes del sistema
	@GetMapping()
	public List<Cliente> allFindCliente(){
		return clienteService.findAllCliente();
	}
}
