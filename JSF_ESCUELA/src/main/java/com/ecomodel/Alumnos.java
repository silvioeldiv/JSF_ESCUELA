package com.ecomodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumnos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long idalumnos;
	@Column
	
	private String nombre;
	@Column
	
	private String apellido;
	@Column
	
	private int edad;
	@Column
	
	private String telefono;
	@Column

	public long getIdalumnos() {
		return idalumnos;
	}

	public void setIdalumnos(long idalumnos) {
		this.idalumnos = idalumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumnos [idalumnos=" + idalumnos + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", telefono=" + telefono + "]";
	}
	
	
   
}
