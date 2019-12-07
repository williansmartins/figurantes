package br.com.impacta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.impacta.model.Figurante;
import br.com.impacta.repository.FiguranteRepository;
import io.swagger.annotations.ApiModelProperty;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("figurantes")
public class FiguranteController {
	
	@Autowired
	FiguranteRepository repository;

	@RequestMapping(value="", method = RequestMethod.GET)
	@ResponseBody
	@ApiModelProperty(example = "dasdas")
	public Iterable<Figurante> buscarTodos(){
		return repository.findAll();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	@ResponseBody
	
    public Figurante inserir(@RequestBody Figurante figurante) {
    	return repository.save(figurante);
    }
	
	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	@ResponseBody
    public Figurante atualizar(@PathVariable Long id,@RequestBody Figurante figurante) {
    	return repository.save(figurante);
    }
	
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseBody
    public void excluir(@PathVariable Long id) {
    	repository.deleteById(id);
    }
}
