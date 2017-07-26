package tr.org.linux.kamp.bicycle;

public class MountainBicycle extends Bicycle {
	private int spin;

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}

	public void changeSpin(int a) {
		spin+=a;
	}
}

