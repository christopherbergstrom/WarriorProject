package warriorProject;
//practiceEnemyEasy
public class PracticeEnemyEasy
{
	// light = sling shot
	// medium = dagger
	// heavy = club
	private int practiceEnemyEasyHealth = 250, practiceEnemyEasyLightDamage, practiceEnemyEasyMediumDamage, practiceEnemyEasyHeavyDamage, practiceEnemyEasyDamageBlocked, practiceEnemyEasyDamageReceived;
	private int practiceEnemyEasyDodgeChange;
	private boolean practiceEnemyEasyDodgeAmount;
	public void setPracticeEnemyEasyLightDamage()
	{
		practiceEnemyEasyLightDamage = (1+(int)(Math.random()*2));
	}
	public int getPracticeEnemyEasyLightDamage()
	{
		return practiceEnemyEasyLightDamage;
	}
	public void setPracticeEnemyEasyMediumDamage()
	{
		practiceEnemyEasyMediumDamage = (2+(int)(Math.random()*3));
	}
	public int getPracticeEnemyEasyMediumDamage()
	{
		return practiceEnemyEasyMediumDamage;
	}
	public void setPracticeEnemyEasyHeavyDamage()
	{
		practiceEnemyEasyHeavyDamage = (4+(int)(Math.random()*2));
	}
	public int getPracticeEnemyEasyHeavyDamage()
	{
		return practiceEnemyEasyHeavyDamage;
	}
	public void setPracticeEnemyEasyDamageBlocked()
	{
		practiceEnemyEasyDamageBlocked = (1+(int)(Math.random()*3));
	}
	public int getPracticeEnemyEasyDamageBlocked()
	{
		return practiceEnemyEasyDamageBlocked;
	}
	public void setPracticeEnemyEasyHealth(int practiceEnemyEasyHealth, int practiceEnemyEasyDamageReceived)
	{
		int check;
		check = practiceEnemyEasyHealth - practiceEnemyEasyDamageReceived;
		if (check < 0)
			this.practiceEnemyEasyHealth = 0;
		else
			this.practiceEnemyEasyHealth = check;
	}
	public int getPracticeEnemyEasyHealth()
	{
		return practiceEnemyEasyHealth;
	}
	public void setPracticeEnemyEasyDamageReceived(int practiceEnemyEasyDamageReceived, int practiceEnemyEasyDamageBlocked)
	{
		int check;
		check = practiceEnemyEasyDamageReceived - practiceEnemyEasyDamageBlocked;
		if (check < 0)
			this.practiceEnemyEasyDamageReceived = 0;
		else
			this.practiceEnemyEasyDamageReceived = check;
	}
	public int getPracticeEnemyEasyDamageReceived()
	{
		return practiceEnemyEasyDamageReceived;
	}
	public boolean practiceEnemyEasyDodge()
	{
		practiceEnemyEasyDodgeChange = (1+(int)(Math.random()*10));
		if (practiceEnemyEasyDodgeChange == 1)
			practiceEnemyEasyDodgeAmount = true;
		else
			practiceEnemyEasyDodgeAmount = false;
		return practiceEnemyEasyDodgeAmount;
	}
}
