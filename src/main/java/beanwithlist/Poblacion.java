package beanwithlist;

public class Poblacion {
	private String nombre;
	private int cantHab;
	
	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", cantHab=" + cantHab + "]";
	}

	public Poblacion() {
		// TODO Auto-generated constructor stub
	}

	public Poblacion(String nombre, int cantHab) {
		super();
		this.nombre = nombre;
		this.cantHab = cantHab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHab() {
		return cantHab;
	}

	public void setCantHab(int cantHab) {
		this.cantHab = cantHab;
	}
	
}
