package aula20170517.adapter.pilha;

import aula20170509.composite.pilha.Pilha;

public class AdaptadorDeC�lulaParaPilha implements Pilha {

	private C�lulaDeCombust�vel c�lulaDeCombust�vel;

	public AdaptadorDeC�lulaParaPilha(C�lulaDeCombust�vel c�lulaDeCombust�vel) {
		if (c�lulaDeCombust�vel == null) {
			throw new RuntimeException("Uma c�lula de combust�vel deve ser definida!");
		}
		this.c�lulaDeCombust�vel = c�lulaDeCombust�vel;
	}

	@Override
	public void produzirCorrenteEl�trica() {
		this.c�lulaDeCombust�vel.energizar();
	}

}
