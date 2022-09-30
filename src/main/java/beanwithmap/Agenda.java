package beanwithmap;

import java.util.Map;

public class Agenda {
	private Map<String, Contacto> contactos;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(Map<String, Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	public Map<String, Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Map<String, Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + "]";
	}
	
}
