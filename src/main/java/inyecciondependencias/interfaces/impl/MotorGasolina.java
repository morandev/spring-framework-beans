package inyecciondependencias.interfaces.impl;

import inyecciondependencias.interfaces.IMotor;

public class MotorGasolina implements IMotor{
	
	private int currentRPM;
	
	public void acelerar() {
		/*
		 * realizarAdmision()
		 * realizarCompresion()   //motores gasolina
		 * realizarExplosion()
		 * realizarEscape()
		 */
	}
	
	public int getRevoluciones() {
		return currentRPM;
	}
}
