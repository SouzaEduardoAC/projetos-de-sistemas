package aula20170517.template.comiss�o;

import java.util.Calendar;

public class C�lculoComiss�oCamaradaPlus extends C�lculoDeComiss�o {

	@Override
	public double obterPercentualComiss�o() {
		return 0.10;
	}

	@Override
	public double descontarValorM�nimo(double valorTotalVendido) {
		return valorTotalVendido;
	}

	@Override
	public Calendar obterCalend�rioOficialDaEmpresa() {
		// TODO Auto-generated method stub
		return null;
	}

}
