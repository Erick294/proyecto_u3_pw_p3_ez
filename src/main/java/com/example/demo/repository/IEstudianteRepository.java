package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
    
    public void insertar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);
    public Estudiante buscar(Integer id);
    public Estudiante buscarNombre(String nombre);
    public Estudiante buscarApellido(String apellido);
    public List<Estudiante> buscarTodos();
    public List<Estudiante> buscarTodosSalario(BigDecimal salario);
}
