package warriorProject;

import java.util.Scanner;

public class PracticeArena
{
	public void practiceArena()
	{
		City city = new City();
		PracticeEnemyEasyFight practiceFightEasy = new PracticeEnemyEasyFight();
		PracticeEnemyMediumFight practiceFightMedium = new PracticeEnemyMediumFight();
		PracticeEnemyHardFight practiceFightHard = new PracticeEnemyHardFight();
		String practiceChoice;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("\n\n* * * * * * * * *\n Practice Arena\n* * * * * * * * *\n");
			System.out.println("Gold: "+City.gold);
			System.out.println("Level: "+City.level+"\n");
			System.out.println("Choose the enemy that you want to practice fighting against\n");
			System.out.println("(1) Practice Enemy Easy");
			System.out.println("(2) Practice Enemy Medium");
			System.out.println("(3) Practice Enemy Hard");
			System.out.println("(4) Exit");
			practiceChoice = input.next();
			if (practiceChoice.equals("1"))
				practiceFightEasy.practiceEnemyEasyFight();
			if (practiceChoice.equals("2"))
				practiceFightMedium.practiceEnemyMediumFight();
			if (practiceChoice.equals("3"))
				practiceFightHard.practiceEnemyHardFight();
			if (practiceChoice.equals("4"))
				city.city();
		} while (!practiceChoice.equals("4"));
	}
}
