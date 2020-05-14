package warriors.engine;

import warriors.contracts.Hero;

public class WarriorHero implements Hero{
	String name ;
	static int life ;
	static int PP ;
	public WarriorHero(String name , int life ,int PP) {
	
		this.name= name;
		WarriorHero.life= life;
		WarriorHero.PP= PP;
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return life;
	}

	@Override
	public int getAttackLevel() {
		// TODO Auto-generated method stub
		return PP;
	}
	
	public static void setLife(int life) {
		WarriorHero.life=life;
	}
	public static void setAttackLevel(int PP) {
		WarriorHero.PP=PP;
	}
}