package com.controller;


import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;



@ManagedBean
public class AlumnoBean {
	
	public String nuevo() {
		Alumno c= new Alumno();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("alumno", c);
		return  "/faces/nuevo.xhtml";
	}
	
	public String guardar (alumno cliente) {
		
		
		alumnoDAO clienteDAO= new alumnoDAO();
		alumnoDAO.guardar(cliente);
		return  "/faces/index.xhtml";
	}

	public List<Alumno> obtenerAlumnos() {
		AlumnoDAO alumnoDAO = new alumnoDAO();

		
		return alumnoDAO.obtenerAlumnos();
	}

	public String editar(Long id) {
		AlumnoDAO alumnoDAO = new alumnoDAO();
		Alumno c = new Alumno();
		c = alumnoDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(a);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("alumno", a);
		return "/faces/editar.xhtml";
	}

	public String actualizar(Alumno alumno) {
		
		
		
		
		alumnoDAO alumnoDAO = new alumnoDAO();
		alumnoDAO.editar(alumno);
		return "/faces/index.xhtml";
	}

	
	public String eliminar(Long id) {
		alumnoDAO alumnoDAO = new alumnoDAO();
		clienteDAO.eliminar(id);
		System.out.println("Alumno eliminado..");
		return "/faces/index.xhtml";
	}

}
