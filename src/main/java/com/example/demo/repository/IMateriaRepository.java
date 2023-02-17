package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
    public List<Materia> buscarPorEstudiante(Integer id);
    public Materia buscarPorIdMateria(Integer id);
}
