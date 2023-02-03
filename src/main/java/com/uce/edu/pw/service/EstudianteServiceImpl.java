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
        // TODO Auto-generated method stub
        this.estudianteRepository.insertar(estudiante);
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        // TODO Auto-generated method stub
        this.estudianteRepository.actualizar(estudiante);
    }

    @Override
    public Estudiante encontrar(Integer id) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscar(id);
    }

    @Override
    public void borrar(Integer id) {
        // TODO Auto-generated method stub
        this.estudianteRepository.eliminar(id);;
        
    }

    
}
