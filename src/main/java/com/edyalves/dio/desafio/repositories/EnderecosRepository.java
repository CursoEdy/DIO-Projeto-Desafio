package com.edyalves.dio.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edyalves.dio.desafio.models.Endereco;

@Repository
public interface EnderecosRepository extends JpaRepository<Endereco, Integer>{

}
