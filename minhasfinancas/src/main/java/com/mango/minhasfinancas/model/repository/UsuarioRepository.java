/**
 * 
 */
package com.mango.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mango.minhasfinancas.model.entity.Usuario;

/**
 * @author Joyce Ambrosio
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
