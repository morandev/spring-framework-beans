package beanlifecycle.withanotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClientesServicio {
	
	private String mensaje;
	
	public ClientesServicio() {}
	
	public ClientesServicio(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	/**
	 * 
	 * We can add the default init() and destroy() methods in two ways:
	 * 		-Local definitions applicable to a single bean 
	 * 		-Global definitions applicable to all beans defined 
 * 			 in whole beans context
	 * 
	 * @throws Exception
	 */
	public void initBean() throws Exception {
		System.out.println("initBean: me ejecuto despues del inicio");
		System.out.println("initBean: aqui mensaje vale: " +mensaje);	
	}
	
	public void destroyBean() throws Exception {
		System.out.println("destroy: me ejecuto antes del final");
		System.out.println("destroy: aqui mensaje vale: " +mensaje);
	}
	
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * 
	 * From Spring 2.5 onwards, we can use the @PostConstruct and @PreDestroy annotations
	 * for specifying the bean life cycle methods.
	 * 
	 * @PostConstruct annotated method will be invoked after the bean has been 
	 * constructed using default constructor and just before it’s instance is 
	 * returned to requesting object.
	 * 
	 * @throws Exception
	 */
	@PostConstruct
	public void initBeanAnnotation() throws Exception {
		System.out.println("initBeanAnnotation: me ejecuto despues del inicio");
		System.out.println("initBeanAnnotation: aqui mensaje vale: " +mensaje);	
	}
	
	/**
	 * 	
	 * @PreDestroy annotated method is invoked just before the bean is about
	 * be destroyed inside bean container.
	 * 
	 * @throws Exception
	 */
	@PreDestroy
	public void destroyBeanAnnotation() throws Exception {
		System.out.println("destroyAnnotation: me ejecuto antes del final");
		System.out.println("destroyAnnotation: aqui mensaje vale: " +mensaje);
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
