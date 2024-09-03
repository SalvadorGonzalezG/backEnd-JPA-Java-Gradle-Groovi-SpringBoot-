package com.ropa.renueva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ropa.renueva.model.User;
import com.ropa.renueva.repository.UserRepository;

@Service // Anotacion que indica que esta clase es un servicio de Spring
public class UserService {

	// Repositorio para gestionar operaciones con usuarios
	private UserRepository userRepository; 
	
	// Constructor con inyeccion de dependencias. La anotacion @Autowired permite que Spring inyecte automaticamente la dependencia UserRepository en el constructor
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	// Metodo para obtener todos los usuarios. Este metodo llama al repositorio para recuperar una lista de todos los objetos User almacenados en la base de datos
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
}
