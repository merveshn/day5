package tr.org.linux.kamp.humanclass;

public class HumanTest {

	public static void main(String[] args) {
		
		Human merve=new Human();
		
		merve.name="Merve";
		merve.age=20;
		merve.gender="female";
		
		Human melike=new Human("melike",17,"female");
		
		
		System.out.println(merve.gender);
		merve.toSleep();
	}
}
