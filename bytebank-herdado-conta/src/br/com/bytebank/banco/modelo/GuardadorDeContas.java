package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] contas;
	private int posicao = 0;
	
	public GuardadorDeContas() {
		contas = new Conta[10];
	}
	
	public void adiciona(Conta c) {
		contas[posicao] = c;
		posicao++;
	}
	
	public int getQuantidadeEelementos() {
		return posicao;
	}

}