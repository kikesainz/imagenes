package com.kike.imagenes.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kike.imagenes.entities.ImagenesEntity;
import com.kike.imagenes.entities.LugarEntity;
import com.kike.imagenes.repository.ImagenesRepository;
import com.kike.imagenes.repository.LugaresRepository;

@RestController
public class ImagenesController {
	
    @Autowired
	ImagenesRepository imagenesRepositor;
	
	@GetMapping(value="/imagenes/{id}")
	public Optional<ImagenesEntity> listarImagen(@PathVariable("id") Integer id){
		
		return imagenesRepositor.findById(id);
	}

}
