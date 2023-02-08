package com.example.demo.repository;

import com.example.demo.repository.modelo.Profesor;

public interface IProfesorRepository {
    
    public void insertar(Profesor profesor);
    public void eliminar(Integer id);
    public Profesor buscarCedula(String cedula);
    public Profesor buscarNombre(String nombre);
    public Profesor buscarId(Integer id);

}
