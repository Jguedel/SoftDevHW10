
public interface Fighter {
	int getHealth();
	int getAttack();
	int getSpeed();
	void setStat( int health, int attack, int speed);
	String getStat();
}
