package beanwithlist;

import java.util.List;

public class Provincia {
	private String nombre;
	private List<Poblacion> poblaciones;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public Provincia(String nombre, List<Poblacion> poblaciones) {
		super();
		this.nombre = nombre;
		this.poblaciones = poblaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Poblacion> getPoblaciones() {
		return poblaciones;
	}

	public void setPoblaciones(List<Poblacion> poblaciones) {
		this.poblaciones = poblaciones;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", poblaciones=" + poblaciones + "]";
	}
	
	
}
