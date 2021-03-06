package test;

import adapter.GuardadorDeContas;
import domain.Conta;
import domain.ContaCorrente;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas gc = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,11);
		gc.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		gc.adiciona(cc2);

		int tamanho = gc.getQuantidadeEelementos();
		System.out.println(tamanho);
		
		Conta ref = gc.getElemento(0);
		System.out.println(ref.getNumero());
	}

}
