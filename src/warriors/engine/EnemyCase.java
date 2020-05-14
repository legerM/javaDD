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
	
	public static EnemyCase dragon= new DragonCase();
	public static EnemyCase sorcerer=new SorcererCase();
	public static EnemyCase goblin = new GoblinCase();


	
}
