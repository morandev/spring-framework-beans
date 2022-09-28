package inyecciondependencias.interfaces.impl;

import inyecciondependencias.interfaces.IMotor;

public class MotorGasolina implements IMotor{
	
	private int currentRPM;
	
	@Override
	public void acelerar() {
		/*
		 * realizarAdmision()
		 * realizarCompresion()   //motores gasolina
		 * realizarExplosion()
		 * realizarEscape()
		 */
	}
	
	 @Override
	public int getRevoluciones() {
		return currentRPM;
	}
}
