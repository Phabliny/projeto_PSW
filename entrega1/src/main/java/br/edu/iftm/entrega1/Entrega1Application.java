package br.edu.iftm.entrega1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Entrega1Application implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Entrega1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		jdbcTemplate.execute("CREATE TABLE usuario (id SERIAL, voluntario boolean, nome VARCHAR(255), email VARCHAR(255), cpf NUMBER, endereco VARCHAR(255), telefone NUMBER, sexo VARCHAR(1), senha VARCHAR(255))");

		jdbcTemplate.execute("CREATE TABLE animais (id SERIAL, nome VARCHAR(255), raca VARCHAR(255), porte VARCHAR(1), descricao VARCHAR(255))");
	}
}