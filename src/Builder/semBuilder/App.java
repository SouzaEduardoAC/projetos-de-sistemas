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

		
//		Projeto escolaDeTI2018 = new Projeto(descricao: "Projeto integrador dos cursos de TI UniCesumar", nome: "Escola de TI 2018", in�cio: new Date());

//		Projeto escolaDeTI2016 = new Projeto("Projeto integrador dos cursos de TI UniCesumar", "Escola de TI 2016", new Date());		
		
		Par�metrosParaCriarProjeto par�metrosParaCriarProjeto = new Par�metrosParaCriarProjeto();
		par�metrosParaCriarProjeto.nome = "Escola de TI 2018";
        par�metrosParaCriarProjeto.descricao = "Projeto integrador dos cursos de TI UniCesumar";
		par�metrosParaCriarProjeto.inicio = new Date();
		par�metrosParaCriarProjeto.valorMaximo = 89000.00;
		//par�metrosParaCriarProjeto.previsaoDeTermino = (new SimpleDateFormat("dd/MM/yyyy")).parse("13/12/2017");
		
		Projeto escolaDeTI2019 = new Projeto(par�metrosParaCriarProjeto);
		
		System.out.println("Foi.");
		
		
		
	}

}

