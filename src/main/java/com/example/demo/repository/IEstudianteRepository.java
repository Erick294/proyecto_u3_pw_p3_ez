package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
    
    public void insertar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);
    public Estudiante buscar(Integer id);
    public Estudiante buscarNombre(String nombre);
    public Estudiante buscarApellido(String apellido);
}
