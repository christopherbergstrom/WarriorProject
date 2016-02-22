package warriorProject;
//cyclops
public class Enemy9
{
	// light = kick
	// medium = punch
	// heavy = spiked club
	private int enemy9Health = 2500, enemy9LightDamage, enemy9MediumDamage, enemy9HeavyDamage, enemy9DamageReceived;
	public void setEnemy9LightDamage()
	{
		enemy9LightDamage = (81+(int)(Math.random()*3));
	}
	public int getEnemy9LightDamage()
	{
		return enemy9LightDamage;
	}
	public void setEnemy9MediumDamage()
	{
		enemy9MediumDamage = (84+(int)(Math.random()*4));
	}
	public int getEnemy9MediumDamage()
	{
		return enemy9MediumDamage;
	}
	public void setEnemy9HeavyDamage()
	{
		enemy9HeavyDamage = (88+(int)(Math.random()*3));
	}
	public int getEnemy9HeavyDamage()
	{
		return enemy9HeavyDamage;
	}
	public void setEnemy9Health(int enemy9Health, int enemy9DamageReceived)
	{
		int check;
		check = enemy9Health - enemy9DamageReceived;
		if (check < 0)
			this.enemy9Health = 0;
		else
			this.enemy9Health = check;
	}
	public int getEnemy9Health()
	{
		return enemy9Health;
	}
	public void setEnemy9DamageReceived(int enemy9DamageReceived)
	{
		this.enemy9DamageReceived = enemy9DamageReceived;
	}
	public int getEnemy9DamageReceived()
	{
		return enemy9DamageReceived;
	}
}
