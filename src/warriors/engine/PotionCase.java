package warriors.engine;

public class PotionCase {
	static int lifeGiven = 0 ;
	PotionCase(int lifeGiven){
		PotionCase.lifeGiven=lifeGiven;
	}
	
	static int PotionMinor(){
	
		lifeGiven +=1 ;
		return lifeGiven;
		
	}
	
	static int PotionStandard() {
		lifeGiven +=2;
		return lifeGiven;
	}
	static int GreatPotion() {
		lifeGiven +=5;
		return lifeGiven;
	}
	
}
