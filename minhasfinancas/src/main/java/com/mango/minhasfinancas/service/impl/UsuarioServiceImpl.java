/**
 * 
 */
package com.mango.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mango.minhasfinancas.exception.RegraNegocioException;
import com.mango.minhasfinancas.model.entity.Usuario;
import com.mango.minhasfinancas.model.repository.UsuarioRepository;
import com.mango.minhasfinancas.service.UsuarioService;

/**
 * @author Joyce Ambrosio
 *
 */

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com esse email");
		}
		
	}

}
