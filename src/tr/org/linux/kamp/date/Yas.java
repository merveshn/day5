package tr.org.linux.kamp.date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Yas {
	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
		int year,month,day;
		System.out.println("enter your bithday as year,month,day : ");
		
		year=input.nextInt();			
		month=input.nextInt();		
		day=input.nextInt();
		
		LocalDate birthday=LocalDate.of(year, month, day);
		LocalDate today= LocalDate.now();
		
		System.out.println(ChronoUnit.DAYS.between(birthday, today));
				
	}
}

