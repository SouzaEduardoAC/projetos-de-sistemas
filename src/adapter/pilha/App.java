package aula20170517.adapter.pilha;

import aula20170509.composite.pilha.Lanterna;
import aula20170509.composite.pilha.Pilha;
import aula20170509.composite.pilha.PilhaComum;

public class App {
	
	public static void main(String[] args) {
		Lanterna minha = new Lanterna();
		
		Pilha pilhaNovaRayovac = new PilhaComum();
		Pilha adaptador = new AdaptadorDeC�lulaParaPilha( new C�lulaDeCombust�vel() );
		
		minha.instalarPilhas(pilhaNovaRayovac, adaptador);
		minha.ligar();
		
	}

}
