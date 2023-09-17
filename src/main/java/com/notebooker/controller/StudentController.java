// Este paquete especifica la ubicación del controlador en el proyecto.
package com.notebooker.controller;

// Importaciones de clases y anotaciones necesarias.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notebooker.model.Student;
import com.notebooker.service.StudentService;

// Esta clase es un controlador REST que maneja las solicitudes relacionadas con estudiantes.
@RestController
@RequestMapping("/students")
public class StudentController {
	
	// La anotación @Autowired se utiliza para inyectar la dependencia del servicio de estudiante.
	@Autowired
	private StudentService service;
	
	// El método POST se utiliza para agregar un nuevo estudiante.
	@PostMapping
	public void insertStudent(@RequestBody Student student) {
		// En lugar de interactuar directamente con un repositorio, se llama a un servicio para validar e insertar al estudiante.
		service.insertValidate(student);
	}
}
