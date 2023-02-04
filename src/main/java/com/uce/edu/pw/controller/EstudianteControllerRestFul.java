package com.uce.edu.pw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.pw.modelo.Estudiante;
import com.uce.edu.pw.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService estudianteService;

    public void registrar(Estudiante estudiante) {
      
    }


    public void actualizar(Estudiante estudiante) {
  
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

    public void borrar(Integer id) {
          
    }
    
}
