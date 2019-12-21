package br.com.impacta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Disponibilidade {

	
    @ApiModelProperty(notes = "O banco vai gerar o ID")
	private int idFigurante;
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(notes = "O banco vai gerar o ID")
	private int id;

    @ApiModelProperty(notes = "21/12/2019")
	private	Date data;

    @ApiModelProperty(notes = "21/12/2019")
	private Date createdAt;

    @ApiModelProperty(notes = "21/12/2019")
	private Date updatedAt;
	
		
	public int getIdFigurante() {
		return idFigurante;
	}
	public void setIdFigurante(int idFigurante) {
		this.idFigurante = idFigurante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
