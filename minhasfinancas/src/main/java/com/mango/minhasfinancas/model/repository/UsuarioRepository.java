/**
 * 
 */
package com.mango.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mango.minhasfinancas.model.entity.Usuario;

/**
 * @author Joyce Ambrosio
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//optional: objeto ou vazio
	//querymethods findby
//	Optional<Usuario> findByEmail(String email);
	
	boolean existsByEmail(String email);
}
