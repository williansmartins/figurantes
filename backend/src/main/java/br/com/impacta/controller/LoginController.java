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

	@RequestMapping(value="validar/{a}/{b}", method = RequestMethod.GET)
	@ResponseBody
	public boolean Validarlogin(@PathVariable String a, @PathVariable String b){
		Login loginDoBanco = repository.findByEmail(a);

		System.out.println(">>>>> <" + loginDoBanco);
		System.out.println(loginDoBanco);

		if(null != loginDoBanco && null != loginDoBanco.getSenha()){
			return loginDoBanco.getSenha().equals(b);
		}else{
			return false;
		}
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
