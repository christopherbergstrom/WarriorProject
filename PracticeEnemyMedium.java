package warriorProject;
//practiceEnemyMedium
public class PracticeEnemyMedium
{
	// light = whip
	// medium = staff
	// heavy = long sword
	private int practiceEnemyMediumHealth = 500, practiceEnemyMediumLightDamage, practiceEnemyMediumMediumDamage, practiceEnemyMediumHeavyDamage, practiceEnemyMediumDamageBlocked, practiceEnemyMediumDamageReceived;
	private int practiceEnemyMediumDodgeChange;
	private boolean practiceEnemyMediumDodgeAmount;
	public void setPracticeEnemyMediumLightDamage()
	{
		practiceEnemyMediumLightDamage = (7+(int)(Math.random()*2));
	}
	public int getPracticeEnemyMediumLightDamage()
	{
		return practiceEnemyMediumLightDamage;
	}
	public void setPracticeEnemyMediumMediumDamage()
	{
		practiceEnemyMediumMediumDamage = (9+(int)(Math.random()*3));
	}
	public int getPracticeEnemyMediumMediumDamage()
	{
		return practiceEnemyMediumMediumDamage;
	}
	public void setPracticeEnemyMediumHeavyDamage()
	{
		practiceEnemyMediumHeavyDamage = (12+(int)(Math.random()*2));
	}
	public int getPracticeEnemyMediumHeavyDamage()
	{
		return practiceEnemyMediumHeavyDamage;
	}
	public void setPracticeEnemyMediumDamageBlocked()
	{
		practiceEnemyMediumDamageBlocked = (4+(int)(Math.random()*3));
	}
	public int getPracticeEnemyMediumDamageBlocked()
	{
		return practiceEnemyMediumDamageBlocked;
	}
	public void setPracticeEnemyMediumHealth(int practiceEnemyMediumHealth, int practiceEnemyMediumDamageReceived)
	{
		int check;
		check = practiceEnemyMediumHealth - practiceEnemyMediumDamageReceived;
		if (check < 0)
			this.practiceEnemyMediumHealth = 0;
		else
			this.practiceEnemyMediumHealth = check;
	}
	public int getPracticeEnemyMediumHealth()
	{
		return practiceEnemyMediumHealth;
	}
	public void setPracticeEnemyMediumDamageReceived(int practiceEnemyMediumDamageReceived, int practiceEnemyMediumDamageBlocked)
	{
		int check;
		check = practiceEnemyMediumDamageReceived - practiceEnemyMediumDamageBlocked;
		if (check < 0)
			this.practiceEnemyMediumDamageReceived = 0;
		else
			this.practiceEnemyMediumDamageReceived = check;
	}
	public int getPracticeEnemyMediumDamageReceived()
	{
		return practiceEnemyMediumDamageReceived;
	}
	public boolean practiceEnemyMediumDodge()
	{
		practiceEnemyMediumDodgeChange = (1+(int)(Math.random()*20));
		if (practiceEnemyMediumDodgeChange >= 1 && practiceEnemyMediumDodgeChange <= 3)
			practiceEnemyMediumDodgeAmount = true;
		else
			practiceEnemyMediumDodgeAmount = false;
		return practiceEnemyMediumDodgeAmount;
	}
}
