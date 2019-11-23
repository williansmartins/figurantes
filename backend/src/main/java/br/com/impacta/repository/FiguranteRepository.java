package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.impacta.model.Figurante;

public interface FiguranteRepository extends CrudRepository<Figurante, Long> {
	
}