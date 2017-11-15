package aula20170309.singletonV2;

public class Universo {
	private static Universo theUniverse;
	
	private Universo() {
	}
	
	public static Universo obterUniverso() {
		if (theUniverse == null) {
			theUniverse = new Universo();
		}
		return theUniverse;
	}

}
