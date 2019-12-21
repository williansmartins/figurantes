package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.model.Disponibilidade;


@Repository
public interface DisponibilidadeRepository extends CrudRepository<Disponibilidade, Long> {
	
}