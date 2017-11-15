package aula20170420.abstractFactory;

public class Volkswagen implements Montadora {

	@Override
	public Autom�vel fabricarAutom�velPopular() {
		return new Gol();
	}

	@Override
	public Autom�vel fabricarAutom�velEsportivo() {
		return new Golf();
	}

}
