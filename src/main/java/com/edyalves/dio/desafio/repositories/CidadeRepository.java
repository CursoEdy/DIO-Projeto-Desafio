package com.edyalves.dio.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edyalves.dio.desafio.models.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
}
