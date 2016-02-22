package warriorProject;
//giant spider
public class Enemy7
{
	// light = trample
	// medium = bite
	// heavy = stinger
	private int enemy7Health = 1750, enemy7LightDamage, enemy7MediumDamage, enemy7HeavyDamage, enemy7DamageReceived;
	private int enemy7DodgeChange;
	private boolean enemy7DodgeAmount;
	public void setEnemy7LightDamage()
	{
		enemy7LightDamage = (61+(int)(Math.random()*3));
	}
	public int getEnemy7LightDamage()
	{
		return enemy7LightDamage;
	}
	public void setEnemy7MediumDamage()
	{
		enemy7MediumDamage = (64+(int)(Math.random()*4));
	}
	public int getEnemy7MediumDamage()
	{
		return enemy7MediumDamage;
	}
	public void setEnemy7HeavyDamage()
	{
		enemy7HeavyDamage = (68+(int)(Math.random()*3));
	}
	public int getEnemy7HeavyDamage()
	{
		return enemy7HeavyDamage;
	}
	public void setEnemy7Health(int enemy7Health, int enemy7DamageReceived)
	{
		int check;
		check = enemy7Health - enemy7DamageReceived;
		if (check < 0)
			this.enemy7Health = 0;
		else
			this.enemy7Health = check;
	}
	public int getEnemy7Health()
	{
		return enemy7Health;
	}
	public void setEnemy7DamageReceived(int enemy7DamageReceived)
	{
		this.enemy7DamageReceived = enemy7DamageReceived;
	}
	public int getEnemy7DamageReceived()
	{
		return enemy7DamageReceived;
	}
	public boolean enemy7Dodge()
	{
		enemy7DodgeChange = (1+(int)(Math.random()*5));
		if (enemy7DodgeChange == 1)
			enemy7DodgeAmount = true;
		else
			enemy7DodgeAmount = false;
		return enemy7DodgeAmount;
	}
}
