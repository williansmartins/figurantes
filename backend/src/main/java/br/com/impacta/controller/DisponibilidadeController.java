package br.com.impacta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.impacta.model.Disponibilidade;
import br.com.impacta.repository.DisponibilidadeRepository;
import io.swagger.annotations.ApiModelProperty;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("disponibilidade")
public class DisponibilidadeController {

	@Autowired
	DisponibilidadeRepository repository;

	@RequestMapping(value="", method = RequestMethod.GET)
	@ResponseBody
	@ApiModelProperty(example = "dasdas")
	public Iterable<Disponibilidade> buscarTodos(){
		return repository.findAll();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	@ResponseBody
	
    public Disponibilidade inserir(@RequestBody Disponibilidade disponibilidade) {
    	return repository.save(disponibilidade);
    }
	
	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	@ResponseBody
    public Disponibilidade atualizar(@PathVariable Long id,@RequestBody Disponibilidade disponibilidade) {
    	return repository.save(disponibilidade);
    }
	
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseBody
    public void excluir(@PathVariable Long id) {
    	repository.deleteById(id);
    }
}
