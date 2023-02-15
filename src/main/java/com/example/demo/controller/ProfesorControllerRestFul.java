package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Profesor;
import com.example.demo.service.IProfesorService;

@RestController
@RequestMapping("/profesores")
public class ProfesorControllerRestFul {

    @Autowired
    private IProfesorService profesorService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void registrar(@RequestBody Profesor profesor) {
      this.profesorService.registrar(profesor);
    }


    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Profesor> actualizar(@PathVariable("id") Integer id, @RequestBody Profesor profesor) {
	    profesor.setId(id);
        System.out.println("Actualizado Correctamente ");
        this.profesorService.actualizar(profesor);
        Profesor pro = this.profesorService.encontrar(id);
        return ResponseEntity.status(HttpStatus.OK).body(pro);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Profesor encontrarId(@PathVariable("id") Integer id) {
        return this.profesorService.encontrar(id);
    }

    @GetMapping(path = "/nombre/{nombre}", produces = MediaType.APPLICATION_XML_VALUE)
    public Profesor encontrarNombre(@PathVariable("nombre") String nombre) {
        return this.profesorService.encontrarNombre(nombre);
    }

    @GetMapping(path = "/cedula/{cedula}", produces = MediaType.APPLICATION_XML_VALUE)
    public Profesor encontrarCedula(@PathVariable("cedula") String cedula) {
        return this.profesorService.encontrarCedula(cedula);
    }

    @DeleteMapping(path = "/{id}")
    public void borrar(@PathVariable("id") Integer id) {
    	this.profesorService.borrar(id);
          
    }
    
}
