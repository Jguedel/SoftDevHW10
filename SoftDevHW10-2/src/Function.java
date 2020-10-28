
public class Function {
	private static String ans;

	public static String Stats(String type, String style) {
		String typeCheck = type.toString();
		if (typeCheck.equals("Small")) {
			Small user = new Small(50, 10, 20);
			if (style.equals("Wizard")) {
				Wizard wizard = new Wizard(user);
				ans = wizard.getSkills();
			} else if (style.equals("Archer")) {
				Archer archer = new Archer(user);
				ans = archer.getSkills();
			} else
				ans = user.getStat() +"\nno special skills";
		} else if (typeCheck.equals("Medium")) {
			Medium user = new Medium(100, 15, 1);
			if (style.equals("Wizard")) {
				Wizard wizard = new Wizard(user);
				ans = wizard.getSkills();
			} else if (style.equals("Archer")) {
				Archer archer = new Archer(user);
				ans = archer.getSkills();
			} else
				ans = user.getStat() +"\nno special skills";
			
		} else if (typeCheck.equals("Large")) {
			Large user = new Large(125, 10, 5);
			if (style.equals("Wizard")) {
				Wizard wizard = new Wizard(user);
				ans = wizard.getSkills();
			} else if (style.equals("Archer")) {
				Archer archer = new Archer(user);
				ans = archer.getSkills();
			} else
				ans = user.getStat() +"\nno special skills";
		}
		
		return ans;
	}
}
