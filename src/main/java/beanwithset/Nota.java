package beanwithset;

public class Nota {
	private int nota;
	private String asignatura;
	
	public Nota() {
		// TODO Auto-generated constructor stub
	}

	public Nota(int nota, String asignatura) {
		super();
		this.nota = nota;
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Nota [nota=" + nota + ", asignatura=" + asignatura + "]";
	}
	
}
