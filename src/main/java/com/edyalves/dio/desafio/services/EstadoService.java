package com.edyalves.dio.desafio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.dio.desafio.models.Estado;
import com.edyalves.dio.desafio.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepo;
	
	public Estado Find(Integer id) {
		Optional<Estado> obj = estadoRepo.findById(id);
		return obj.orElse(null);
	}
}
