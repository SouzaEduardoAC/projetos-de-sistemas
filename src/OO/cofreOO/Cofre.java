package aula20170316.cofreOO;

import javax.management.RuntimeErrorException;

public class Cofre {
	private boolean aberto;
	private String senha;
	
	public Cofre() {
		this.aberto = true;
		this.senha = null;
	}

	public void fechar(String senha) {
		if (est·Fechado()) {
			throw new RuntimeException("N„o pode fechar cofre j· fechado!");
		}
		this.aberto = false;
		this.senha = senha;
	}
	public void abrir(String senha) {
		if (est·Aberto()) {
			throw new RuntimeException("N„o pode abrir cofre j· aberto!");
		}
		if (this.senha.equals(senha)) {
			this.aberto = true;
			this.senha = null;
		} else {
			throw new RuntimeException("Senha incorreta!");
		}
	}
	public boolean est·Aberto() {
		return this.aberto;
	}
	public boolean est·Fechado() {
		return !est·Aberto();
	}
	
}
