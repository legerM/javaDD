package warriors.engine;

public class WeaponWarriorCase implements Case {
String name;
int dmgs;

	WeaponWarriorCase(String name,int dmgs){
		this.name=name;
		this.dmgs=dmgs;
		
	}
public String getName() {
	return this.name;
}

public int getDmgs() {
	return this.dmgs;
}
public String toString() {
	return "vous trouvez un "+getName()+" qui vous donne  "+getDmgs()+" Dmgs";
}
}