package aula20170420.abstractFactory;

public class Volkswagen implements Montadora {

	@Override
	public Automóvel fabricarAutomóvelPopular() {
		return new Gol();
	}

	@Override
	public Automóvel fabricarAutomóvelEsportivo() {
		return new Golf();
	}

}
