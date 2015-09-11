package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster stormMonster; 
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "a name that would be deemed pretty Spooky";
		int eyes = 20;
		int noses = 12;
		double legs = 2;
		double hair = 1.0;
		boolean hasBellyButton = true;
		
		myDisplay = new MonsterDisplay();
		stormMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(stormMonster.toString());
	}
	
}