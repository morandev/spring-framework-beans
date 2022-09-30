package beanwithset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithcollections.xml");
				
		Alumno almn = (Alumno) appContext.getBean("luismi");
		System.out.println( almn );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
}
