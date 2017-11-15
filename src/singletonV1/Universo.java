package aula20170309.singletonV1;

public class Universo {
	private static int contador = 0;
	
	public Universo() {
		if (contador < 1) {
			contador++;
		} else {
			throw new RuntimeException("Não é permitido criar mais do que um Universo!");
		}
	}

}
