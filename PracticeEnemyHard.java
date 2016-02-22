package warriorProject;
//practiceEnemyHard
public class PracticeEnemyHard
{
	// light = bow
	// medium = mace
	// heavy = trident
	private int practiceEnemyHardHealth = 750, practiceEnemyHardLightDamage, practiceEnemyHardMediumDamage, practiceEnemyHardHeavyDamage, practiceEnemyHardDamageBlocked, practiceEnemyHardDamageReceived;
	private int practiceEnemyHardDodgeChange;
	private boolean practiceEnemyHardDodgeAmount;
	public void setPracticeEnemyHardLightDamage()
	{
		practiceEnemyHardLightDamage = (15+(int)(Math.random()*2));
	}
	public int getPracticeEnemyHardLightDamage()
	{
		return practiceEnemyHardLightDamage;
	}
	public void setPracticeEnemyHardMediumDamage()
	{
		practiceEnemyHardMediumDamage = (18+(int)(Math.random()*3));
	}
	public int getPracticeEnemyHardMediumDamage()
	{
		return practiceEnemyHardMediumDamage;
	}
	public void setPracticeEnemyHardHeavyDamage()
	{
		practiceEnemyHardHeavyDamage = (22+(int)(Math.random()*2));
	}
	public int getPracticeEnemyHardHeavyDamage()
	{
		return practiceEnemyHardHeavyDamage;
	}
	public void setPracticeEnemyHardDamageBlocked()
	{
		practiceEnemyHardDamageBlocked = (8+(int)(Math.random()*3));
	}
	public int getPracticeEnemyHardDamageBlocked()
	{
		return practiceEnemyHardDamageBlocked;
	}
	public void setPracticeEnemyHardHealth(int practiceEnemyHardHealth, int practiceEnemyHardDamageReceived)
	{
		int check;
		check = practiceEnemyHardHealth - practiceEnemyHardDamageReceived;
		if (check < 0)
			this.practiceEnemyHardHealth = 0;
		else
			this.practiceEnemyHardHealth = check;
	}
	public int getPracticeEnemyHardHealth()
	{
		return practiceEnemyHardHealth;
	}
	public void setPracticeEnemyHardDamageReceived(int practiceEnemyHardDamageReceived, int practiceEnemyHardDamageBlocked)
	{
		int check;
		check = practiceEnemyHardDamageReceived - practiceEnemyHardDamageBlocked;
		if (check < 0)
			this.practiceEnemyHardDamageReceived = 0;
		else
			this.practiceEnemyHardDamageReceived = check;
	}
	public int getPracticeEnemyHardDamageReceived()
	{
		return practiceEnemyHardDamageReceived;
	}
	public boolean practiceEnemyHardDodge()
	{
		practiceEnemyHardDodgeChange = (1+(int)(Math.random()*5));
		if (practiceEnemyHardDodgeChange == 1)
			practiceEnemyHardDodgeAmount = true;
		else
			practiceEnemyHardDodgeAmount = false;
		return practiceEnemyHardDodgeAmount;
	}
}
