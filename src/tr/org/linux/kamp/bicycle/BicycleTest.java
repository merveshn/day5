package tr.org.linux.kamp.bicycle;

public class BicycleTest {

	public static void main(String[] args) {
		

	MountainBicycle mb=new MountainBicycle();
	
	mb.setGear(1);
	mb.setSpin(10);
	mb.setColor("blue");
	mb.setSpeed(10);	
	System.out.println(mb.getColor());
	System.out.println(mb.getGear());
	System.out.println(mb.getSpeed());
	System.out.println(mb.getSpin());
	
	mb.changeGear(2);
	mb.changeSpin(10);
	
	System.out.println(mb.getColor());
	System.out.println(mb.getGear());
	System.out.println(mb.getSpeed());
	System.out.println(mb.getSpin());
	}	
}
