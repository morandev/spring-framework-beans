package beanwithmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithcollections.xml");
				
		Agenda agenda = (Agenda) appContext.getBean("agenda");
		
		System.out.println( agenda );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
	
}
