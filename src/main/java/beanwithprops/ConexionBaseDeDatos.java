package beanwithprops;

import java.util.Properties;

/**
 * los archivos con extension .properties
 * son aquellos que nos permiten definir
 * una serie de pares clave-valor
 * 
 * 
 * estos sirven para configurar algunos parametros
 * algunos de estos parametros pueden ser
 * los de configuracion de la conexion a una base de datos
 */
public class ConexionBaseDeDatos {
	
	private Properties properties;
	
	public ConexionBaseDeDatos() {
		// TODO Auto-generated constructor stub
	}

	public ConexionBaseDeDatos(Properties properties) {
		super();
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "ConexionBaseDeDatos [properties=" + properties + "]";
	}

}
