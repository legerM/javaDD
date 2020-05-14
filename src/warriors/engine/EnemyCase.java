package warriors.engine;

public class EnemyCase implements Case{
	
	String name;
	int hP;
	int pP;
	
	EnemyCase(String name, int hP, int pP){
	
		this.name=name;
		this.hP=hP;
		this.pP=pP;
		
	}
	
	public String getName() {
		return this.name;
	}
public int getHP() {
	return this.hP;
}

public int getPP() {
	return this.pP;
}
public String toString() {
	return "Vous etes face à un "+this.getName()+" qui as "+this.getHP()+" Hp "+" et "+this.getPP()+" PP ";
}
}
