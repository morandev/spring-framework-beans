package beanlifecycle.withanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanslifecycle.xml");
		
		ClientesServicio cs = appContext.getBean("clientesservicios", ClientesServicio.class);
		
		System.out.println( cs.getMensaje() );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
}
