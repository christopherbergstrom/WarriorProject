package warriorProject;
//cerberus dog
public class Enemy6
{
	// light = fire spit
	// medium = claws
	// heavy = bite
	private int enemy6Health = 1500, enemy6LightDamage, enemy6MediumDamage, enemy6HeavyDamage, enemy6DamageReceived;
	private int enemy6DodgeChange;
	private boolean enemy6DodgeAmount;
	public void setEnemy6LightDamage()
	{
		enemy6LightDamage = (51+(int)(Math.random()*3));
	}
	public int getEnemy6LightDamage()
	{
		return enemy6LightDamage;
	}
	public void setEnemy6MediumDamage()
	{
		enemy6MediumDamage = (54+(int)(Math.random()*4));
	}
	public int getEnemy6MediumDamage()
	{
		return enemy6MediumDamage;
	}
	public void setEnemy6HeavyDamage()
	{
		enemy6HeavyDamage = (58+(int)(Math.random()*3));
	}
	public int getEnemy6HeavyDamage()
	{
		return enemy6HeavyDamage;
	}
	public void setEnemy6Health(int enemy6Health, int enemy6DamageReceived)
	{
		int check;
		check = enemy6Health - enemy6DamageReceived;
		if (check < 0)
			this.enemy6Health = 0;
		else
			this.enemy6Health = check;
	}
	public int getEnemy6Health()
	{
		return enemy6Health;
	}
	public void setEnemy6DamageReceived(int enemy6DamageReceived)
	{
		this.enemy6DamageReceived = enemy6DamageReceived;
	}
	public int getEnemy6DamageReceived()
	{
		return enemy6DamageReceived;
	}
	public boolean enemy6Dodge()
	{
		enemy6DodgeChange = (1+(int)(Math.random()*20));
		if (enemy6DodgeChange >= 1 && enemy6DodgeChange <= 3)
			enemy6DodgeAmount = true;
		else
			enemy6DodgeAmount = false;
		return enemy6DodgeAmount;
	}
}
