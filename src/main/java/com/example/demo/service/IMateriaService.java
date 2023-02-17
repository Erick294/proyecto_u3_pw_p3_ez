package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.MateriaTo;

public interface IMateriaService {

    public List<MateriaTo> encontrarTodosTo(Integer id);    
    public MateriaTo encontrar(Integer id); 
}
