package aula20170420.abstractFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Montadora montadoraContratada = MontadoraFactory.criarMontadora();

		List<Autom�vel> frota = new ArrayList<>();
		frota.addAll(comprarPopulares(10, montadoraContratada));
		frota.addAll(comprarEsportivos(15, montadoraContratada));
		
		System.out.println(frota.size());
		
		//frota.stream().forEach(auto -> System.out.println(auto.toString()));		
		for (Autom�vel auto : frota) {
			System.out.println(auto.toString());
		}
	}

	private static List<Autom�vel> comprarPopulares(int quantidade, Montadora montadoraContratada) {
		List<Autom�vel> autom�veis = new ArrayList<Autom�vel>();
		
		for (int i = 0; i < quantidade; i++) {
			autom�veis.add(montadoraContratada.fabricarAutom�velPopular());
		}
		
		return autom�veis;
	}

	private static List<Autom�vel> comprarEsportivos(int quantidade, Montadora montadoraContratada) {
		List<Autom�vel> autom�veis = new ArrayList<Autom�vel>();
		
		for (int i = 0; i < quantidade; i++) {
			autom�veis.add(montadoraContratada.fabricarAutom�velEsportivo());
		}
		
		return autom�veis;
	}
}
