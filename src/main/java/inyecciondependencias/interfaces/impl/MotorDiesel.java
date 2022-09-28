package inyecciondependencias.interfaces.impl;

import inyecciondependencias.interfaces.IMotor;

public class MotorDiesel implements IMotor{
	
	private int currentRPM;
	
	@Override
	public void acelerar() {
		/*
		 * realizarAdmision()
		 * realizarCompresion()   //motores diesel
		 * realizarCombustion()
		 * realizarEscape()
		 */
	}
	
	 @Override
	public int getRevoluciones() {
		return 0;
	}
}
