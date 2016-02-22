package warriorProject;

public class Health
{
	private int newHealthAmount;
	public int health(int healthAmount, int damageReceived)
	{
		int check;
		check = healthAmount - damageReceived;
		if (check < 0)
			newHealthAmount = 0;
		else
			newHealthAmount = check;
		return newHealthAmount;
	}
}
