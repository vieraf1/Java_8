package test;

import java.util.ArrayList;
import java.util.List;

import domain.Conta;
import domain.ContaCorrente;

public class TesteLambda {

	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>(2);
		
		Conta cc1 = new ContaCorrente(22,33);
		cc1.deposita(333);
	
		Conta cc2 = new ContaCorrente(22,44);
		cc2.deposita(444);
		
		Conta cc3 = new ContaCorrente(22,11);
		cc3.deposita(111);
		
		Conta cc4 = new ContaCorrente(22,22);
		cc4.deposita(222);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
//		lista.sort(new Comparator<Conta>() {
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				return Double.compare(c1.getSaldo(), c2.getSaldo());
//			}
//		});
		
//		lista.sort(	(Conta c1, Conta c2) -> {
//				return Double.compare(c1.getSaldo(), c2.getSaldo());
//			}
//		);
		
//		lista.sort(	
//				(Conta c1, Conta c2) -> Double.compare(c1.getSaldo(), c2.getSaldo())
//		);
		
		lista.sort(	(c1, c2) -> Double.compare(c1.getSaldo(), c2.getSaldo()) );
		
		lista.forEach(c -> System.out.println(c.getSaldo()) );
		
//		for(Conta c : lista) {
//			System.out.println(c.getSaldo());
//		}
	}
	
}