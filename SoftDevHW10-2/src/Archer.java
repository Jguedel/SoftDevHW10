
public class Archer implements StyleAdapter {
	private Fighter f;

	public Archer(Fighter fighter) {
		this.f = fighter;
	}

	public String getSkills() {
		// TODO Auto-generated method stub
		return Stats();
	}

	private String Stats() {
		return ("Health: " + f.getHealth() + "\nAttack: " + f.getAttack() + "\nSpeed: " + f.getSpeed()
				+ "\nSpecial abilities: " + "Long shot, Explosive shot, Freezing shot");
	}

}
