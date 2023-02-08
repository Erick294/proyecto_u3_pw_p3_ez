package com.example.demo.service;

import com.example.demo.repository.modelo.Profesor;

public interface IProfesorService {

    public void registrar(Profesor profesor);
    public void actualizar(Profesor profesor);
    public Profesor encontrar(Integer id);
    public Profesor encontrarNombre(String nombre);
    public Profesor encontrarCedula(String cedula);
    public void borrar(Integer id);
    
}
