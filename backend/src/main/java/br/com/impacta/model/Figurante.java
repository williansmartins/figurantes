package br.com.impacta.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Figurante {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(notes = "O banco vai gerar o ID")
	private Long id;
    @ApiModelProperty(notes = "Nome do figurante", example = "Willians Martins")
	private String nome;
    @ApiModelProperty(example = "37")
	private int idade;
    @ApiModelProperty(example = "M")
	private char genero;
    @ApiModelProperty(example = "branco")
	private String etinia;
    @ApiModelProperty(example = "1.78")
	private float altura;
    @ApiModelProperty(example = "80.00")
	private float peso;
    @ApiModelProperty(example = "contato@williansmartins.com")
	private String email;
    @ApiModelProperty(example = "secreta")
	private String senha;
    @ApiModelProperty(example = "305.809.118-11")
	private String cpf;

	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getEtinia() {
		return etinia;
	}
	public void setEtinia(String etinia) {
		this.etinia = etinia;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
