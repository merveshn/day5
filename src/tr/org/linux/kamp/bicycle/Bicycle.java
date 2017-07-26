package tr.org.linux.kamp.bicycle;

public class Bicycle {

	private int gear;
	private int speed;
	private String color;
	
	public void changeSpeed(int a) {
		speed+=a;
	}
	
	public void changeGear(int a) {
		gear+=a;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
}
