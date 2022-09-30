package beanwithprops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithprops.xml");
		
		ConexionBaseDeDatos mysql, oracle;
		
		mysql = (ConexionBaseDeDatos) appContext.getBean("oracle");
		oracle = (ConexionBaseDeDatos) appContext.getBean("mysql");
		
		System.out.println( mysql );
		System.out.println( oracle );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
}
