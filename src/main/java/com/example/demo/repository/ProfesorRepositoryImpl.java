package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProfesorRepositoryImpl implements IProfesorRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Profesor profesor) {
        // TODO Auto-generated method stub
        this.entityManager.persist(profesor); 
    }

    @Override
    public Profesor buscarId(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Profesor.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        this.entityManager.remove(this.buscarId(id));
    }

    @Override
    public Profesor buscarCedula(String cedula) {
        // TODO Auto-generated method stub
        TypedQuery<Profesor> myQuery = this.entityManager.createQuery("SELECT e FROM Profesor e WHERE e.cedula > :cedula", Profesor.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
    }

    @Override
    public Profesor buscarNombre(String nombre) {
        // TODO Auto-generated method stub
        TypedQuery<Profesor> myQuery = this.entityManager.createQuery("SELECT e FROM Profesor e WHERE e.nombre > :nombre", Profesor.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
    }
    
}
