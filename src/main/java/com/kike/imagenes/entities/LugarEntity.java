package com.kike.imagenes.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="lugares")
public class LugarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idlugar")
	private Integer idLugar;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "imagen")
	private List<ImagenesEntity> imagenes = new ArrayList<>();
	

	public LugarEntity() {
		super();
	}

	public LugarEntity(Integer idLugar, String descripcion, List<ImagenesEntity> imagenes) {
		super();
		this.idLugar = idLugar;
		this.descripcion = descripcion;
		this.imagenes = imagenes;
	}

	public Integer getIdLugar() {
		return idLugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<ImagenesEntity> getImagenes() {
		return imagenes;
	}

	public void setIdLugar(Integer idLugar) {
		this.idLugar = idLugar;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setImagenes(List<ImagenesEntity> imagenes) {
		this.imagenes = imagenes;
	}
	
}
