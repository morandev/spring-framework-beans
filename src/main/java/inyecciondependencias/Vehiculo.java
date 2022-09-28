package inyecciondependencias;

import inyecciondependencias.interfaces.IMotor;

public class Vehiculo {
	/**
	 * 	alto acoplamiento
	 * 
	 * 	cualquier impacto en clase motor
	 * 	afectara a la clase vehiculo
	 * 
	 * 	una buena forma de desacoplar seria
	 * 	realizar la inyeccion de la dependencia motor en la clase 
	 * 	vehiculo
	 */
	private Motor m;
	
	public Vehiculo() {
		m = new Motor();
	}
	
	/**
	 * en este caso estamos desacoplando un poco el codigo
	 * utilizando inyeccion de dependencia
	 * 
	 * pero aun sige un poco acoplado que pasa si quisieramos
	 * que para algunos vehiculos el motor sea diesel y para otros
	 * gasolina
	 * 
	 * para resolver este problema java nos brinda las interfaces
	 * 
	 * 
	 * @param m
	 */
	public Vehiculo( Motor m ) {
		this.m = m;
	}
	
	private IMotor motor;
	
	public Vehiculo(IMotor motor) {
		this.motor = motor;
	}
	
	public int getRevolucionesMotor() {
		return motor.getRevoluciones();
	}
	
	public int getRevoluciones() {
		return m.getRevoluciones();
	}
}
