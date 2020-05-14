package warriors.engine;

public class SorcererCase extends EnemyCase {

	SorcererCase() {
		super("Sith", 9, 2);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous etes face à un " + EnemyCase.sorcerer.name+ " qui as  "+EnemyCase.sorcerer.hP+" Hp "+" et "+EnemyCase.sorcerer.pP+" PP ";
}
}
