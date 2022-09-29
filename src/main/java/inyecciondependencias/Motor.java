package inyecciondependencias;

public class Motor {
	private int revoluciones;
	
	public Motor() {
		revoluciones = 1500;
	}
	
	public void acelerar() {
		revoluciones += 100;
	}
	
	public int getRevoluciones() {
		return revoluciones;
	}
	
	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones;
	}
	
}	
