package com.algawork.algalog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.algalog.domain.model.Cliente;
import com.algawork.algalog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClientesController {

	private ClienteRepository clienteRepository;
	
	/*
	 * @Autowired 
	 * private ClienteRepository clienteRepository;
	 */
	
	
	/* CASO NÃO QUEIRA UTLIZAR A INJEÇÃO DE INSTANCIA GERENCIADA PELO SPRING
	 * private ClienteRepository clienteRepository;
	 * 
	 * public ClientesController(ClienteRepository clienteRepository) { super();
	 * this.clienteRepository = clienteRepository; }
	 */



	@GetMapping("clientes")
	public List<Cliente> listar() {

		//return clienteRepository.findByNome("Leandro Lacerda"); 
		return clienteRepository.findByNomeContaining("a");
	}

}
