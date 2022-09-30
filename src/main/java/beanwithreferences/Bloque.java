package beanwithreferences;

public class Bloque {
	@Override
	public String toString() {
		return "Bloque [cantidadCilindros=" + cantidadCilindros + "]";
	}

	private int cantidadCilindros;
	
	public Bloque() {}
	
	public Bloque( int cantidadCilindros ) {
		this.cantidadCilindros = cantidadCilindros;
	}
	
	public int getCantidadDeCilindros() {
		return cantidadCilindros;
	}
	
	public void setCantidadCilindros(int cantidadCilindros) {
		this.cantidadCilindros = cantidadCilindros;
	}
}
