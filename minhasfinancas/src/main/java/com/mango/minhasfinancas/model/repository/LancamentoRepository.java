/**
 * 
 */
package com.mango.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mango.minhasfinancas.model.entity.lancamento;

/**
 * @author Joyce Ambrosio
 *
 */
public interface LancamentoRepository extends JpaRepository<lancamento, Long>{

}
