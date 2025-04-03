package data_hora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class SomaData {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2025-04-03");
		LocalDate d02 = LocalDate.parse("2025-02-03");
		LocalDateTime localNow = LocalDateTime.now();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		LocalDate pastWeekTime = d01.minusDays(7);
		LocalDate nextWeekTime = d01.plusDays(1);
		System.out.println("pastWeek "+pastWeekTime);
		System.out.println("nextWeek "+nextWeekTime);
		
		LocalDateTime nextYear = localNow.plusMonths(12);
		LocalDateTime lastYear = localNow.minusMonths(12);
		System.out.println("next year "+nextYear.format(fmt1));
		System.out.println("last year "+lastYear.format(fmt1));
		
		Duration t1 = Duration.between(nextYear, lastYear);
		System.out.println("Duration t1: "+t1.toDays());
		
		Duration t2 = Duration.between(d02.atTime(0,0),localNow); //preciso converter o localDate para um LocalDateTime por causa dos segundos
		System.out.println("Duration t2: "+t2.toDays());
		
		Duration t3 = Duration.between(d01.atStartOfDay(),d02.atStartOfDay());
		System.out.println(t3.toDays());
		
		
	}

}
