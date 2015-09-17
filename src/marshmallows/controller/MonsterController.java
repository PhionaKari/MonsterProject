package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;


public class MonsterController
{
	private MarshmallowMonster stormMonster; //Declares a Monster called stormMonster.
	private MarshmallowMonster userMonster;
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
		createUserMonster();
		myDisplay.displayInfo("Update monster info: " + userMonster.toString());
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

	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information.
		System.out.println("What is your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("Ay yo how many legs does your monster have? This is a decimal value :D");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("Ayyyyyyy, how much hair does it have?");
		double userHair = monsterScanner.nextDouble();
		System.out.println("Does this babe have a belly button? - True or False");
		boolean hasBellyButton = monsterScanner.nextBoolean();
		System.out.println("yooo how many eyes does it have?");
		int userEyes = monsterScanner.nextInt();
		System.out.println("Combien de nez (How many noses?)");
		int userNoses = monsterScanner.nextInt();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, hasBellyButton, userLegs, userHair);
		
	}
	
}