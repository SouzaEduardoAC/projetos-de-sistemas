package aula20170420.abstractFactory;

public class Fiat implements Montadora {

	@Override
	public Autom�vel fabricarAutom�velPopular() {
		return new Uno();
	}

	@Override
	public Autom�vel fabricarAutom�velEsportivo() {
		return new Bravo();
	}

}
