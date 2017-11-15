package aula20170323.comBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	public static void main(String[] args) throws ParseException {
		
		String nome = "Clóvis";
		
		String outra = nome.toLowerCase().toUpperCase().toLowerCase().toUpperCase().replace('s', 'x').substring(0,3);
			
		Projeto escolaDeTI2019 = (new Projeto.ProjetoBuilder())
				.nome("Escola de TI 2019")
				.inicio(new Date())
				.descricao("Projeto integrador dos cursos de TI UniCesumar")
				.build();
		
		System.out.println(escolaDeTI2019);
		
		
		
	}

}

