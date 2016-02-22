package warriorProject;
//undead soldier
public class Enemy2
{
	// light = mace
	// medium = sword
	// heavy = halberd
	private int enemy2Health = 500, enemy2LightDamage, enemy2MediumDamage, enemy2HeavyDamage, enemy2DamageBlocked, enemy2DamageReceived;
	private int enemy2DodgeChange;
	private boolean enemy2DodgeAmount;
	public void setEnemy2LightDamage()
	{
		enemy2LightDamage = (11+(int)(Math.random()*3));
	}
	public int getEnemy2LightDamage()
	{
		return enemy2LightDamage;
	}
	public void setEnemy2MediumDamage()
	{
		enemy2MediumDamage = (14+(int)(Math.random()*4));
	}
	public int getEnemy2MediumDamage()
	{
		return enemy2MediumDamage;
	}
	public void setEnemy2HeavyDamage()
	{
		enemy2HeavyDamage = (18+(int)(Math.random()*3));
	}
	public int getEnemy2HeavyDamage()
	{
		return enemy2HeavyDamage;
	}
	public void setEnemy2DamageBlocked()
	{
		enemy2DamageBlocked = (6+(int)(Math.random()*5));
	}
	public int getEnemy2DamageBlocked()
	{
		return enemy2DamageBlocked;
	}
	public void setEnemy2Health(int enemy2Health, int enemy2DamageReceived)
	{
		int check;
		check = enemy2Health - enemy2DamageReceived;
		if (check < 0)
			this.enemy2Health = 0;
		else
			this.enemy2Health = check;
	}
	public int getEnemy2Health()
	{
		return enemy2Health;
	}
	public void setEnemy2DamageReceived(int enemy2DamageReceived, int enemy2DamageBlocked)
	{
		int check;
		check = enemy2DamageReceived - enemy2DamageBlocked;
		if (check < 0)
			this.enemy2DamageReceived = 0;
		else
			this.enemy2DamageReceived = check;
	}
	public int getEnemy2DamageReceived()
	{
		return enemy2DamageReceived;
	}
	public boolean enemy2Dodge()
	{
		enemy2DodgeChange = (1+(int)(Math.random()*10));
		if (enemy2DodgeChange == 1)
			enemy2DodgeAmount = true;
		else
			enemy2DodgeAmount = false;
		return enemy2DodgeAmount;
	}
}
