package com.ropa.renueva.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ropa.renueva.model.User;
import com.ropa.renueva.service.UserService;

@RestController //indica que es un controlador
@RequestMapping("/api/r1")
public class UserController {
	// Mandamos a llamar a service
	public UserService userService;
	
	//inyeccion de dependencias en el constructor
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//Mapear metodos(Get, Post, Put, Delete)
	@GetMapping("/usuarios")
	public List<User> getMappingAll(){
		return userService.getAll(); //Retornando que viene de service
	}
	
	
}
