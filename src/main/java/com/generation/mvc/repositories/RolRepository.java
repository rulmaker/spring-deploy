package com.generation.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.mvc.models.RolModel;

@Repository
public interface RolRepository  extends CrudRepository<RolModel, Integer>{
	

}
