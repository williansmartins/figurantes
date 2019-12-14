package br.com.impacta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.impacta.model.Contato;
import br.com.impacta.repository.ContatoRepository;



@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("contato")
public class ContatoController {

	@Autowired
	ContatoRepository repository;

	@RequestMapping(value="inserir", method = RequestMethod.POST)
	@ResponseBody	
    public Contato inserir(@RequestBody Contato contato) {
		System.out.println(contato);
		System.out.println(contato.getName());
    	return repository.save(contato);
    }
	
}

