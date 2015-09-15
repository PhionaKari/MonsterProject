package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;


public class MonsterController
{
	private MarshmallowMonster stormMonster; 
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "a name that would be deemed pretty Spooky";
		int eyes = 20;
		int noses = 12;
		double legs = 2.4;
		double hair = 1.0;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		stormMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(stormMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Update monster info: " + stormMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("He doesn't really have a name, just something spooky. How about you think of spooky name?");
		String newMonsterName = monsterScanner.next();
		stormMonster.setMonsterName(newMonsterName);
	}
	
}