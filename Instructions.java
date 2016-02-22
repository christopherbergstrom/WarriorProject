package warriorProject;
import java.util.Scanner;
public class Instructions
{
	City city = new City();
	public void instructions()
	{
		Scanner input = new Scanner(System.in);
		String menu = "";
		System.out.println("\n\n* * * * * * * *\n Instructions\n* * * * * * * *\n");
		System.out.println("At each screen, you are presented with a list of numbers.");
		System.out.println("Typing a number and pressing ENTER will result in the action associated with that number being executed.");
		System.out.println("Throughout the game, you will have six weapon categories: Light, Medium, Heavy, Shields, Power Ups, and Magic.");
		System.out.println("You level up by defeating enemies. Each time you level up, your weapons' stats will automatically increase.");
		System.out.println("When it is your turn to attack in each round, you are able to attack using any purchased weapon that is currently selected.");
		System.out.println("Light, Medium, and Heavy weapons will always be (1), (2), and (3), unless the enemy is out of range.");
		System.out.println("Each enemy has a Light, Medium, and Heavy attack, as well as the option to block or dodge your attack, although the last two will vary between enemies.");
		System.out.println("When the enemy attacks, you only have the options to block, or try to dodge and attack, using the same degree of weapon that the enemy attacked with.");
		System.out.println("If you fail to dodge the attack, you will still inflict damage on the enemy. Enemies cannot block or dodge this damage.");
		System.out.println("Each category has several different selections of weapons.");
		System.out.println("You can visit the weapon shop to view stats on weapons purchased or unpurchased, buy new weapons, and view your current loadout.");
		System.out.println("You can buy new weapons with gold. You accumulate gold by defeating enemies and when enemies randomly drop gold.");
		System.out.println("At the beginning of each round, there are several special boosts that will randomly be activated. These boosts are only active for one round.");
		System.out.println("  DOUBLE DAMAGE INFLICTING ROUND: Every attack you choose will inflict double the normal damage (not applicable to the Reflector Shield).");
		System.out.println("  DOUBLE DAMAGE LIGHT WEAPON ROUND: The current Light weapon will inflict double the normal damage.");
		System.out.println("  DOUBLE DAMAGE MEDIUM WEAPON ROUND: The current Medium weapon will inflict double the normal damage.");
		System.out.println("  DOUBLE DAMAGE HEAVY WEAPON ROUND: The current Heavy weapon will inflict double the normal damage.");
		System.out.println("  ULTIMATE BLOCK ROUND: If you choose to block the enemy's attack, you will block 100% of the attack, regardless of what shield you have.");
		System.out.println("  DOUBLE GOLD DROPPED ROUND: If the enemy drops gold, it will drop double the normal amount.");
		System.out.println("  CRITICAL HIT: Randomly happens at any point mid game. It too, inflicts double the normal damage for any attack (including the Reflector Shield).");
		System.out.println("These boosts will all build on each other, meaning if you have the DOUBLE DAMAGE INFLICTING ROUND and the DOUBLE DAMAGE HEAVY WEAPON ROUND");
		System.out.println("  and you choose to attack with your heavy weapon, it will inflict four times the normal damage,");
		System.out.println("  and if you get a CRITICAL HIT with both of those boosts active, it will inflict eight times the normal damage.");
		System.out.println("\n(0) Back");
		menu = input.next();
		if (menu.equals("0"))
			city.city();
		else
			city.city();	
	}
}
