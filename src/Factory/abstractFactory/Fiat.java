package aula20170420.abstractFactory;

public class Fiat implements Montadora {

	@Override
	public Automóvel fabricarAutomóvelPopular() {
		return new Uno();
	}

	@Override
	public Automóvel fabricarAutomóvelEsportivo() {
		return new Bravo();
	}

}
