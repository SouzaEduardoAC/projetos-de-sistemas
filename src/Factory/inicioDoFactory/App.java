package aula20170406.inicioDoFactory;

public class App {
	
	
	public static void main(String[] args) {
		
		Motor m1 = new El�trico();
		
		Carro carroNovo = new Carro(m1);
		carroNovo.acionarIgni��o();
		carroNovo.desligar();
		
		Motor m2 = new Combust�o();
		carroNovo.trocar(m2);
		carroNovo.acionarIgni��o();
		carroNovo.desligar();
		
		
	}
	
	

}
