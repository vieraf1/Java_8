package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas gc = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,10);
		gc.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		gc.adiciona(cc2);

		int tamanho = gc.getQuantidadeEelementos();
		System.out.println(tamanho);
	}

}