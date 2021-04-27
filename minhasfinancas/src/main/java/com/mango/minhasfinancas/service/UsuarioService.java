/**
 * 
 */
package com.mango.minhasfinancas.service;

import com.mango.minhasfinancas.model.entity.Usuario;

/**
 * @author Joyce Ambrosio
 *
 */
public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);

}
