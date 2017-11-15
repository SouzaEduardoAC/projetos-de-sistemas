package aula20170420.abstractFactory;

public interface Montadora {
	
	//+ fabricarAutomóvelPopular() : Automóvel
	Automóvel fabricarAutomóvelPopular();

	//+ fabricarAutomóvelEsportivo() : Automóvel
	Automóvel fabricarAutomóvelEsportivo();
	
}
