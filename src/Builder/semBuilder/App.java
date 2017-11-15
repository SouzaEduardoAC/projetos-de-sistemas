package aula20170323.semBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	public static void main(String[] args) throws ParseException {
		
		Projeto escolaDeTI2017 = new Projeto();
		escolaDeTI2017.setNome("Escola de TI 2017");
		escolaDeTI2017.setDescricao("Projeto integrador dos cursos de TI UniCesumar");
		escolaDeTI2017.setInicio(new Date());
		
//		String nome = "Escola de TI 2018";
//		String descricao = "Projeto integrador dos cursos de TI UniCesumar";	
//		Projeto escolaDeTI2018 = new Projeto(descricao, nome , new Date());

		
//		Projeto escolaDeTI2018 = new Projeto(descricao: "Projeto integrador dos cursos de TI UniCesumar", nome: "Escola de TI 2018", início: new Date());

//		Projeto escolaDeTI2016 = new Projeto("Projeto integrador dos cursos de TI UniCesumar", "Escola de TI 2016", new Date());		
		
		ParâmetrosParaCriarProjeto parâmetrosParaCriarProjeto = new ParâmetrosParaCriarProjeto();
		parâmetrosParaCriarProjeto.nome = "Escola de TI 2018";
        parâmetrosParaCriarProjeto.descricao = "Projeto integrador dos cursos de TI UniCesumar";
		parâmetrosParaCriarProjeto.inicio = new Date();
		parâmetrosParaCriarProjeto.valorMaximo = 89000.00;
		//parâmetrosParaCriarProjeto.previsaoDeTermino = (new SimpleDateFormat("dd/MM/yyyy")).parse("13/12/2017");
		
		Projeto escolaDeTI2019 = new Projeto(parâmetrosParaCriarProjeto);
		
		System.out.println("Foi.");
		
		
		
	}

}

