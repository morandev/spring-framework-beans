package beanwithreferences;

public class Culata {
	@Override
	public String toString() {
		return "Culata [cantidadBujias=" + cantidadBujias + "]";
	}

	private int cantidadBujias;
	
	/**
	 * CONSTRUCTOR
	 */
	public Culata() {}
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param cantidadBujias
	 */
	public Culata(int cantidadBujias) {
		this.cantidadBujias = cantidadBujias;
	}
	
	public int getCantidadBujias() {
		return cantidadBujias;
	}
	
	public void setCantidadBujias(int cantidadBujias) {
		this.cantidadBujias = cantidadBujias;
	}
}
