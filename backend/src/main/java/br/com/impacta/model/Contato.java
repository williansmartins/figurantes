package br.com.impacta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(notes = "O banco vai gerar o ID")
	private Long id;
	
	@ApiModelProperty(notes = "Jessica Jones") 
	private String name;
	
	@ApiModelProperty(notes = "JessicaJones@hotmail.com") 
	private String email;
	
	@ApiModelProperty(notes = "Moda") 
	private String assunto ;
	
	@ApiModelProperty(notes = "Olá tudo bem ? ... ") 
	private String mensagem;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	

	
}
