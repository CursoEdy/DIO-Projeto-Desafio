package com.edyalves.dio.desafio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.dio.desafio.models.Cidade;
import com.edyalves.dio.desafio.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepo;

	public Cidade find(Integer id) {
		Optional<Cidade> obj = cidadeRepo.findById(id);
		return obj.orElse(null);
	}

}
