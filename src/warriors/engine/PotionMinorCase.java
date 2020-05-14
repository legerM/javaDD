package warriors.engine;

public class PotionMinorCase extends PotionCase {

	PotionMinorCase() {
		super("Minor Potion", 1);
		// TODO Auto-generated constructor stub
	}
public String toString() {
	return "Vous trouvez une "+PotionCase.potionminor.name+" qui vous donne "+PotionCase.potionminor.bonus+" Hp";
}
}
