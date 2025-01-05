package com.example.felipe.BuscaCepESalva;

import com.example.felipe.BuscaCepESalva.service.BuscaDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class BuscaCepESalvaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuscaCepESalvaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BuscaDados buscaDados = new BuscaDados();
		buscaDados.obterDados();
	}
}
