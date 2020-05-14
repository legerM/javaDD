package warriors.engine;

public class LightningCase extends WeaponWarriorCase {

	LightningCase() {
		super("Lightning Bold Force", 2);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous gagnez "+WeaponWarriorCase.Lightning.name+" qui fais "+WeaponWarriorCase.Lightning.dmgs+" Dmgs";
}
}
