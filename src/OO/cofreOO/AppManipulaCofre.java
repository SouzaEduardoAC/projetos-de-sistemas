package aula20170316.cofreOO;

public class AppManipulaCofre {	
	
	public static void main(String[] args) {
		Cofre cofre01 = new Cofre();
		System.out.println("Cofre aberto? " + cofre01.est·Aberto());
		
		cofre01.fechar("senhaBoa");
		System.out.println("Cofre fechado? " + cofre01.est·Fechado());
		
		cofre01.abrir("senhaBoa");
		System.out.println("Cofre aberto? " + cofre01.est·Aberto());
	}
}
