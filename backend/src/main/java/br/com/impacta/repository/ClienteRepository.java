package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.impacta.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}