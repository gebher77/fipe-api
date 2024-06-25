package br.com.alura.fipeApi;

import br.com.alura.fipeApi.main.Main;
import br.com.alura.fipeApi.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FipeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.exibeMenu();

	}
}
