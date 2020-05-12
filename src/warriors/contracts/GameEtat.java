package warriors.contracts;

public class GameEtat implements GameState {
	String playername;
	String gameId;
	GameStatus Gamestat;
	Hero hero;
	Map map;
	String lastlog;
	int currentCase;

	public GameEtat(String playername, String gameId, Hero hero, Map map){
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
		//TODO mettre les SYSO dedans!!!
		return gameId;
	}

	@Override
	public int getCurrentCase() {

		return currentCase ;
	}


	public int moveForward(int dice) {
		currentCase = currentCase + dice;

		if (currentCase > 64 ) {
			Gamestat = GameStatus.FINISHED;
			System.out.println("vous etes sorti du Donjon ! ");
		}
		else {

			System.out.println("vous etes a la case : "+ currentCase);
		}
		
		
		return currentCase;

	}

	
}
