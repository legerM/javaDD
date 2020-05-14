package warriors.engine;

public class Fireball extends WeaponWarriorCase {

	Fireball() {
		super("FireBall", 7);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous gagnez "+WeaponWarriorCase.fireball.name+" qui fais "+WeaponWarriorCase.fireball.dmgs+" Dmgs";
}
}
