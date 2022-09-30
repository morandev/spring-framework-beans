package beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beansscopes.xml");

		/**
		 *  1. nuestra clase Mundo tiene comentado el metodo toString
		 *  esto es, para que al imprimirlos por consola
		 *  podamos comparar si se trata del mismo objeto o no
		 *   asi poder evidenciar los diferentes bean scopes
		 *   
		 *  2. en estos ejemplos solo se prueba el scope por defecto y el
		 *  scope prototype, ya que otros scopes dependen del modulo
		 *  Spring MVC
		 */
		Mundo m1 = appContext.getBean( "mundo", Mundo.class );
		Mundo m2 = appContext.getBean( "mundo", Mundo.class );
		
		/**
		 *  default scope - singleton
		 *  
		 *  When we define a bean with the singleton scope, the container creates
		 *  a single instance of that bean; all requests for that bean name will 
		 *  return the same object, which is cached. 
		 *  Any modifications to the object will be reflected in all references 
		 *  to the bean. This scope is the default value if no other scope is 
		 *  specified.
		 *  
		 *  scope - prototype
		 *  
		 *  A bean with the prototype scope will return a different instance every 
		 *  time it is requested from the container. 
		 *  It is defined by setting the value prototype to the scope property
		 *  in the bean definition.
		 *  
		 */
		System.out.println( m1 );
		System.out.println( m2 );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
	
}
