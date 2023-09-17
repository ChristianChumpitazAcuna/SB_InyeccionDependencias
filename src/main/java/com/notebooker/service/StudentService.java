// Esta es una interfaz que define métodos para el servicio de estudiantes.
package com.notebooker.service;

import com.notebooker.model.Student;

public interface StudentService {
    // Este método se utiliza para validar e insertar un estudiante.
    boolean insertValidate(Student student);
}
