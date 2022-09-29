package inyecciondependencias.interfaces.impl;

import inyecciondependencias.interfaces.IMotor;

public class MotorDiesel implements IMotor{
	
	private int currentRPM;
	
	
	public void acelerar() {
		/*
		 * realizarAdmision()
		 * realizarCompresion()   //motores diesel
		 * realizarCombustion()
		 * realizarEscape()
		 */
	}

	public int getRevoluciones() {
		return currentRPM;
	}
}
