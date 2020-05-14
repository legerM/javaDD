package warriors.engine;

public class BowCase extends WeaponWarriorCase{

	BowCase(){
		super("Wookie BowCaster",1);
	}
public String toString() {
	return "vous trouvez un "+WeaponWarriorCase.bow.name+" qui vous donne  "+WeaponWarriorCase.bow.dmgs+" Dmgs";
}
	
}
