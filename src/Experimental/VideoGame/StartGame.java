package Experimental.VideoGame;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class StartGame{

	private static final Logger OUTPUT = Logger.getLogger(StartGame.class.getName());

	List<BattleAction> battleActions;

	public static void main(String[] args){

		//Add an introduction to your game here!!!

		//Sample:
		OUTPUT.log(INFO, "Welcome to the wonderful of Absolute Horizon!!!" +
				"\n Please input your name: ");
		final Scanner INPUT = new Scanner(System.in);

		int rocks = 2;
		String userName = INPUT.next();

		OUTPUT.log(INFO, "Welcome " + userName +"!" +
				"\nBefore we explain anything kill this slime with magic and a sword!" +
				"\nA WILD SLIME HAS APPEAR!!!" +
				"\nGET FOR BATTLE!" +
				"\nSelect an action:" +
				"\n\t1 : Throw a nearby rock ("+rocks+" rocks left)" +
				"\n\t2 : Use Slice with sword" +
				"\n\t3 : Read magic spell from tome" +
				"\n\t4 : ???" );

		StartGame game = new StartGame();

		int playerHp = 20;
		int slimeHp = 10;

		BattleAction rockThrow = new BattleAction.Builder().name("Rock Throw").optionText("Throw a rock at them! >:D").rawDmg(2).critRate(0.1f).build();
		BattleAction slice = new BattleAction.Builder().name("Sword Slice").optionText("Cut them, brah!").rawDmg(1).critRate(0.15f).build();
		BattleAction cast = new BattleAction.Builder().name("Cast Magic").optionText("BEGONE THOT!").rawDmg(2).critRate(0.2f).build();

		game.battleActions = new ArrayList<>();
		List<BattleAction> battleActions = game.battleActions;
		game.battleActions.add(rockThrow);
		game.battleActions.add(slice);
		game.battleActions.add(cast);

		int action = INPUT.nextInt();

		BattleAction battleAction = battleActions.get(action-1);

		OUTPUT.log(INFO, Integer.toString(game.getDamage(battleAction.getRawDmg()+1, battleAction.getCritRate())));
	}

	public int getDamage(int attack, float criticalRate) {

		int dmg = 0;
		CriticalHit criticalHit = new CriticalHit();
		boolean criticalHitHappened = criticalHit.landCritical(criticalRate, 1);
		if(criticalHitHappened){
			attack *= 3;
		}
		dmg=attack;
		return dmg;
	}

	public String determineEntity(int turnsPast, int entityNum){
		String entity = null;
		int turnOrder = turnsPast % entityNum;
		String[] entities = {"player","slime"};
		entity = entities[turnOrder];
		return entity;
	}

	public BattleAction optionChosen(String entity){
		BattleAction option  = null;
		switch (entity) {
			case "player":
				option = playerOptions();
				break;
			case "slime":
				option = new BattleAction.Builder().name("Slime Tackle").optionText("Goop attack!").rawDmg(2).critRate(0.2f).build();
				break;
			case "goblin":
				option = new BattleAction.Builder().name("Dirty Stab").optionText("SHANK SHANK").rawDmg(5).critRate(0.01f).build();
			default: break;
		}
		return option;
	}
	public BattleAction playerOptions(){
		BattleAction option = null;
		final Scanner INPUT = new Scanner(System.in);

		OUTPUT.log(INFO, "Select a number" +
				"\n\t1 : Throw a nearby rock" +
				"\n\t2 : Use Slice with sword" +
				"\n\t3 : Read magic spell from tome");

		int action = INPUT.nextInt();

		option = this.battleActions.get(action-1);

		return option;
	}

}
				System.out.println("The slime attacks for 2 DMG");
