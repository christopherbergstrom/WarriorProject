package warriorProject;
//enemy
public class EnemyTemplate
{
	private int enemyHealth = 100, enemyLightDamage, enemyMediumDamage, enemyHeavyDamage, enemyDamageBlocked, enemyDamageReceived;
	private int enemyDodgeChange;
	private boolean enemyDodgeAmount;
	public void setEnemyLightDamage()
	{
		enemyLightDamage = (1+(int)(Math.random()*2));
	}
	public int getEnemyLightDamage()
	{
		return enemyLightDamage;
	}
	public void setEnemyMediumDamage()
	{
		enemyMediumDamage = (1+(int)(Math.random()*3));
	}
	public int getEnemyMediumDamage()
	{
		return enemyMediumDamage;
	}
	public void setEnemyHeavyDamage()
	{
		enemyHeavyDamage = (1+(int)(Math.random()*2));
	}
	public int getEnemyHeavyDamage()
	{
		return enemyHeavyDamage;
	}
	public void setEnemyDamageBlocked()
	{
		enemyDamageBlocked = (1+(int)(Math.random()*3));
	}
	public int getEnemyDamageBlocked()
	{
		return enemyDamageBlocked;
	}
	public void setEnemyHealth(int enemyHealth, int enemyDamageReceived)
	{
		int check;
		check = enemyHealth - enemyDamageReceived;
		if (check < 0)
			this.enemyHealth = 0;
		else
			this.enemyHealth = check;
	}
	public int getEnemyHealth()
	{
		return enemyHealth;
	}
	public void setEnemyDamageReceived(int enemyDamageReceived, int enemyDamageBlocked)
	{
		this.enemyDamageReceived = enemyDamageReceived - enemyDamageBlocked;
	}
	public int getEnemyDamageReceived()
	{
		return enemyDamageReceived;
	}
	public boolean enemyDodge()
	{
		enemyDodgeChange = (1+(int)(Math.random()*20));
		if (enemyDodgeChange == 1)
			enemyDodgeAmount = true;
		else
			enemyDodgeAmount = false;
		return enemyDodgeAmount;
	}
}
