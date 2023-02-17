package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteNuevoTo;
import com.example.demo.service.to.EstudianteTo;

public interface IEstudianteService {

    public void registrar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public EstudianteNuevoTo encontrar(Integer id);
    public List<Estudiante> encontrarTodos();
    public List<Estudiante> encontrarTodosSalario(BigDecimal salario);
    public Estudiante encontrarNombre(String nombre);
    public Estudiante encontrarApellido(String apellido);
    public void borrar(Integer id);

    public List<EstudianteTo> encontrarTodosTo();

    
}
