package com.mayahua.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayahua.app.models.Persona;
import com.mayahua.app.services.IService;

@RestController
@RequestMapping("api/personas")
@CrossOrigin(origins = "*")
public class PersonasController {

	  @Autowired
	    private IService<Persona> personaService;

	    @PostMapping
	    public Map<String, String> guardar(@RequestBody Persona t) {
	    	t.setEdad(t.getEdad() + 1);
	        personaService.guardar(t);
	        Map<String, String> respuesta = new HashMap<>();
	        respuesta.put("msg", "El registro de " + t.getNombre() + ", próximamente tendrás " + t.getEdad() + " años.");
	        return respuesta;
	    }

	    @GetMapping
	    public List<Persona> listar() {
	        return personaService.listar();
	    }
	

}
