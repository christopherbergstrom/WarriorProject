package warriorProject;

public class Dodge
{
	private int dodgeChange;
	private boolean dodgeAmount;
	public boolean dodge()
	{
		dodgeChange = (1+(int)(Math.random()*2));
		if (dodgeChange == 1)
			dodgeAmount = true;
		else
			dodgeAmount = false;
		return dodgeAmount;
	}
}
