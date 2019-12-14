package br.com.impacta.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(notes = "O banco vai gerar o ID")
	private Long id;
	
	@ApiModelProperty(notes = "teste@teste.com.br") 
	private String email;
    
	@ApiModelProperty(example = "secreta")
    private String senha;
    
	@ApiModelProperty(notes = "Nome do figurante", example = "Willians Martins")
	private String nome;
    
	@ApiModelProperty(notes = "Para saber se o figurante está ativo", example = "sim/não")
    private boolean ativo;
    
	@Enumerated(EnumType.STRING)
    @ApiModelProperty(example = "ADMIN, CLIENTE, FIGURANTE")
    private TipoEnum tipo;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public TipoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}
	
}