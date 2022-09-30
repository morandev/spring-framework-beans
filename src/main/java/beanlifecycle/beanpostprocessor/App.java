package beanlifecycle.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext;
		appContext = new ClassPathXmlApplicationContext("introspring/beanswithpostprocessor.xml");
		
		ClientesServicio cs = appContext.getBean("clienteservicio", ClientesServicio.class);
		Mundo m = appContext.getBean("mundo", Mundo.class);
		
		System.out.println("impresion de mensage: " + cs.getMensaje());
		System.out.println("impresion de mundo: "+m);
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
}
