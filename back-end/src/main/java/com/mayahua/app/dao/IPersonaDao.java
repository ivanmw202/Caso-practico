package com.mayahua.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.mayahua.app.models.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{

}
