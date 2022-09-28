package inyecciondependencias;

import inyecciondependencias.interfaces.impl.MotorDiesel;
import inyecciondependencias.interfaces.impl.MotorGasolina;

public class App {

	public static void main(String[] args) {
		
		/**
		 * al proporcionar un objeto que implemente la interface IMotor
		 * 
		 * estamos inyectando una dependencia
		 */
		Vehiculo autoDiesel = new Vehiculo( new MotorDiesel() );
		
		
		/**
		 * 
		 * esta vez inyectamos una dependencia pero de un objeto de MotorGasolina
		 * 
		 */
		Vehiculo autoNafta = new Vehiculo( new MotorGasolina() );
	}
	
}
