package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Profesor;
import com.example.demo.service.IProfesorService;

@RestController
@RequestMapping("/profesores")
public class ProfesorControllerRestFul {

    @Autowired
    private IProfesorService profesorService;

    public void registrar(Profesor profesor) {
      
    }


    @PutMapping(path = "/{id}")
    public void actualizar(@PathVariable("id") Integer id, Profesor profesor) {
  
    }

    @GetMapping(path = "/buscar/{id}")
    public Profesor encontrarId(@PathVariable("id") Integer id) {
        return this.profesorService.encontrar(id);
    }

    @GetMapping(path = "/buscar/{nombre}")
    public Profesor encontrarNombre(@PathVariable("nombre") String nombre) {
        return this.profesorService.encontrarNombre(nombre);
    }

    @GetMapping(path = "/buscar/cedula/{cedula}")
    public Profesor encontrarCedula(@PathVariable("cedula") String cedula) {
        return this.profesorService.encontrarCedula(cedula);
    }

    @DeleteMapping(path = "/{id}")
    public void borrar(@PathVariable("id") Integer id) {
    	this.profesorService.borrar(id);
          
    }
    
}
