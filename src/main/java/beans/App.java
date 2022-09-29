package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 * vamos a usar el contenedor de inversion de control 
		 * para invocar
		 * 
		 * la interfaz que nos comunica con el contenedor se llama
		 * ApplicationContext
		 */
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beans.xml");
		
		/*
		 * obtenemos un bean con el metodo getbean
		 * 	a traves del .class de nuestra clase
		 *  o a traves del id que le dimos en el archivo beans.xml
		 */
		
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println("Hola mundo desde un bean!");
		System.out.println(m.getMensaje());
		 
		/*
		 * al finalizar el flujo de la app
		 * lo que debemos hacer es cerrar el
		 * contenedor de Inversion de Control
		 */
		( (ConfigurableApplicationContext) appContext ).close();
//		( (ClassPathXmlApplicationContext) appContext ).close();
	}
	
}
