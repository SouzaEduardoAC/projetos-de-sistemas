package aula20170406.inicioDoFactory;

public class El�trico extends Motor {

	@Override
	public void ligar() {
		System.out.println("[Motor El�trico] ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("[Motor El�trico] desligando.");
	}
	

}
