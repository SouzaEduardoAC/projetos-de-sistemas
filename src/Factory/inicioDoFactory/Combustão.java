package aula20170406.inicioDoFactory;

public class Combustão extends Motor {

	@Override
	public void ligar() {
		System.out.println("[Motor Combustão] ligando...");		
	}

	@Override
	public void desligar() {
		System.out.println("[Motor Combustão] desligando.");		
	}

}
