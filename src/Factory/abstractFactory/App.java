package aula20170420.abstractFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Montadora montadoraContratada = MontadoraFactory.criarMontadora();

		List<Automóvel> frota = new ArrayList<>();
		frota.addAll(comprarPopulares(10, montadoraContratada));
		frota.addAll(comprarEsportivos(15, montadoraContratada));
		
		System.out.println(frota.size());
		
		//frota.stream().forEach(auto -> System.out.println(auto.toString()));		
		for (Automóvel auto : frota) {
			System.out.println(auto.toString());
		}
	}

	private static List<Automóvel> comprarPopulares(int quantidade, Montadora montadoraContratada) {
		List<Automóvel> automóveis = new ArrayList<Automóvel>();
		
		for (int i = 0; i < quantidade; i++) {
			automóveis.add(montadoraContratada.fabricarAutomóvelPopular());
		}
		
		return automóveis;
	}

	private static List<Automóvel> comprarEsportivos(int quantidade, Montadora montadoraContratada) {
		List<Automóvel> automóveis = new ArrayList<Automóvel>();
		
		for (int i = 0; i < quantidade; i++) {
			automóveis.add(montadoraContratada.fabricarAutomóvelEsportivo());
		}
		
		return automóveis;
	}
}
