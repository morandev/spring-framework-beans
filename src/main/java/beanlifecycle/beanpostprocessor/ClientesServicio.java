package beanlifecycle.beanpostprocessor;

public class ClientesServicio {
	
	private String mensaje;
	
	public ClientesServicio() {}
	
	public ClientesServicio(String mensaje) {
		this.mensaje = mensaje;
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
