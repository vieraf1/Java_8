package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java", 10));
		cursos.add(new Curso("C", 12));
		cursos.add(new Curso("C++", 6));
		cursos.add(new Curso("SQL", 20));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(System.out::println);
		
		int soma = cursos.stream()
			.filter(c -> c.getAlunos() >= 12)
			.mapToInt(Curso::getAlunos)
			.sum();
		
		//System.out.println(soma);
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 12)
//			.findFirst()
//			.ifPresent(System.out::println);
//		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 12)
//			.findAny()
//			.ifPresent(System.out::println);
//		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 12)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
//		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 12)
//			.collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
//			.forEach((nome, alunos) -> System.out.println(nome + ": " + alunos));
		
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);
	
		
	}
}