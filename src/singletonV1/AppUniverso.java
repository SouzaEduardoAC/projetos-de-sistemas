package aula20170309.singletonV1;

import java.util.ArrayList;
import java.util.List;

public class AppUniverso {
	
	public static void main(String[] args) {
		
		System.out.println( "Teste".toUpperCase() );
		
		List<Universo> universos = new ArrayList<>();
		
		new Universo();
		
		//Universo.contador = -1000;
		
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		new Universo();
		
	}

	private static void listarUniversos(List<Universo> universos) {
		for (Universo universo : universos) {
			System.out.println(universo);
		}
	}

}
