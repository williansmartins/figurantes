package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.model.Figurante;

@Repository
public interface FiguranteRepository extends CrudRepository<Figurante, Long> {
	
}