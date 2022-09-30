package beanwithreferences;

public class Vehiculo {
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}


	private String marca;
	private String modelo;
	private Motor motor;
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * CONSTRUCTOR
	 */
	public Vehiculo() {}

	/**
	 * CONSTRUCTOR
	 * 
	 * @param marca
	 * @param modelo
	 * @param motor
	 */
	public Vehiculo(String marca, String modelo, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	
}
