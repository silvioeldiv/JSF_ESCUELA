package com.dao;


import java.util.ArrayList;
import java.util.List;

import com.ecomodel.jpaUtil;
import com.mysql.cj.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class AlumnoDao {
     
	EntityManagerFactory entity=(EntityManagerFactory) jpaUtil.getEntityManagerFactory().createEntityManager();
	
	
     public void guardar(Alumno alumno) {
    	 ((EntityManager) entity).getTransaction().begin();
    	 ((EntityManager) entity).persist(alumno);
    	 ((EntityManager) entity).getTransaction().commit();
    	 jpaUtil.shutdown();
     }
     public void editar(Alumno alumno) {
    	 ((EntityManager) entity).getTransaction().begin();
    	 ((EntityManager) entity).merge(alumno);
    	 ((EntityManager) entity).getTransaction().commit();
    	 jpaUtil.shutdown();
     }
     public Alumno buscar(int id) {
    	 Alumno a = new Alumno();
    	 a=((EntityManager) entity).find(Alumno.class,id);
    	 jpaUtil.shutdown();
		return a;
    	 
     }
     public List<Alumno> obtenerAlumnos(){
    	 List<Alumno> listaAlumnos= new ArrayList<>();
    	 Query q=(Query) ((EntityManager) entity).createQuery("SELECT  a FROM ALUMNO a");
    	 listaAlumnos=((jakarta.persistence.Query) q).getResultList();
		return listaAlumnos;
    	 
     }
}
