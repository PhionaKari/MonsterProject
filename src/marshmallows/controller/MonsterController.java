package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
public class MonsterController
{
	private MarshmallowMonster stormMonster; 
	

	public MonsterController()
	{
		String name = "";
		int eyes = 2;
		int noses = 0;
		double legs = 2.0;
		double hair = 1.0;
		boolean hasBellyButton = true;
		
		stormMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, hair, legs);
	}
	
	public void start()
	{
		
	}
}