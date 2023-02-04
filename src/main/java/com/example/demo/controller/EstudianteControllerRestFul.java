package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService estudianteService;

    public void registrar(Estudiante estudiante) {
      
    }


    @PutMapping(path = "/{id}")
    public void actualizar(@PathVariable("id") Integer id, Estudiante estudiante) {
  
    }

    @GetMapping(path = "/buscar/{id}")
    public Estudiante encontrar(@PathVariable("id") Integer id) {
        return this.estudianteService.encontrar(id);
    }

    @GetMapping(path = "/buscar/{nombre}")
    public Estudiante encontrarNombre(@PathVariable("nombre") String nombre) {
        return this.estudianteService.encontrarApellido(nombre);
    }

    @GetMapping(path = "/buscar/{apellido}")
    public Estudiante encontrarApellido(@PathVariable("apellido") String apellido) {
        return this.estudianteService.encontrarApellido(apellido);
    }

    @DeleteMapping(path = "/{id}")
    public void borrar(@PathVariable("id") Integer id) {
    	this.estudianteService.borrar(id);
          
    }
    
}
