package beanscopes;

public class Mundo {

	private String saludo;
	private int radio;

	public Mundo() {}

	public Mundo(String saludo, int radio) {
		super();
		this.saludo = saludo;
		this.radio = radio;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

//	@Override
//	public String toString() {
//		return "Mundo [saludo=" + saludo + ", radio=" + radio + "]";
//	}

}
