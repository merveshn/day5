package tr.org.linux.kamp.date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {

	public static void testLocalDateTime() {
		LocalDateTime currentTime=LocalDateTime.now();//static olduğu için objesi classtan çekebiliyoruz.
		LocalDate currentDate=LocalDate.now();
		System.out.println("current time:" + currentTime);
		System.out.println("current date:" + currentDate);
		
		Month month= currentTime.getMonth();
		
		int day=currentTime.getDayOfMonth();
		
		int second= currentTime.getSecond();
		System.out.println("ay: " + month +"gün:" + day+ "saniye:" +second);
		
		LocalDateTime timeex=currentTime.withDayOfMonth(8).withYear(2017);
		LocalDate dateex= LocalDate.of(2017, Month.JULY, 8);
		System.out.println("date ex: " + dateex);
		
		
		
	}
	
	public static void main(String[] args) {
		testLocalDateTime();
	}
}
