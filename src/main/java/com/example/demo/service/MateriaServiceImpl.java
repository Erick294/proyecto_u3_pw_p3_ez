package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaTo;

@Service
public class MateriaServiceImpl implements IMateriaService{

    @Autowired
    private IMateriaRepository materiaRepository;

    @Override
    public List<MateriaTo> encontrarTodosTo(Integer id) {
        // TODO Auto-generated method stub
        List<Materia> lista = this.materiaRepository.buscarPorEstudiante(id);
        List<MateriaTo> listaTo = lista.stream().map(materia -> 
                                                            this.convertir(materia)).collect(Collectors.toList());
        return listaTo;
    }

    private MateriaTo convertir(Materia mat){
        MateriaTo mate = new MateriaTo();
        mate.setCreditos(mat.getCreditos());
        mate.setId(mat.getId());
        mate.setNombre(mat.getNombre());
        return mate;
    }

    @Override
    public MateriaTo encontrar(Integer id) {
        // TODO Auto-generated method stub
        return this.convertir(this.materiaRepository.buscarPorIdMateria(id));
    }
    
}
