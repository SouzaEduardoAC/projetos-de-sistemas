package aula20170309.atributosStatic;

public class App {
	
	public static void main(String[] args) {
		
		Aluno[] alunos = {
				new Aluno("Maria"),
				new Aluno("Joana"),
				new Aluno("Pedro"),
				new Aluno("João")	
		};
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
