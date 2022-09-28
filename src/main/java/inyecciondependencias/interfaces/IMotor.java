package inyecciondependencias.interfaces;

public interface IMotor {
	
	/**
	 * 
	 * para desacoplar mas aun el codigo java nos permite usar interfaces
	 * 
	 * esta interfaces define los metodos de los motores
	 * 
	 */
	void acelerar();
	int getRevoluciones();
}
