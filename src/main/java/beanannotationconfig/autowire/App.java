package beanannotationconfig.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanannotationconfig.beans.Mundo;


public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithannotationconfig.xml");
		
		Mundo m = appContext.getBean("mundo", Mundo.class);
		
		System.out.println( m.getSaludo() );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
	
}
