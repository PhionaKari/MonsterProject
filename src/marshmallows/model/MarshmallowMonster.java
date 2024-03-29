package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
 	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;

	private MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, boolean monsterBellyButton, double monsterLegs, double monsterHair)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
	}

	public String getMonsterName()
	{
		return monsterName;
	}

	public int getMonsterEyes()
	{
		return monsterEyes;
	}

	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}

	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}

	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs, " + monsterNoses + " noses, " + monsterEyes + " eyes, and his name is " + monsterName;

		return monsterInfo;

	}
}
