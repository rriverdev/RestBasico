package com.rriverdev.dto;

import java.util.Date;

public class Employee {
	
	private int id;
	private String nombre;
	private String apelido1;
	private String apellido2;
	private String direccion;
	private String fechaDeRegistroStatica;
	private Date fechaDeRegistroDate;
 	
	public Employee(int id, String nombre, String apelido1, String apellido2, String direccion,
			String fechaDeRegistroStatica, Date fechaDeRegistroDate) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apelido1 = apelido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.fechaDeRegistroStatica = fechaDeRegistroStatica;
		this.fechaDeRegistroDate = fechaDeRegistroDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido1() {
		return apelido1;
	}
	public void setApelido1(String apelido1) {
		this.apelido1 = apelido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaDeRegistroStatica() {
		return fechaDeRegistroStatica;
	}

	public void setFechaDeRegistroStatica(String fechaDeRegistroStatica) {
		this.fechaDeRegistroStatica = fechaDeRegistroStatica;
	}

	public Date getFechaDeRegistroDate() {
		return fechaDeRegistroDate;
	}

	public void setFechaDeRegistroDate(Date fechaDeRegistroDate) {
		this.fechaDeRegistroDate = fechaDeRegistroDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", apelido1=" + apelido1 + ", apellido2=" + apellido2
				+ ", direccion=" + direccion + ", fechaDeRegistroStatica=" + fechaDeRegistroStatica
				+ ", fechaDeRegistroDate=" + fechaDeRegistroDate + "]";
	}
	
	

}
