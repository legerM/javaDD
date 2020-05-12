package warriors.engine;

public class WeaponWarriorCase {
	static int ppGiven = 0 ;
	WeaponWarriorCase(int ppGiven){
		WeaponWarriorCase.ppGiven=ppGiven;
	}
	
	static int bow(){
	
		ppGiven +=1 ;
		return ppGiven;
		
	}
	
	static int club() {
		ppGiven +=3;
		return ppGiven;
	}
	static int sword() {
		ppGiven +=5;
		return ppGiven;
	}
	
}
