package aula20170323.comBuilder;

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
	
	
	@Override
	public String toString() {
		return "Projeto [descricao=" + descricao + ", nome=" + nome
				+ ", inicio=" + inicio + ", previsaoDeTermino="
				+ previsaoDeTermino + ", valorMaximo=" + valorMaximo
				+ ", membros=" + membros + ", etapas=" + etapas + "]";
	}

	private Projeto() {
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
	
	
	public static class ProjetoBuilder {
		private String descricao;
		private Date inicio;
		private String nome;

		public ProjetoBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public ProjetoBuilder inicio(Date inicio) {
			this.inicio = inicio;
			return this;
		}

		public ProjetoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Projeto build() {
			if (this.nome == null || this.descricao == null || this.inicio == null) {
				throw new RuntimeException("Nome, descrição e início não podem ser nulos!");
			}
			Projeto novo = new Projeto();
			novo.nome = this.nome;
			novo.descricao = this.descricao;
			novo.inicio = this.inicio;
			return novo;
		}

	}

}
