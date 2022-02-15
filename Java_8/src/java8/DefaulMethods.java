package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaulMethods {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Lucas");
		lista.add("Gabriel");
		lista.add("Coelho");
		lista.add("Vieira");
		
		//lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//lista.sort(Comparator.comparing(s -> s.length()));
		lista.sort(Comparator.comparing(String::length));

		// lista.forEach(new ImprimeNaLinha());
		//lista.forEach(s -> System.out.println(s));
		lista.forEach(System.out::println);
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
