package beanwithset;

import java.util.Set;

public class Alumno {
	private String nombre;
	private Set<Nota> notas;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, Set<Nota> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notas=" + notas + "]";
	}
}
