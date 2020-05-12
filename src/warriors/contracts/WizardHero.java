package warriors.contracts;

public class WizardHero implements Hero {

	String name ;
	int life ;
	int PP ;
	public WizardHero(String name , int life ,int PP) {
	
		this.name= name;
		this.life= life;
		this.PP= PP;
		
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

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return life;
	}

	@Override
	public int getAttackLevel() {
		// TODO Auto-generated method stub
		return PP;
	
	}

}
