package warriors.engine;

public class ClubCase extends WeaponWarriorCase {

	ClubCase() {
		super("Imperial Guard Club", 3);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous trouvez un"+WeaponWarriorCase.club.name+" qui vous donne  "+WeaponWarriorCase.club.dmgs+" Dmgs";
}
}
