package warriors.engine;

public class GreatPotionCase extends PotionCase {

	GreatPotionCase() {
		super("Great Potion", 5);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous trouvez une "+PotionCase.greatpotion.name+" qui vous donne "+PotionCase.greatpotion.bonus+" Hp";
}
}
