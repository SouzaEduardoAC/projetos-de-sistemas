package aula20170406.inicioDoFactory;

public class Elétrico extends Motor {

	@Override
	public void ligar() {
		System.out.println("[Motor Elétrico] ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("[Motor Elétrico] desligando.");
	}
	

}
