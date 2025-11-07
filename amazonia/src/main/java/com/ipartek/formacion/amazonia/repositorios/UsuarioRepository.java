package com.ipartek.formacion.amazonia.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.amazonia.entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
