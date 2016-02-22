package warriorProject;
//Gorgon
public class Enemy4
{
	// light = stone gaze
	// medium = claws
	// heavy = tail
	private int enemy4Health = 1000, enemy4LightDamage, enemy4MediumDamage, enemy4HeavyDamage, enemy4DamageReceived;
	private int enemy4DodgeChange;
	private boolean enemy4DodgeAmount;
	public void setEnemy4LightDamage()
	{
		enemy4LightDamage = (31+(int)(Math.random()*3));
	}
	public int getEnemy4LightDamage()
	{
		return enemy4LightDamage;
	}
	public void setEnemy4MediumDamage()
	{
		enemy4MediumDamage = (34+(int)(Math.random()*4));
	}
	public int getEnemy4MediumDamage()
	{
		return enemy4MediumDamage;
	}
	public void setEnemy4HeavyDamage()
	{
		enemy4HeavyDamage = (38+(int)(Math.random()*3));
	}
	public int getEnemy4HeavyDamage()
	{
		return enemy4HeavyDamage;
	}
	public void setEnemy4Health(int enemy4Health, int enemy4DamageReceived)
	{
		int check;
		check = enemy4Health - enemy4DamageReceived;
		if (check < 0)
			this.enemy4Health = 0;
		else
			this.enemy4Health = check;
	}
	public int getEnemy4Health()
	{
		return enemy4Health;
	}
	public void setEnemy4DamageReceived(int enemy4DamageReceived)
	{
		this.enemy4DamageReceived = enemy4DamageReceived;
	}
	public int getEnemy4DamageReceived()
	{
		return enemy4DamageReceived;
	}
	public boolean enemy4Dodge()
	{
		enemy4DodgeChange = (1+(int)(Math.random()*20));
		if (enemy4DodgeChange >= 1 && enemy4DodgeChange <= 3)
			enemy4DodgeAmount = true;
		else
			enemy4DodgeAmount = false;
		return enemy4DodgeAmount;
	}
}
