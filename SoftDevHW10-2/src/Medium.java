
public class Medium implements Fighter {
	private int health;
	private int attack;
	private int speed;

	public Medium(int health, int attack, int speed) {
		this.health = health;
		this.attack = attack;
		this.speed = speed;
	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	public String getStat() {
		// TODO Auto-generated method stub
		String ans = "Health: " + health + "\nAttack: " + attack + "\nSpeed: " + speed;
		return ans;
	}

}
