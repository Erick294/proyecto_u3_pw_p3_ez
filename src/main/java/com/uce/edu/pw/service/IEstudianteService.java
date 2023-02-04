package com.uce.edu.pw.service;

import com.uce.edu.pw.modelo.Estudiante;

public interface IEstudianteService {

    public void registrar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public Estudiante encontrar(Integer id);
    public Estudiante encontrarNombre(String nombre);
    public Estudiante encontrarApellido(String apellido);
    public void borrar(Integer id);
    
}
