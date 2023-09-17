// Este paquete especifica la ubicación del repositorio en el proyecto.
package com.notebooker.repo;

// Importaciones de clases y anotaciones necesarias.
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.notebooker.model.Student;

// Esta clase es una implementación del repositorio de estudiantes.
@Repository
@Qualifier("studentRepoImpl")
public class StudentRepoImpl implements StudentRepo {

	// Este método simula la inserción de un estudiante en algún sistema de almacenamiento.
	@Override
	public boolean insert(Student student) {
		// Imprime los detalles del estudiante en la consola.
		System.out.println(student.toString());
		// Retorna verdadero para indicar que la inserción fue exitosa (esto es una simulación).
		return true;
	}
}
