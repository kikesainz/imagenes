package com.kike.imagenes.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name="imagenes")
public class ImagenesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idimagen")
	private Integer idImagen;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Lob
	@Basic(fetch = FetchType.EAGER)
    @Column(name = "imagen", columnDefinition="BLOB")
    private byte[] imagen;
	
	@ManyToOne
	@JoinColumn(name="idlugar")
	private LugarEntity lugar;

	
	public ImagenesEntity() {
		super();
	}

	public ImagenesEntity(Integer idImagen, String descripcion, byte[] imagen, LugarEntity lugar) {
		super();
		this.idImagen = idImagen;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.lugar = lugar;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public LugarEntity getLugar() {
		return lugar;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public void setLugar(LugarEntity lugar) {
		this.lugar = lugar;
	}

}
