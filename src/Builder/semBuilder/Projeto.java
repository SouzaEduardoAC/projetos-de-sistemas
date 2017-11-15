package aula20170323.semBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	private String descricao;
	private String nome;
	private Date inicio;
	private Date previsaoDeTermino;
	private Double valorMaximo;
	private List<Pessoa> membros = new ArrayList<>();
	private List<String> etapas = new ArrayList<>();
	
	
	public Projeto() {
	}

	public Projeto(String nome, String descricao, Date inicio, Double valorMaximo, Date previsaoDeTermino) {
		if (nome == null || descricao == null || inicio == null) {
			throw new RuntimeException("Nome, descrição e início não podem ser nulos!");
		}
		if (valorMaximo != null && previsaoDeTermino == null) {
			throw new RuntimeException("Quando definido valor máximo, deve-se definir previsão de término!");
		}
		this.nome = nome;
		this.descricao = descricao;
		this.inicio = inicio;
		this.valorMaximo = valorMaximo;
		this.previsaoDeTermino = previsaoDeTermino;
	}

	public Projeto(ParâmetrosParaCriarProjeto parâmetrosParaCriarProjeto) {
		this(parâmetrosParaCriarProjeto.descricao, 
			parâmetrosParaCriarProjeto.nome, 
			parâmetrosParaCriarProjeto.previsaoDeTermino,
			parâmetrosParaCriarProjeto.valorMaximo, 
			parâmetrosParaCriarProjeto.inicio 
			);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getInicio() {
		return inicio;
	}


	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}


	public Date getPrevisaoDeTermino() {
		return previsaoDeTermino;
	}


	public void setPrevisaoDeTermino(Date previsaoDeTermino) {
		this.previsaoDeTermino = previsaoDeTermino;
	}


	public Double getValorMaximo() {
		return valorMaximo;
	}


	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}


	public List<Pessoa> getMembros() {
		return membros;
	}


	public void setMembros(List<Pessoa> membros) {
		this.membros = membros;
	}


	public List<String> getEtapas() {
		return etapas;
	}


	public void setEtapas(List<String> etapas) {
		this.etapas = etapas;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
