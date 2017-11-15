package aula20170316.cofreEstruturado;

public class AppManipulaCofre {	
	
	public static void main(String[] args) {
		Cofre cofre01 = new Cofre();
		cofre01.aberto = true;
		cofre01.senha = null;
		System.out.println("Cofre aberto? " + est·Aberto(cofre01));
		
		fechar(cofre01, "senhaBoa");
		System.out.println("Cofre fechado? " + est·Fechado(cofre01));
		cofre01.senha = "zxasdfasdfasdfasdf";
		
		abrir(cofre01, "senhaBoa");
		System.out.println("Cofre aberto? " + est·Aberto(cofre01));
	}
	
	
	
	
	
	private static void fechar(Cofre cofre, String senha) {
		cofre.aberto = false;
		cofre.senha = senha;
	}
	private static void abrir(Cofre cofre, String senha) {
		if (cofre.senha.equals(senha)) {
			cofre.aberto = true;
			cofre.senha = null;
		}
	}
	private static boolean est·Aberto(Cofre cofre) {
		return cofre.aberto;
	}
	private static boolean est·Fechado(Cofre cofre) {
		return !est·Aberto(cofre);
	}
}
