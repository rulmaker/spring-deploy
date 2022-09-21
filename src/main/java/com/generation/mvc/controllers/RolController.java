package com.generation.mvc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.generation.mvc.models.RolModel;
import com.generation.mvc.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	RolService rolService;
	
	// obtener todos los roles
		@GetMapping() // http://localhost:8080/rol
		public ArrayList<RolModel> obtenerPosts() {
			return rolService.obtenerRoles();
		}

		@GetMapping("/{id}") // http://localhost:8080/rol/1
		public RolModel getPost(@PathVariable Integer id) {
			return rolService.obtenerRol(id);
		}

		@PostMapping() // http://localhost:8080/rol
		public RolModel guardarPost(@RequestBody RolModel rolModel) {
			return rolService.guardarRol(rolModel);
		}

		// Editar usuario
		@PutMapping("/actualizar") // http://localhost:8080/rol/actualizar
		public RolModel update(@RequestBody RolModel rolModel) {
			return rolService.actualizar(rolModel);
		}

		// Eliminar usuario
		@DeleteMapping("/eliminar/{id}") // http://localhost:8080/rol/eliminar/1
		public void eliminar(@PathVariable Integer id) {
			rolService.eliminar(id);
		}
}
