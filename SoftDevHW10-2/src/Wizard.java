
public class Wizard implements StyleAdapter {
	private Fighter f;

	public Wizard(Fighter fighter) {
		this.f = fighter;
	}

	public String getSkills() {
		// TODO Auto-generated method stub
		return Stats();
	}

	private String Stats() {
		return ("Health: " + f.getHealth() + "\nAttack: " + f.getAttack() + "\nSpeed: " + f.getSpeed()
				+ "\nSpecial abilities: " + "Hell fire, Heal, Charm");
	}

}
