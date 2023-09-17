package com.notebooker.model;

import java.time.LocalDate;

// Definición de la clase Student
public class Student {
	
	// Atributos de la clase Student
	private Integer id;
	private String name;
	private LocalDate birthday;
	
	// Getter para el atributo 'id'
	public Integer getId() {
		return id;
	}
	
	// Setter para el atributo 'id'
	public void setId(Integer id) {
		this.id = id;
	}
	
	// Getter para el atributo 'name'
	public String getName() {
		return name;
	}
	
	// Setter para el atributo 'name'
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter para el atributo 'birthday'
	public LocalDate getBirthday() {
		return birthday;
	}
	
	// Setter para el atributo 'birthday'
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	// Método toString() para obtener una representación de cadena de la instancia de Student
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getBirthday()=" + getBirthday() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}