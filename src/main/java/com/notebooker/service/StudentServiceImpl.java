// Este paquete especifica la ubicación del servicio en el proyecto.
package com.notebooker.service;

// Importaciones de clases y anotaciones necesarias.
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.notebooker.model.Student;
import com.notebooker.repo.StudentRepo;

// Esta clase es una implementación del servicio de estudiante.
@Service
public class StudentServiceImpl implements StudentService {
	
	// La anotación @Autowired se utiliza para inyectar la dependencia del repositorio de estudiantes.
	@Autowired
	@Qualifier("studentRepoImpl")
	private StudentRepo repo;
	
	// Este método valida la edad del estudiante y luego intenta insertarlo en el repositorio.
	@Override
	public boolean insertValidate(Student student) {
		// Calcula la edad del estudiante a partir de su fecha de nacimiento.
		int age = Period.between(student.getBirthday(), LocalDate.now()).getYears();
		
		// Verifica si el estudiante tiene al menos 18 años antes de intentar la inserción.
		return age >= 18 ? repo.insert(student) : false;
	}
}
