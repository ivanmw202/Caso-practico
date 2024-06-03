package com.mayahua.app.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
//1
@Table (name = "jpa_personas")
@Entity 
public class Persona {
	//2
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUST_SEQ1")
	@SequenceGenerator(sequenceName = "customer_seq1", allocationSize = 1, name = "CUST_SEQ1")
	private Long id;
	//2
	
	@Column(name = "nombre")
	private String nombre;
	
	//2
	@Column (name = "edad")
	private Long edad;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	  // Getters y setters
	
	
	
	

}
