package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Materia> buscarPorEstudiante(Integer id) {
        // TODO Auto-generated method stub
        TypedQuery<Materia> myQuery = this.entityManager.createQuery("Select m FROM Materia m WHERE m.estudiante.id = :id", Materia.class);
        myQuery.setParameter("id", id);
        return myQuery.getResultList();
    }

    @Override
    public Materia buscarPorIdMateria(Integer id) {
        // TODO Auto-generated method stub
        TypedQuery<Materia> myQuery = this.entityManager.createQuery("Select m FROM Materia m WHERE m.id = :id", Materia.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }
    
}
