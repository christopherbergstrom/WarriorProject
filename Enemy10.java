package warriorProject;
//dragon
public class Enemy10
{
	// light = claws
	// medium = tail
	// heavy = bite
	// fire = fire breath
	private int enemy10Health = 3000, enemy10LightDamage, enemy10MediumDamage, enemy10HeavyDamage, enemy10FireDamage, enemy10DamageReceived;
	private int enemy10DodgeChange;
	private boolean enemy10DodgeAmount;
	public void setEnemy10LightDamage()
	{
		enemy10LightDamage = (91+(int)(Math.random()*3));
	}
	public int getEnemy10LightDamage()
	{
		return enemy10LightDamage;
	}
	public void setEnemy10MediumDamage()
	{
		enemy10MediumDamage = (94+(int)(Math.random()*4));
	}
	public int getEnemy10MediumDamage()
	{
		return enemy10MediumDamage;
	}
	public void setEnemy10HeavyDamage()
	{
		enemy10HeavyDamage = (98+(int)(Math.random()*3));
	}
	public int getEnemy10HeavyDamage()
	{
		return enemy10HeavyDamage;
	}
	public void setEnemy10FireDamage()
	{
		enemy10FireDamage = (101+(int)(Math.random()*10));
	}
	public int getEnemy10FireDamage()
	{
		return enemy10FireDamage;
	}
	public void setEnemy10Health(int enemy10Health, int enemy10DamageReceived)
	{
		int check;
		check = enemy10Health - enemy10DamageReceived;
		if (check < 0)
			this.enemy10Health = 0;
		else
			this.enemy10Health = check;
	}
	public int getEnemy10Health()
	{
		return enemy10Health;
	}
	public void setEnemy10DamageReceived(int enemy10DamageReceived)
	{
		if (enemy10Health > 2000)
			this.enemy10DamageReceived = enemy10DamageReceived/2;
		else if (enemy10Health <= 2000)
			this.enemy10DamageReceived = enemy10DamageReceived;
	}
	public int getEnemy10DamageReceived()
	{
		return enemy10DamageReceived;
	}
	public boolean enemy10Dodge()
	{
		enemy10DodgeChange = (1+(int)(Math.random()*10));
		if (enemy10DodgeChange == 1)
			enemy10DodgeAmount = true;
		else
			enemy10DodgeAmount = false;
		return enemy10DodgeAmount;
	}
}
