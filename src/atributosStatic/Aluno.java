package aula20170309.atributosStatic;

public class Aluno {
	private static String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	
	
	
	

}
