package warriors.engine;

public class PotionStandarCase extends PotionCase {

	PotionStandarCase() {
		super("standar Potion ", 2);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous trouvez une "+PotionCase.potionstandar.name+" qui vous donne "+PotionCase.potionstandar.bonus+" Hp";
}
}
