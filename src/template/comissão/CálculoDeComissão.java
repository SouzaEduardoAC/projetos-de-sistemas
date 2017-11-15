package aula20170517.template.comiss�o;

import java.util.Calendar;

public abstract class C�lculoDeComiss�o {
	
	//Template Method
	public double calcular(double valorTotalVendido) {
		Calendar c = obterCalend�rioOficialDaEmpresa();
		//Faria alguma coisa com as datas do calend�rio e tal...
		double baseDeC�lculo = descontarValorM�nimo(valorTotalVendido);
		double comiss�o = baseDeC�lculo * obterPercentualComiss�o();
		return comiss�o;
	}

	public abstract Calendar obterCalend�rioOficialDaEmpresa();

	public abstract double obterPercentualComiss�o();

	public abstract double descontarValorM�nimo(double valorTotalVendido);

}
