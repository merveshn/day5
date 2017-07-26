package tr.org.linux.kamp.AnimalClass;

public class Animal {

	
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void toWalk() {
		System.out.println("animals can walk");
	}
}
