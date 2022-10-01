package beanannotationconfig.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAutowire {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("introspring/beanswithannotationconfig.xml");
		
		Poblacion p1 = appContext.getBean("sevillacapital", Poblacion.class);
		Poblacion p2 = appContext.getBean("mairenaAljarafe", Poblacion.class);
		
		System.out.println( p1 );
		System.out.println( p2 );
		
		Cliente c = appContext.getBean("cliente", Cliente.class);
		
		System.out.println("cliente: " + c );
		
		( (ConfigurableApplicationContext) appContext ).close();
	}
}
