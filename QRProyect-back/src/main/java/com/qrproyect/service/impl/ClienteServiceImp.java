package com.qrproyect.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qrproyect.model.Cliente;
import com.qrproyect.repository.ClienteRepository;
import com.qrproyect.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
	
	private ClienteRepository clienteRepository;
	
	
	public ClienteServiceImp (ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente saveClient(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> findAllCliente() {
		return clienteRepository.findAll();
	}
	
}
