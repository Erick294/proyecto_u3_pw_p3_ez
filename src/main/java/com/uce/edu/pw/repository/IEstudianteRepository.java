package com.uce.edu.pw.repository;

import com.uce.edu.pw.modelo.Estudiante;

public interface IEstudianteRepository {
    
    public void insertar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);
    public Estudiante buscar(Integer id);

}
