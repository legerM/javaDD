package warriors.engine;


public class PotionCase implements Case{
	String name;
	int bonus;
	PotionCase(String name , int bonus){
		this.name=name;
		this.bonus=bonus;
		
	}
	public static PotionCase potionminor = new PotionMinorCase();
	public static PotionCase potionstandar=new PotionStandarCase();
	public static PotionCase greatpotion = new GreatPotionCase();
	
	



	
}
