package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping("/home")
	public String home() {
		return "Bem Vindo a Página Home";
	}
	
	@GetMapping("/clientes")
	public List<String> clientes() {
		List<String> cli = new ArrayList<String>();
		cli.add("Microsoft");
		cli.add("Google");
		cli.add("Samsung");
		cli.add("Apple");
		cli.add("Xiaomi");
		return cli;
	}
	@GetMapping("/contato")
	public String contato() {
		return "contato@spring-docker.com.br";
	}
}
