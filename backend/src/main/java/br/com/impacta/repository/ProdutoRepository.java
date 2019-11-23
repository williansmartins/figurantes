package br.com.impacta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.impacta.model.Produto;
import br.com.impacta.model.Tipo;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	public List<Produto> findByTipo(Tipo tipo);

	
	
	
}