package com.silviney.cadastro_cliente_simples;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.silviney.cadastro_cliente_simples.domain.Usuario;
import com.silviney.cadastro_cliente_simples.repositories.UsuarioRepository;

@SpringBootApplication
public class CadastroClienteSimplesApplication implements CommandLineRunner {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroClienteSimplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Silviney", "Neno", "123");
		Usuario u2 = new Usuario(null, "Thais", "Nena", "123456");
		Usuario u3 = new Usuario(null, "Arthur", "Coco", "14524");
		Usuario u4 = new Usuario(null, "Sidney", "Sid", "10101");
		Usuario u5 = new Usuario(null, "Dominique", "Domi", "11524");
		Usuario u6 = new Usuario(null, "Heitor", "Gordin", "10213");
		Usuario u7 = new Usuario(null, "Jason", "James", "15789");
		Usuario u8 = new Usuario(null, "Shirley", "Chica", "987512");
		
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
		
	}

}
