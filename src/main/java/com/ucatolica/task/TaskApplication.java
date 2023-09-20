package com.ucatolica.task;

import com.ucatolica.task.jpa.UsuarioEntityRepository;
import com.ucatolica.task.persistencia.UsuarioEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(
		UsuarioEntityRepository usuarioEntityRepository
	){
		return args-> {
			usuarioEntityRepository.findUserByEmail("waitchesony@miitbeian.gov.cn").ifPresent(usr -> {
				System.out.println("Usuario encontrado ...");
				System.out.println(usr.toString());
			});

			for (UsuarioEntity usuario : usuarioEntityRepository.findUsuariosPrimerApellidoLike("a")) {
				System.out.println(usuario.toString());
			}


		};
	}
}
