package data_java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		LocalDate animeFriends = LocalDate.of(2022, Month.JULY, 10);
		System.out.println(animeFriends);
		
		Period periodo = Period.between(data, animeFriends);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		
		System.out.println("Faltam " + meses + " meses e " + dias + " dias para o Anime Friends!");
		
		LocalDate novaData = animeFriends.minusDays(1);
		System.out.println(novaData);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
		System.out.println(dtf.format(novaData));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'as' hh:mm");
		LocalDateTime dataAgora = LocalDateTime.now().plusHours(3);
		System.out.println(dataAgora.format(dtf2));
	}
}
