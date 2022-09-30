package beanlifecycle.withinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 	Spring framework provides the following ways for controlling 
 * 	life cycle events of a bean: 
 * 	
 * 		InitializingBean and DisposableBean callback interfaces
 * 
 */
public class ClientesServicio implements InitializingBean, DisposableBean {
	
	private String mensaje;
	
	public ClientesServicio() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ClientesServicio(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	
	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * 
	 * The org.springframework.beans.factory.InitializingBean interface 
	 * allows a bean to perform initialization work after 
	 * all necessary properties on the bean have been set by the container.
	 * 
	 * The afterPropertiesSet() method is not a preferable way to initialize 
	 * the bean because it tightly couples the bean class with the spring container.
	 *  
	 *  A better approach is to use “init-method” attribute in bean definition 
	 *  in beanslifecycle.xml or another xml file.
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet: me ejecuto despues del inicio");
		System.out.println("afterPropertiesSet: aqui mensaje vale: " +mensaje);
	}

	/**
	 * implementing the org.springframework.beans.factory.DisposableBean interface
	 * allows a bean to get a callback before the Spring container destroys the bean.
	 */
	public void destroy() throws Exception {
		System.out.println("destroy: me ejecuto antes del final");
		System.out.println("destroy: aqui mensaje vale: " +mensaje);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
