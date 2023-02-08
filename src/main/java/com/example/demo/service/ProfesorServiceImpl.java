package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProfesorRepository;
import com.example.demo.repository.modelo.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService{
    
    @Autowired
    private IProfesorRepository profesorRepository;

    @Override
    public void registrar(Profesor profesor) {
        // TODO Auto-generated method stub
        this.profesorRepository.insertar(profesor);
    }

    @Override
    public void actualizar(Profesor profesor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Profesor encontrar(Integer id) {
        // TODO Auto-generated method stub
        return this.profesorRepository.buscarId(id);
    }

    @Override
    public Profesor encontrarNombre(String nombre) {
        // TODO Auto-generated method stub
        return this.profesorRepository.buscarNombre(nombre);
    }

    @Override
    public Profesor encontrarCedula(String cedula) {
        // TODO Auto-generated method stub
        return this.profesorRepository.buscarCedula(cedula);
    }

    @Override
    public void borrar(Integer id) {
        // TODO Auto-generated method stub
        this.profesorRepository.eliminar(id);
    }

    

    
    
}
