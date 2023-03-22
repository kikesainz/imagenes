package com.kike.imagenes.dto;

public class LugarDTO {

	private Integer id;
	private String descripcion;
	private byte[] imagen;

	public LugarDTO(Integer id, String descripcion, byte[] imagen) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public LugarDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
