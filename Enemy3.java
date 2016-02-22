package warriorProject;
//harpy
public class Enemy3
{
	// light = scream
	// medium = acid spit
	// heavy = tallons
	private int enemy3Health = 750, enemy3LightDamage, enemy3MediumDamage, enemy3HeavyDamage, enemy3DamageReceived;
	private int enemy3DodgeChange;
	private boolean enemy3DodgeAmount;
	public void setEnemy3LightDamage()
	{
		enemy3LightDamage = (21+(int)(Math.random()*3));
	}
	public int getEnemy3LightDamage()
	{
		return enemy3LightDamage;
	}
	public void setEnemy3MediumDamage()
	{
		enemy3MediumDamage = (24+(int)(Math.random()*4));
	}
	public int getEnemy3MediumDamage()
	{
		return enemy3MediumDamage;
	}
	public void setEnemy3HeavyDamage()
	{
		enemy3HeavyDamage = (28+(int)(Math.random()*3));
	}
	public int getEnemy3HeavyDamage()
	{
		return enemy3HeavyDamage;
	}
	public void setEnemy3Health(int enemy3Health, int enemy3DamageReceived)
	{
		int check;
		check = enemy3Health - enemy3DamageReceived;
		if (check < 0)
			this.enemy3Health = 0;
		else
			this.enemy3Health = check;
	}
	public int getEnemy3Health()
	{
		return enemy3Health;
	}
	public void setEnemy3DamageReceived(int enemy3DamageReceived)
	{
		this.enemy3DamageReceived = enemy3DamageReceived;
	}
	public int getEnemy3DamageReceived()
	{
		return enemy3DamageReceived;
	}
	public boolean enemy3Dodge()
	{
		enemy3DodgeChange = (1+(int)(Math.random()*10));
		if (enemy3DodgeChange == 1)
			enemy3DodgeAmount = true;
		else
			enemy3DodgeAmount = false;
		return enemy3DodgeAmount;
	}
}
