package br.com.impacta.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping(value="autenticar", method = RequestMethod.POST)
	@ResponseBody
	public boolean autenticar(@RequestBody Login login){
		Login loginDoBanco = repository.findByEmail(login.getEmail());

		if(null != loginDoBanco && null != loginDoBanco.getSenha()){
			return loginDoBanco.getSenha().equals(login.getSenha());
		}else{
			return false;
		}
	}

	@RequestMapping(value="", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity inserir(@RequestBody Login login) {
		try{
			validarCampos(login);
			repository.save(login);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
	}

	public static boolean isValidEmailAddressRegex(String email) {
		boolean isEmailIdValid = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}


	private void validarCampos(Login login) throws Exception {
		if(login.getEmail().isEmpty()){
			throw new Exception("email em branco");
		}
		if(!isValidEmailAddressRegex(login.getEmail())){
		 	throw new Exception("email inválido");
		}
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
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
