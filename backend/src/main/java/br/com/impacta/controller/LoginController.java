package br.com.impacta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import br.com.impacta.model.Login;
import br.com.impacta.repository.LoginRepository;
import io.swagger.annotations.ApiModelProperty;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	LoginRepository repository;

	@RequestMapping(value="", method = RequestMethod.GET)
	@ResponseBody
	@ApiModelProperty(example = "dasdas")
	public Iterable<Login> buscarTodos(){
		return repository.findAll();
	}

	@RequestMapping(value="{email}/{senha}", method = RequestMethod.GET)
	@ResponseBody
	@ApiModelProperty(example = "dasdas")
	public boolean Validarlogin(@PathVariable String email, @PathVariable String senha){
		Login loginDoBanco = repository.findByEmail(email);
		return loginDoBanco.getSenha().equals(senha);
	}

	@RequestMapping(value="", method = RequestMethod.POST)
	@ResponseBody

	public Login inserir(@RequestBody Login login) {
		return repository.save(login);
	}

	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	@ResponseBody
	public Login atualizar(@PathVariable Long id,@RequestBody Login login) {
		return repository.save(login);
	}

	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
