package warriors.engine;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import warriors.contracts.GameEtat;
import warriors.contracts.GameState;
//import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.MapChoice;
import warriors.contracts.WarriorsAPI;
import warriors.contracts.WizardHero;

public class Warriors implements WarriorsAPI {
	List<Map> map ;
	List<Hero> warriors ;
	//	private GameStatus status = GameStatus.IN_PROGRESS;
	protected java.util.Map <String,GameEtat>gameList;
	GameEtat game;
	Random random = new Random();
	int gameCount=0;

	public Warriors(){
		warriors = new ArrayList<Hero>();
		map = new ArrayList<Map>();
		Hero warrior = new WarriorHero("Warrior : Doku" , 10 , 6);
		warriors.add(warrior);
		Hero emperor = new WizardHero("Wizard : Palpatoch", 5 ,15);
		warriors.add(emperor);
		Map mapchoice1 = new MapChoice("Alderaan",64);
		map.add(mapchoice1);
		Map mapchoice2= new MapChoice("Dagoba",64);
		map.add(mapchoice2);
		gameList = new HashMap<String, GameEtat>();



	}


	@Override
	public List<? extends Hero> getHeroes(){

		return warriors;

	}

	@Override
	public List<? extends Map> getMaps() {
		// TODO Auto-generated method stub
		return map ;
	}

	@Override
	public GameState createGame(String playerName, Hero hero, Map map) {
		String gameId= "game - " +gameCount;
		gameCount ++ ;
		game = new GameEtat(playerName,gameId,hero, map);
		gameList.put(game.getGameId(), game);
		return game;
	}

	@Override
	public GameState nextTurn(String gameID) {	
		int dice = rollDice();
		GameEtat gameS = gameList.get(gameID);
		WhichCase();
		gameS.moveForward(dice);
		
		
		return gameS;

	}


	private int  rollDice() {
		int dice = 1 +random.nextInt(6-1);
		System.out.println("vous lancez un dé 6 et faites : " +dice);
		return dice;
	}

	private void WhichCase() {
		int whichCase = 1+random.nextInt(4-1);
		int Given=0;
		
		if(whichCase == 1) {
			Given = 0;
			Given = weapon();
			System.out.println("Vous Trouvez une Arme ! et Gagnez"+ Given +" PP");
			WarriorHero.setAttackLevel(Given);
			
			
		}
		else if (whichCase == 2) {
			Given = 0;
			Given = potion();
			System.out.println("Vous Trouvez une Potion ! et Gagnez " + Given +" HP");
			WarriorHero.setLife(Given);
			
		}
		else if (whichCase == 3) {
			System.out.println("vous etes dans une Salle Vide !");
		}
		else if (whichCase == 4) {
			System.out.println("Vous etes Face a un Enemie !");
		}
	}


	private int potion() {
		int bonus=0;
		int potion=1+random.nextInt(3-1);
		if(potion==1) {
			bonus=PotionCase.PotionMinor();
		}
		else if (potion == 2) {
			bonus=PotionCase.PotionStandard();
		}
		else if (potion == 3) {
			bonus=PotionCase.GreatPotion();
		}
		return bonus;
	}


	private int weapon() {
		int bonus=0;
		int weapon=1+random.nextInt(3-1);
		if(weapon==1) {
			bonus=WeaponWarriorCase.bow();
		}
		else if (weapon == 2) {
			bonus=WeaponWarriorCase.club();
		}
		else if (weapon == 3) {
			bonus=WeaponWarriorCase.sword();
		}
		return bonus;
	}

}
