package warriors.engine;

public class SwordCase extends WeaponWarriorCase {

	SwordCase() {
		super("LightSaber", 5);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous trouvez un "+WeaponWarriorCase.sword.name+" qui vous donne  "+WeaponWarriorCase.sword.dmgs+" Dmgs";
}
}
