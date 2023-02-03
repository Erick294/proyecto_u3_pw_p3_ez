package com.uce.edu.pw.proyecto_u3_pw_p3_ez.service;

import com.uce.edu.pw.proyecto_u3_pw_p3_ez.modelo.Estudiante;

public interface IEstudianteService {

    public void registrar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public Estudiante encontrar(Integer id);
    public void borrar(Integer id);
    
}
