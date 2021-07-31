package test;

import adapter.GuardadorDeContas;
import adapter.GuardadorObject;
import domain.Conta;
import domain.ContaCorrente;

public class TesteGuardadorObjects {

	public static void main(String[] args) {
		
		GuardadorObject gc = new GuardadorObject();
		
		Conta cc = new ContaCorrente(22,11);
		gc.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		gc.adiciona(cc2);

		int tamanho = gc.getQuantidadeEelementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) gc.getElemento(2);
		System.out.println(ref.getNumero());
	}

}
