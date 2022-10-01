package beanannotationconfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * Spring 2.5 introduces further stereotype annotations: @Component, @Service, and 
 * @Controller. @Component is a generic stereotype for any Spring-managed component. 
 * @Repository, @Service, and @Controller are specializations of @Component for more
 * specific use cases, for example, in the persistence, service, and presentation 
 * layers, respectively. Therefore, you can annotate your component classes with 
 * @Component, but by annotating them with @Repository, @Service, or @Controller 
 * instead, your classes are more properly suited for processing by tools or 
 * associating with aspects.
 * 
 * 
 *
 */
@Component
public class Mundo {
	@Value("Hello world annotations")
	private String saludo;
	
	public Mundo() {
		// TODO Auto-generated constructor stub
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	@Override
	public String toString() {
		return "Mundo [saludo=" + saludo + "]";
	}
	
}
