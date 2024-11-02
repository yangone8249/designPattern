package StrategyPattern;

public class Main {

	public static void main(String[] args) {

		GameCharacter gameCharacter = new GameCharacter();
		
		gameCharacter.attack();
		
		gameCharacter.setWeapon(new knife());
		gameCharacter.attack();

		gameCharacter.setWeapon(new sword());
		gameCharacter.attack();
	}

}
