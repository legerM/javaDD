package warriors.engine;

public class GoblinCase extends EnemyCase{

	GoblinCase() {
		super("Jawas", 6, 1);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous etes face à un "+EnemyCase.goblin.name+" qui as "+EnemyCase.goblin.hP+" Hp "+" et "+EnemyCase.goblin.pP+" PP ";
}
}
