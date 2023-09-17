// Esta es una interfaz que define el contrato para los repositorios de estudiantes.
package com.notebooker.repo;

import com.notebooker.model.Student;

public interface StudentRepo {
    // Este método se utiliza para insertar un estudiante en algún sistema de almacenamiento.
    // Devuelve un valor booleano para indicar si la inserción fue exitosa.
    boolean insert(Student student);
}
