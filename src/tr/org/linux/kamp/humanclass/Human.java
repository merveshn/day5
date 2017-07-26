package tr.org.linux.kamp.humanclass;

public class Human {

	String name;
	int age;
	String gender;
	
	public Human() {
		System.out.println("Human object is created.");
	}
	
	public Human(String name,int age,String gender) {
		this();
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void toTalk(){
		System.out.println("to talk");
	}
	public void toSleep(){
		System.out.println("to sleep");
	}
	
	
}
