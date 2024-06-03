package com.mayahua.app.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mayahua.app.dao.IPersonaDao;
import com.mayahua.app.models.Persona;

@Service
public class PersonasService implements IService<Persona>{
	@Autowired

    private IPersonaDao personaDao;

    public List<Persona> listar() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public Optional<Persona> getById(Long id) {
        return personaDao.findById(id);
    }

    @Override
    public void guardar(Persona t) {
        personaDao.save(t);
    }

    @Override
    public void eliminar(Long id) {
        personaDao.deleteById(id);
    }

	
}
