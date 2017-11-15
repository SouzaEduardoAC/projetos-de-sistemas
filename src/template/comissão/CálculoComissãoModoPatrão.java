package aula20170517.template.comiss�o;

import java.util.Calendar;

public class C�lculoComiss�oModoPatr�o extends C�lculoDeComiss�o {
	private final double VALOR_M�NIMO = 800.00;

	@Override
	public double obterPercentualComiss�o() {
		return 0.025;
	}

	@Override
	public double descontarValorM�nimo(double valorTotalVendido) {
		if (valorTotalVendido <= VALOR_M�NIMO) {
			return 0.00;
		}
		return valorTotalVendido - VALOR_M�NIMO;
	}

	@Override
	public Calendar obterCalend�rioOficialDaEmpresa() {
		// TODO Auto-generated method stub
		return null;
	}

}
