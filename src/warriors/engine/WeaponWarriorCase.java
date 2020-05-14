package warriors.engine;

public class WeaponWarriorCase implements Case {
String name;
int dmgs;

	WeaponWarriorCase(String name,int dmgs){
		this.name=name;
		this.dmgs=dmgs;
		
	}

public static WeaponWarriorCase bow = new BowCase();
public static WeaponWarriorCase club = new ClubCase();
public static WeaponWarriorCase sword = new SwordCase();
public static WeaponWarriorCase Lightning = new LightningCase();
public static WeaponWarriorCase fireball = new Fireball();



}