package beanannotationconfig.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Cliente {
	
	private int id;
	
	@Autowired
	private Persona persona;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, Persona persona) {
		super();
		this.id = id;
		this.persona = persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", persona=" + persona + "]";
	}
	
}
