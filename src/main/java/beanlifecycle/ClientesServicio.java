package beanlifecycle;

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


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
