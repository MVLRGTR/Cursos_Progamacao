package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data1 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-03-27");
		LocalDateTime d05 = LocalDateTime.parse("2025-03-27T22:28:30");
		Instant d06 = Instant.parse("2025-03-27T22:30:30Z");
		Instant d07 = Instant.parse("2025-03-27T22:30:30-03:00");
		
		LocalDate d08 = LocalDate.parse("27/03/2025",fmt1); //crio a formatção para fazer o parse
		LocalDateTime d09 = LocalDateTime.parse("27/03/2025 01:30",fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 :"+d01);
		System.out.println("d02 :"+d02);
		System.out.println("d03 :"+d03);//Horario GMT Zulu
		System.out.println("d04 :"+d04);
		System.out.println("d05 :"+d05);
		System.out.println("d06 :"+d06);
		System.out.println("d07 :"+d07);
		System.out.println("d08 :"+d08);
		System.out.println("d09 :"+d09);
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}

}
