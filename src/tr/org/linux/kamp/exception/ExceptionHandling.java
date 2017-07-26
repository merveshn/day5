package tr.org.linux.kamp.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int yas=-5;
		int array[]= {3};
		
		Scanner input=new Scanner(System.in);

		try {
			
			methodA();
			if(yas<0) {
				throw new Myex();
			}
			int sayi= input.nextInt();
			array[3]=5;
			int bolum=a/b;
		}
		
		catch(InputMismatchException e) {
			
				System.out.println("mismatch");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("array hatası");
		}
		catch(ArithmeticException e){
			System.out.println("sıfıra bölme hatası");
		}
		catch(Myex e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			//burası try catchten hemen sonra çalışır
			System.out.println("burası kritik işlerin yapıldığı yer");
			
		}
		System.out.println("try-catch blogu bitti");
	
	
	
	}
	public static void methodA() throws ArithmeticException{
		System.out.println("method içerisi");
		int a=5/0;
	}
}
