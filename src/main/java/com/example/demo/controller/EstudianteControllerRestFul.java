package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@CrossOrigin()
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul{

    @Autowired
    private IEstudianteService estudianteService;

    @PostMapping
    public void registrar(@RequestBody Estudiante estudiante) {
        System.out.println("Ingresado Correctamente");
      this.estudianteService.registrar(estudiante);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Estudiante> actualizar(@PathVariable("id") Integer id, @RequestBody Estudiante estudiante, @RequestParam String provincia) {
        estudiante.setId(id);
        System.out.println("Actualizado Correctamente " +provincia);
        this.estudianteService.actualizar(estudiante);
        Estudiante est = this.estudianteService.encontrar(id);
        return ResponseEntity.status(HttpStatus.OK).body(est);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Estudiante> encontrar(@PathVariable("id") Integer id) {
        Estudiante est = this.estudianteService.encontrar(id);
        int codigo = 0;
        codigo = 230;
        return ResponseEntity.status(codigo).body(est);
        
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> encontrarTodos() {
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("detalleMensaje", "Estudiantes encontrados");
        cabeceras.add("valorCalculado", "12000000");
        List<Estudiante> lista = this.estudianteService.encontrarTodos();
        return new ResponseEntity<>(lista, cabeceras, 230);
    }

    @GetMapping(path = "/salario")
    public List<Estudiante> encontrarTodosSalario(@RequestParam("salario") BigDecimal salario) {
        return this.estudianteService.encontrarTodosSalario(salario);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public Estudiante encontrarNombre(@PathVariable("nombre") String nombre) {
        return this.estudianteService.encontrarApellido(nombre);
    }

    @GetMapping(path = "/apellido/{apellido}")
    public Estudiante encontrarApellido(@PathVariable("apellido") String apellido) {
        return this.estudianteService.encontrarApellido(apellido);
    }

    @DeleteMapping(path = "/{id}")
    public void borrar(@PathVariable("id") Integer id) {
    	this.estudianteService.borrar(id);        
    }

    @PostMapping(path = "/borrar/{id}")
    public void borrarTmp(@PathVariable("id") Integer id) {
    	this.estudianteService.borrar(id);        
    }
    
}
