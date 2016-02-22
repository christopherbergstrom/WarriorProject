package warriorProject;
//minotaur
public class Enemy8
{
	// light = throwing axe
	// medium = horns
	// heavy = axe
	private int enemy8Health = 2000, enemy8LightDamage, enemy8MediumDamage, enemy8HeavyDamage, enemy8DamageBlocked, enemy8DamageReceived;
	private int enemy8DodgeChange;
	private boolean enemy8DodgeAmount;
	public void setEnemy8LightDamage()
	{
		enemy8LightDamage = (71+(int)(Math.random()*3));
	}
	public int getEnemy8LightDamage()
	{
		return enemy8LightDamage;
	}
	public void setEnemy8MediumDamage()
	{
		enemy8MediumDamage = (74+(int)(Math.random()*4));
	}
	public int getEnemy8MediumDamage()
	{
		return enemy8MediumDamage;
	}
	public void setEnemy8HeavyDamage()
	{
		enemy8HeavyDamage = (78+(int)(Math.random()*3));
	}
	public int getEnemy8HeavyDamage()
	{
		return enemy8HeavyDamage;
	}
	public void setEnemy8DamageBlocked()
	{
		enemy8DamageBlocked = (36+(int)(Math.random()*5));
	}
	public int getEnemy8DamageBlocked()
	{
		return enemy8DamageBlocked;
	}
	public void setEnemy8Health(int enemy8Health, int enemy8DamageReceived)
	{
		int check;
		check = enemy8Health - enemy8DamageReceived;
		if (check < 0)
			this.enemy8Health = 0;
		else
			this.enemy8Health = check;
	}
	public int getEnemy8Health()
	{
		return enemy8Health;
	}
	public void setEnemy8DamageReceived(int enemy8DamageReceived, int enemy8DamageBlocked)
	{
		int check;
		check = enemy8DamageReceived - enemy8DamageBlocked;
		if (check < 0)
			this.enemy8DamageReceived = 0;
		else
			this.enemy8DamageReceived = check;
	}
	public int getEnemy8DamageReceived()
	{
		return enemy8DamageReceived;
	}
	public boolean enemy8Dodge()
	{
		enemy8DodgeChange = (1+(int)(Math.random()*20));
		if (enemy8DodgeChange >= 1 && enemy8DodgeChange <= 3)
			enemy8DodgeAmount = true;
		else
			enemy8DodgeAmount = false;
		return enemy8DodgeAmount;
	}
}
