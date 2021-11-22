package com.silviney.cadastro_cliente_simples.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silviney.cadastro_cliente_simples.domain.Usuario;
import com.silviney.cadastro_cliente_simples.repositories.UsuarioRepository;
import com.silviney.cadastro_cliente_simples.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		List<Usuario> list = repository.findAll();
		return list;
	}

	public Usuario uptade(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		return repository.save(newObj);
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public void delete (Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
}
