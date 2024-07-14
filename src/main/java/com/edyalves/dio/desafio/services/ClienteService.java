package com.edyalves.dio.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.dio.desafio.models.Cliente;
import com.edyalves.dio.desafio.repositories.ClienteRepository;

import ch.qos.logback.core.net.server.Client;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return  obj.orElse(null);
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}
