package com.edyalves.dio.desafio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.dio.desafio.models.Endereco;
import com.edyalves.dio.desafio.repositories.EnderecosRepository;

@Service
public class EnderecosService {
	
	@Autowired
	private EnderecosRepository enderecosRepo;
	
	public Endereco find(Integer id) {
		Optional<Endereco> obj = enderecosRepo.findById(id);
		return obj.orElse(null);
	}

}
