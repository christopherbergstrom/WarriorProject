package warriorProject;
import java.util.Scanner;
public class City
{
	static int gold = 0;	
	static int level = 1;
	static int health = 250;
	int count1 = 3, count2 = 3, count3 = 3, count4 = 3;
	public void city()
	{
		Scanner input = new Scanner(System.in);
		String menu, quit, local;
		Enemy1Fight fight1 = new Enemy1Fight();
		Enemy2Fight fight2 = new Enemy2Fight();
		Enemy3Fight fight3 = new Enemy3Fight();
		Enemy4Fight fight4 = new Enemy4Fight();
		Enemy5Fight fight5 = new Enemy5Fight();
		Enemy6Fight fight6 = new Enemy6Fight();
		Enemy7Fight fight7 = new Enemy7Fight();
		Enemy8Fight fight8 = new Enemy8Fight();
		Enemy9Fight fight9 = new Enemy9Fight();
		Enemy10Fight fight10 = new Enemy10Fight();
		WeaponShop weaponShop = new WeaponShop();
		PracticeArena practice = new PracticeArena();
		Instructions instructions = new Instructions();
		do
		{
			System.out.println("\n\n* * * * * * * *\n City of Berg\n* * * * * * * *\n");
			System.out.println("Gold: "+gold);
			System.out.println("Level: "+level+"\n");
			if (level >= 1)
				System.out.println("(1) Level One Skeleton Archer");
			if (level >= 2)
				System.out.println("(2) Level Two Undead Soldier");
			if (level >= 3)
				System.out.println("(3) Level Three Harpy");
			if (level >= 4)
				System.out.println("(4) Level Four Gorgon");
			if (level >= 5)
				System.out.println("(5) Level Five Centaur");
			if (level >= 6)
				System.out.println("(6) Level Six Cerberus Dog");
			if (level >= 7)
				System.out.println("(7) Level Seven Giant Spider");
			if (level >= 8)
				System.out.println("(8) Level Eight Minotaur");
			if (level >= 9)
				System.out.println("(9) Level Nine Cyclops");
			if (level >= 10)
				System.out.println("(10) Level Ten Dragon");
				
			System.out.println("(11) Weapon Shop");
			System.out.println("(12) Practice Arena");
			System.out.println("(13) Talk to Locals");
			System.out.println("(14) Instructions");
			System.out.println("(15) Quit");
			menu = input.next();
			if (menu.equals("1") && level >= 1)
				fight1.enemy1Fight();
			if (menu.equals("2") && level >= 2)
				fight2.enemy2Fight();
			if (menu.equals("3") && level >= 3)
				fight3.enemy3Fight();
			if (menu.equals("4") && level >= 4)
				fight4.enemy4Fight();
			if (menu.equals("5") && level >= 5)
				fight5.enemy5Fight();
			if (menu.equals("6") && level >= 6)
				fight6.enemy6Fight();
			if (menu.equals("7") && level >= 7)
				fight7.enemy7Fight();
			if (menu.equals("8") && level >= 8)
				fight8.enemy8Fight();
			if (menu.equals("9") && level >= 9)
				fight9.enemy9Fight();
			if (menu.equals("10") && level >= 10)
				fight10.enemy10Fight();
			if (menu.equals("11"))
				weaponShop.weaponShop();
			if (menu.equals("12"))
				practice.practiceArena();
			while (menu.equals("13"))
			{
				System.out.println("(1) City Ruler");
				System.out.println("(2) Child");
				System.out.println("(3) Injured Soldier");
				System.out.println("(4) Wife of Killed Soldier");
				System.out.println("(5) Leave");
				local = input.next();
				if (local.equals("1"))
				{
					if (count1 % 3 == 0)
					{
						System.out.println("I have unwillingly taken up the position of the ruler of this city due to the last king dying of old age.");
						System.out.println("I never thought of him as a good king, especially with him being the first king from a foreign city.\n");
					}
					if (count1 % 3 == 1)
						System.out.println("It is my burden now to look after the people of the city of Berg, although I’m afraid I can’t do much for them.\n");
					if (count1 % 3 == 2)
						System.out.println("I put on a kind face for everyone, but I feel that I am dealing with the situation worse than any of them.\n");
					count1++;
				}
				if (local.equals("2"))
				{
					if (count2 % 3 == 0)
						System.out.println("I haven’t seen the monsters, but they sound scary.\n");
					if (count2 % 3 == 1)
						System.out.println("Please help us.\n");
					if (count2 % 3 == 2)
						System.out.println("Sometimes I can’t sleep at night because I have nightmares about the monsters.\n");
					count2++;
				}
				if (local.equals("3"))
				{
					if (count3 % 3 == 0)
						System.out.println("It’s nice to meet you, I haven’t seen another soldier in a long time now.\n");
					if (count3 % 3 == 1)
						System.out.println("I was the last to try to fight off those nightmarish creatures, and the only one to survive...\n");
					if (count3 % 3 == 2)
						System.out.println("I wish I could help you, but with the loss of my leg I’m no longer able to fight.\n");
					count3++;
				}
				if (local.equals("4"))
				{
					if (count4 % 3 == 0)
						System.out.println("Hello...\n");
					if (count4 % 3 == 1)
						System.out.println("I hope you can save what is left of our once great city.\n");
					if (count4 % 3 == 2)
						System.out.println("You remind me of my husband, I hope his fate doesn’t become your own.\n");
					count4++;
				}
				if (local.equals("5"))
					break;
			}
			if (menu.equals("14"))
				instructions.instructions();
			while (menu.equals("15"))
			{
				System.out.println("Are you sure you want to quit?");
				System.out.println("(1) Keep playing");
				System.out.println("(2) Quit");
				quit = input.next();
				if (quit.equals("1"))
					break;
				if (quit.equals("2"))
					System.exit(0);
			}
//			else
//				System.out.println("Wrong number");
		} while (true);
	}
}
