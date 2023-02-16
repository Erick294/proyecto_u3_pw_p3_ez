package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
    
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    public void registrar(Estudiante estudiante) {
        this.estudianteRepository.insertar(estudiante);
        
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
        
    }

    @Override
    public Estudiante encontrar(Integer id) {
        return this.estudianteRepository.buscar(id);
    }

    @Override
    public void borrar(Integer id) {
        this.estudianteRepository.eliminar(id);
        
    }

    @Override
    public Estudiante encontrarNombre(String nombre) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarNombre(nombre);
    }

    @Override
    public Estudiante encontrarApellido(String apellido) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarNombre(apellido);
    }

    @Override
    public List<Estudiante> encontrarTodos() {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarTodos();
    }

    @Override
    public List<Estudiante> encontrarTodosSalario(BigDecimal salario) {
        // TODO Auto-generated method stub
        return this.estudianteRepository.buscarTodosSalario(salario);
    }

    @Override
    public List<EstudianteTo> encontrarTodosTo() {
        // TODO Auto-generated method stub
        List<Estudiante> lista = this.estudianteRepository.buscarTodos();
        List<EstudianteTo> listaTo = lista.stream().map(estudiante -> 
                                                            this.convertir(estudiante)).collect(Collectors.toList());
        return listaTo;
    }

    private EstudianteTo convertir(Estudiante est){
        EstudianteTo estu = new EstudianteTo();
        estu.setId(est.getId());
        estu.setApellido(est.getApellido());
        estu.setFechaNacimiento(est.getFechaNacimiento());
        estu.setNombre(est.getNombre());
        return estu;
    }
  
}
