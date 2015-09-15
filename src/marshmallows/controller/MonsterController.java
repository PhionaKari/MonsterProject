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
		System.out.println("You know what? Since we are already changing the Monsters' name, we might as well just change everything about him to what you think would look alright. Let's start by changing the number of noses this babe has.");
		int updateNoses = monsterScanner.nextInt();
		System.out.println("Hmmmmm... Bretty gud :DDDD, how about we also change the number of eyes as well?");
		int updateEyes = monsterScanner.nextInt();
		System.out.println("Hmmm... This is going pretty good. Lets go out and change the number of legs this... Uhm... Thing has...");
		double updateLegs = monsterScanner.nextDouble();
		System.out.println("Jesus Christ... Well, you have uhm, a lot of imagination... Well, lets also change the number of belly buttons this abomination has.");
		boolean updateBellyButton = monsterScanner.nextBoolean();
		System.out.println("Christ... Well this is going out to be quite the mess if I say so myself. Anyways, let's also change how much hair this beautiful freak of nature also has.");
		boolean updateHair = monsterScanner.nextBoolean();
		System.out.println("Okay, I'm done here, have fun with your monster");
		
		
	}
	
}