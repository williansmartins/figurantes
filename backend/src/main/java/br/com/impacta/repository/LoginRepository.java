package br.com.impacta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.impacta.model.Login;

public interface LoginRepository extends CrudRepository<Login, Long> {

}
