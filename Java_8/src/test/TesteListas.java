package test;

import java.util.ArrayList;

public class TesteListas {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>(2);
		lista.add("SP");
		lista.add("RJ");
		ArrayList<String> lista2 = new ArrayList(lista);
		lista.add("MG");
		
		for(String s : lista) {
			System.out.println(s);
		}
		
		System.out.println();
		
		for(String s : lista2) {
			System.out.println(s);
		}
	}

}
