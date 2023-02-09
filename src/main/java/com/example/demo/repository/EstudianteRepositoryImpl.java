package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Estudiante estudiante) {
        // TODO Auto-generated method stub
        this.entityManager.persist(estudiante); 
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        // TODO Auto-generated method stub
        this.entityManager.merge(estudiante);
        
    }

    @Override
    public Estudiante buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Estudiante.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.entityManager.remove(this.buscar(id));
    }

    @Override
    public Estudiante buscarNombre(String nombre) {
        // TODO Auto-generated method stub
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.nombre > :nombre", Estudiante.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
    }

    @Override
    public Estudiante buscarApellido(String apellido) {
        // TODO Auto-generated method stub
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido > :apellido", Estudiante.class);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getSingleResult();
    }

    @Override
    public List<Estudiante> buscarTodos() {
        // TODO Auto-generated method stub
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("Select e FROM Estudiante e", Estudiante.class);
        return myQuery.getResultList();
    }

    @Override
    public List<Estudiante> buscarTodosSalario(BigDecimal salario) {
        // TODO Auto-generated method stub
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("Select e FROM Estudiante e WHERE e.salario >= :salario", Estudiante.class);
        myQuery.setParameter("salario", salario);
        return myQuery.getResultList();
    }
    
}
