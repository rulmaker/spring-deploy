package com.generation.mvc.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.generation.mvc.models.RolModel;
import com.generation.mvc.repositories.RolRepository;

@Service
public class RolService {

	@Autowired
	RolRepository rolRepository;
	
	public ArrayList<RolModel> obtenerRoles(){
		return (ArrayList<RolModel>) rolRepository.findAll();
    }
	
	//obtener usuario por id
	public RolModel obtenerRol(Integer id) {
		Optional<RolModel> post = rolRepository.findById(id);
		return post.orElse(null);
	}
	
	public RolModel guardarRol(RolModel rolModel){
        return rolRepository.save(rolModel);
    }

	
	// eliminar
	public void eliminar(Integer id) {
		rolRepository.deleteById(id);	
	}

	//actualizar
	public RolModel actualizar(RolModel rolModel) {
		return rolRepository.save(rolModel);
	}
}
