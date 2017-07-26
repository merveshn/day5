package tr.org.linux.kamp.StudentException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		Student st=new Student();
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("enter name:");
			st.name=input.nextLine();
			
			System.out.println("enter id number: ");
			st.number=input.nextLine();
			st.idControl(st.number);
			
			System.out.println("enter grade: ");
			st.grade=input.nextInt();
			st.gradeControl(st.grade);
		}
		catch(InputMismatchException e){
			System.out.println("type mismatch");
		}
		

	}
}
