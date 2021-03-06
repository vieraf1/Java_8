package adapter;

import domain.Conta;

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

	public Conta getElemento(int pos) {
		if(pos >= posicao) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		return contas[pos];
	}

}
