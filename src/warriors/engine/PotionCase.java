package warriors.engine;


public class PotionCase implements Case{
	String name;
	int bonus;
	PotionCase(String name , int bonus){
		this.name=name;
		this.bonus=bonus;
		
	}

	public String getName() {
		return this.name;
	}
	public int getBonus() {
		return this.bonus;
	}

	public String toString() {
		return "Vous trouvez une "+this.getName()+" qui vous donne "+this.getBonus()+" Hp";
	}

	
}
