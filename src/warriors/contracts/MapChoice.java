package warriors.contracts;

public class MapChoice implements Map {
	String name;
	int numberofcase;
	
	public MapChoice(String name,int numberofcase){
		this.name=name;
		this.numberofcase=numberofcase;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getNumberOfCase() {
		// TODO Auto-generated method stub
		return numberofcase;
	}
	

}
