package com.uce.edu.pw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pw.modelo.Estudiante;
import com.uce.edu.pw.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
    
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    public void registrar(Estudiante estudiante) {
        this.estudianteRepository.insertar(estudiante);
        
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
        
    }

    @Override
    public Estudiante encontrar(Integer id) {
        return this.estudianteRepository.buscar(id);
    }

    @Override
    public void borrar(Integer id) {
        this.estudianteRepository.eliminar(id);
        
    }

    @Override
    public Estudiante encontrarNombre(String nombre) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarNombre(nombre);
    }

    @Override
    public Estudiante encontrarApellido(String apellido) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarNombre(apellido);
    }

    
    
}
