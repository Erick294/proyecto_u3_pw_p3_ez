package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IMateriaService;
import com.example.demo.service.to.MateriaTo;

@RestController
@CrossOrigin()
@RequestMapping("/materias")
public class MateriaControllerRestFul {

    @Autowired
    private IMateriaService materiaService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MateriaTo> encontrar(@PathVariable("id") Integer id) {
        MateriaTo est = this.materiaService.encontrar(id);
        int codigo = 0;
        codigo = 230;
        return ResponseEntity.status(codigo).body(est);
    }
    
}
