// Este paquete especifica la ubicación del repositorio en el proyecto.
package com.notebooker.repo;

// Importaciones de clases y anotaciones necesarias.
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.notebooker.model.Student;

// Esta clase es una implementación alternativa del repositorio de estudiantes.
@Repository
@Qualifier("newStudentRepoImpl")
public class NewStudentRepoImpl implements StudentRepo {

	// Este método simula la inserción de un nuevo estudiante en algún sistema de almacenamiento.
	@Override
	public boolean insert(Student student) {
		// Imprime los detalles del nuevo estudiante en la consola.
		System.out.println("New Student: " + student.toString());
		// Retorna verdadero para indicar que la inserción fue exitosa (esto es una simulación).
		return true;
	}
}
