package warriors.engine;

public class DragonCase extends EnemyCase{

	DragonCase() {
		super("Dragon Krayt", 15, 4);

	}

	public String toString() {
		return "Vous etes face à un "+EnemyCase.dragon.name+" qui as "+EnemyCase.dragon.hP+" Hp "+" et "+EnemyCase.dragon.pP+" PP ";
	}
}
