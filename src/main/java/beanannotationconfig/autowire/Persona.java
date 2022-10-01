package beanannotationconfig.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Persona {
	
	private String nombre;
	
	@Autowired
	/**
	 * 	@Qualifier: This Spring Framework annotation along with the @Autowired 
	 * 	is used for removing the confusion by specifying the exact bean to wire.
	 * 
	 * 	Si comentamos qualifier, obtendremos una exepcion, porque no sabra
	 * 	que bean inyectar. En nuestro archivo xml tenemos 2 beans.
	 * 
	 * 	Pero si dejasemos 1 de los dos beans poblacion en el archivo xml, no hara
	 * 	falta utilizar qualifier
	 */
	@Qualifier("mairenaAljarafe")
	private Poblacion poblacion;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Poblacion poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Poblacion getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Poblacion poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	
}
