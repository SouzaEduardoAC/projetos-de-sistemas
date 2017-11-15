package aula20170406.inicioDoFactory;

public class Carro {
	private Motor motor;
	
	public Carro(Motor motor) {
		this.motor = motor;
	}
	
	public void acionarIgnição() {
		this.motor.ligar();
	}
	
	public void desligar() {
		this.motor.desligar();
	}
	
	public void trocar(Motor motor) {
		this.motor = motor;
	}
	

}
