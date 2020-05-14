package warriors.engine;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class GameEtat implements GameState {
	String playername;
	String gameId;
	GameStatus Gamestat;
	Hero hero;
	MapChoice map;
	String lastlog;
	int currentCase;

	public GameEtat(String playername, String gameId, Hero hero, MapChoice map ){
		
		this.playername=playername;
		this.gameId=gameId;
		this.hero=hero;
		this.map=map;
		this.lastlog=gameId;
		this.currentCase=0;
		this.Gamestat=GameStatus.IN_PROGRESS;
		
	}


	@Override
	public String getPlayerName() {
		
		// TODO Auto-generated method stub
		return playername;
	}

	@Override
	public String getGameId() {
		
		// TODO Auto-generated method stub
		return gameId;
	
	}

	@Override
	public GameStatus getGameStatus() {
	
		// TODO Auto-generated method stub
		return Gamestat;
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return hero;
	}

	@Override
	public Map getMap() {
		// TODO Auto-generated method stub
		return map;
	}

	@Override
	public String getLastLog() {
		
		if(Gamestat == GameStatus.FINISHED) {
			
		System.out.println("vous etes sorti du Donjon ! ");
		
		}
		
		else {
			
			System.out.println("vous etes a la case : " + currentCase);
			
		}
		
		return lastlog;
		
	}

	@Override
	public int getCurrentCase() {

		return currentCase ;
	}


	public int moveForward(int dice) {
		currentCase = currentCase + dice;

		if (currentCase > 64 ) {
			Gamestat = GameStatus.FINISHED;
		}
		
		Case caseToPlay = this.map.getCaseAtPosition(currentCase);
//		lastlog = lastlog + " " + caseToPlay.toString();
		lastlog = caseToPlay.toString();
		return currentCase;

	}

	
}
