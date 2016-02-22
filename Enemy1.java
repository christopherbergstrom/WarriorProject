package warriorProject;
//undead archer
public class Enemy1
{
	// light = dagger
	// medium = throwing knives
	// heavy = bow
	private int enemy1Health = 250, enemy1LightDamage, enemy1MediumDamage, enemy1HeavyDamage, enemy1DamageBlocked, enemy1DamageReceived;
	private int enemy1DodgeChange;
	private boolean enemy1DodgeAmount;
	public void setEnemy1LightDamage()
	{
		enemy1LightDamage = (1+(int)(Math.random()*3));
	}
	public int getEnemy1LightDamage()
	{
		return enemy1LightDamage;
	}
	public void setEnemy1MediumDamage()
	{
		enemy1MediumDamage = (4+(int)(Math.random()*4));
	}
	public int getEnemy1MediumDamage()
	{
		return enemy1MediumDamage;
	}
	public void setEnemy1HeavyDamage()
	{
		enemy1HeavyDamage = (8+(int)(Math.random()*3));
	}
	public int getEnemy1HeavyDamage()
	{
		return enemy1HeavyDamage;
	}
	public void setEnemy1DamageBlocked()
	{
		enemy1DamageBlocked = (1+(int)(Math.random()*5));
	}
	public int getEnemy1DamageBlocked()
	{
		return enemy1DamageBlocked;
	}
	public void setEnemy1Health(int enemy1Health, int enemy1DamageReceived)
	{
		int check;
		check = enemy1Health - enemy1DamageReceived;
		if (check < 0)
			this.enemy1Health = 0;
		else
			this.enemy1Health = check;
	}
	public int getEnemy1Health()
	{
		return enemy1Health;
	}
	public void setEnemy1DamageReceived(int enemy1DamageReceived, int enemy1DamageBlocked)
	{
		int check;
		check = enemy1DamageReceived - enemy1DamageBlocked;
		if (check < 0)
			this.enemy1DamageReceived = 0;
		else
			this.enemy1DamageReceived = check;
	}
	public int getEnemy1DamageReceived()
	{
		return enemy1DamageReceived;
	}
	public boolean enemy1Dodge()
	{
		enemy1DodgeChange = (1+(int)(Math.random()*5));
		if (enemy1DodgeChange == 1)
			enemy1DodgeAmount = true;
		else
			enemy1DodgeAmount = false;
		return enemy1DodgeAmount;
	}
}
