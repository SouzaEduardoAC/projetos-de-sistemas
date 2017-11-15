package aula20170509.composite.pilha;

import java.util.ArrayList;
import java.util.List;

public class PilhaComposta implements Pilha {
	private List<Pilha> pilhas = new ArrayList<>();
	
	
	//+ instalarPilha(pilha : Pilha) : void
	public void instalarPilha(Pilha pilha) {
		if (pilha == null) {
			throw new RuntimeException("Pilha n�o pode ser nula!");
		}
		if (this.pilhas.contains(pilha)) {
			throw new RuntimeException("Pilha j� instalada!");
		}
		this.pilhas.add(pilha);
	}

	@Override
	public void produzirCorrenteEl�trica() {
		// TODO Auto-generated method stub

	}

}
