package Experimental.VideoGame;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartGame{

	private static final Logger OUTPUT = Logger.getLogger(StartGame.class.getName());

	List<BattleAction> battleActions;

	public static void main(String[] args){

		//Add an introduction to your game here!!!

		//Sample:
		OUTPUT.log(Level.INFO, "Welcome to the wonderful of Absolute Horizon!!!" +
				"\n Please input your name: ");
		final Scanner INPUT = new Scanner(System.in);

		int rocks = 2;
		String userName = INPUT.next();

		OUTPUT.log(Level.INFO, "Welcome " + userName +"!" +
				"\nBefore we explain anything kill this slime with magic and a sword!" +
				"\nA WILD SLIME HAS APPEAR!!!" +
				"\nGET FOR BATTLE!" +
				"\nSelect an action:" +
				"1 : Throw a nearby rock ("+rocks+" rocks left)" +
				"2 : Use Slice with sword" +
				"3 : Read magic spell from tome" +
				"4 : ???" );

		StartGame game = new StartGame();

		int slimeHp = 10;

		BattleAction rockThrow = new BattleAction.Builder().name("Rock Throw").optionText("Throw a rock at them! >:D").rawDmg(2).build();
		BattleAction slice = new BattleAction.Builder().name("Sword Slice").optionText("Cut them, brah!").rawDmg(1).build();
		BattleAction cast = new BattleAction.Builder().name("Cast Magic").optionText("BEGONE THOT!").rawDmg(2).build();

		game.battleActions = new ArrayList<>();
		List<BattleAction> battleActions = game.battleActions;
		game.battleActions.add(rockThrow);
		game.battleActions.add(slice);
		game.battleActions.add(cast);

		int action = INPUT.nextInt();

		BattleAction battleAction = battleActions.get(action);

		getDamage(battleAction);
	}

	public int getDamage(int attack, float criticalRate) {

		CriticalHit criticalHit = new CriticalHit();


	}
}