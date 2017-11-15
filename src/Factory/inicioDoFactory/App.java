package aula20170406.inicioDoFactory;

public class App {
	
	
	public static void main(String[] args) {
		
		Motor m1 = new Elétrico();
		
		Carro carroNovo = new Carro(m1);
		carroNovo.acionarIgnição();
		carroNovo.desligar();
		
		Motor m2 = new Combustão();
		carroNovo.trocar(m2);
		carroNovo.acionarIgnição();
		carroNovo.desligar();
		
		
	}
	
	

}
