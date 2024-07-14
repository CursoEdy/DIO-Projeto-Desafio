package com.edyalves.dio.desafio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.edyalves.dio.desafio.models.Cidade;
import com.edyalves.dio.desafio.models.Cliente;
import com.edyalves.dio.desafio.models.Endereco;
import com.edyalves.dio.desafio.models.Estado;
import com.edyalves.dio.desafio.repositories.CidadeRepository;
import com.edyalves.dio.desafio.repositories.ClienteRepository;
import com.edyalves.dio.desafio.repositories.EnderecosRepository;
import com.edyalves.dio.desafio.repositories.EstadoRepository;

/**
 * 
 * @author edy
 * 
 * End Points
 * 'http://localhost:8080/clientes' retorna todos os clientee seus endereços
 * 'http://localhost:8080/clientes/id' retorno o cliente especifico e seus endereços
 */

@EnableFeignClients
@SpringBootApplication
public class JwtDio1Application  implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepo;
	@Autowired
	private EstadoRepository estadoRepo;
	@Autowired
	private CidadeRepository cidadeRepo;
	@Autowired
	private EnderecosRepository enderecosRepo;

	public static void main(String[] args) {
		SpringApplication.run(JwtDio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "SP");
		
		Cidade cid1 = new Cidade(null, "Campinas", est1);
		Cidade cid2 = new Cidade(null, "Santos", est1);
		
		est1.getCidade().addAll(Arrays.asList(cid1, cid2));
		
		estadoRepo.saveAll(Arrays.asList(est1));
		cidadeRepo.saveAll(Arrays.asList(cid1, cid2));
		
		Cliente cli1 = new Cliente(null, "Cliente 01", "Cliente01@email.com");
		Cliente cli2 = new Cliente(null, "Cliente 02", "Cliente02@email.com");
		
		Endereco end2 = new Endereco(null, "Endereço 02", "02", "00000-000", "bairro 02", cli1, cid1);
		Endereco end3 = new Endereco(null, "Endereço 03", "03", "00000-000", "bairro 03", cli2, cid2);
		Endereco end4 = new Endereco(null, "Endereço 04", "04", "00000-000", "bairro 04", cli2, cid2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3, end4));
		
		clienteRepo.saveAll(Arrays.asList(cli1, cli2));		
		enderecosRepo.saveAll(Arrays.asList(end2, end3, end4));
		
	}

}
