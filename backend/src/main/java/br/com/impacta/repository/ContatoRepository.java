package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.model.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long> {
	Contato findById(String id);
}