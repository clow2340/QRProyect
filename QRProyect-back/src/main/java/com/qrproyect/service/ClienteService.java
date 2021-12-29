package com.qrproyect.service;

import java.util.List;

import com.qrproyect.model.Cliente;

public interface ClienteService {
	
	//Interfaz para guardar cliente
	Cliente saveClient(Cliente cliente);
	
	//Interfaz para listar el cliente
	List<Cliente> findAllCliente();
}
