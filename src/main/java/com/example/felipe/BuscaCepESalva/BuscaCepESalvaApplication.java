package com.example.felipe.BuscaCepESalva;

import com.example.felipe.BuscaCepESalva.menu.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class BuscaCepESalvaApplication implements CommandLineRunner {

	private final Principal principal;

	public BuscaCepESalvaApplication(Principal principal) {
		this.principal = principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(BuscaCepESalvaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.menu();
	}
}
