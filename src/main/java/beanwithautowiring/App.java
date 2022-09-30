package beanwithautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beansautowiring.xml");

		Cliente c1 = appContext.getBean("cliente", Cliente.class);
		System.out.println( c1 );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
	
}
