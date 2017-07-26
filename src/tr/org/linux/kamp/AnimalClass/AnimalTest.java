package tr.org.linux.kamp.AnimalClass;

public class AnimalTest {

	
	public static void main(String[] args) {
		

	Animal a=new Animal();
	
	a.setAge(3);
	a.setName("cat");
	
	System.out.println(a.getAge());
	System.out.println(a.getName());
	a.toWalk();
}
}
