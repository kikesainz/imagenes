package com.kike.imagenes.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kike.imagenes.entities.LugarEntity;
import com.kike.imagenes.repository.LugaresRepository;

@RestController
public class LugaresController {
    @Autowired
	LugaresRepository lugaresRepositor;
    
	@GetMapping(value="/lugares")
	public Iterable<LugarEntity> listarTodosLugares(){
		
		Iterable<LugarEntity> l = lugaresRepositor.findAll();
		
		return l;
	}
	
	@GetMapping(value="/lugares/{id")
	public Optional<LugarEntity> listarTodosLugares(@PathVariable("id") Integer id){
		
		return lugaresRepositor.findById(id);
	}
}
