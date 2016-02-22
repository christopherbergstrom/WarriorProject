package warriorProject;
//centaur
public class Enemy5
{
	// light = charge
	// medium = chain whip
	// heavy = flail
	private int enemy5Health = 1250, enemy5LightDamage, enemy5MediumDamage, enemy5HeavyDamage, enemy5DamageBlocked, enemy5DamageReceived;
	public void setEnemy5LightDamage()
	{
		enemy5LightDamage = (41+(int)(Math.random()*3));
	}
	public int getEnemy5LightDamage()
	{
		return enemy5LightDamage;
	}
	public void setEnemy5MediumDamage()
	{
		enemy5MediumDamage = (44+(int)(Math.random()*4));
	}
	public int getEnemy5MediumDamage()
	{
		return enemy5MediumDamage;
	}
	public void setEnemy5HeavyDamage()
	{
		enemy5HeavyDamage = (48+(int)(Math.random()*3));
	}
	public int getEnemy5HeavyDamage()
	{
		return enemy5HeavyDamage;
	}
	public void setEnemy5DamageBlocked()
	{
		enemy5DamageBlocked = (21+(int)(Math.random()*5));
	}
	public int getEnemy5DamageBlocked()
	{
		return enemy5DamageBlocked;
	}
	public void setEnemy5Health(int enemy5Health, int enemy5DamageReceived)
	{
		int check;
		check = enemy5Health - enemy5DamageReceived;
		if (check < 0)
			this.enemy5Health = 0;
		else
			this.enemy5Health = check;
	}
	public int getEnemy5Health()
	{
		return enemy5Health;
	}
	public void setEnemy5DamageReceived(int enemy5DamageReceived, int enemy5DamageBlocked)
	{
		int check;
		check = enemy5DamageReceived - enemy5DamageBlocked;
		if (check < 0)
			this.enemy5DamageReceived = 0;
		else
			this.enemy5DamageReceived = check;
	}
	public int getEnemy5DamageReceived()
	{
		return enemy5DamageReceived;
	}
}
