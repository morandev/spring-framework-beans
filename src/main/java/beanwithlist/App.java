package beanwithlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithcollections.xml");
		
		Provincia p = (Provincia) appContext.getBean("Sevilla");
		
		System.out.println(p);
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
	
}
