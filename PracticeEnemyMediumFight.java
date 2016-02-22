package warriorProject;
import java.util.Scanner;
public class PracticeEnemyMediumFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, practiceEnemyMediumDodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	PracticeEnemyMedium practiceEnemyMedium = new PracticeEnemyMedium();
	PracticeArena practice = new PracticeArena();
	static int gold = 0;
	public void practiceEnemyMediumFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		practiceEnemyMedium.setPracticeEnemyMediumHealth(500, 0);
		
		System.out.println("Practice Enemy Medium\n");
		System.out.println("Your stats:");
		System.out.println("Level: "+City.level);
		System.out.println("Health: "+player.getHealth());
		System.out.println(player.getLightWeapon()+" damage: "+player.getLightWeaponDamageRange());
		System.out.println(player.getMediumWeapon()+" damage: "+player.getMediumWeaponDamageRange());
		System.out.println(player.getHeavyWeapon()+" damage: "+player.getHeavyWeaponDamageRange());
		System.out.println(player.getShield()+" block damage: "+player.getShieldDamageRange());
		System.out.println("Power Up damage: "+player.getPowerUp()+player.getPowerUpRange());
		System.out.println("Magic damage: "+player.getMagic()+player.getMagicDamageRange());
		System.out.println("Dodge percentage: 50%");
		System.out.println("\nEnemy stats:");
		System.out.println("Health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth());
		System.out.println("Whip damage: 7-8");
		System.out.println("Staff damage: 9-11");
		System.out.println("Longsword damage: 12-13");
		System.out.println("Shield block damage: 4-6");
		System.out.println("Dodge percentage: 15%\n");
		System.out.println("(1) Fight");
		System.out.println("(0) Quit");
		String quit = "";
		Scanner input = new Scanner(System.in);
		quit = input.next();
		if (quit.equals("0"))
			practice.practiceArena();
		else
			System.out.print("");
		int magicCount = 2;
		int doubleDamageVar;
		int doubleLightVar;
		int doubleMediumVar;
		int doubleHeavyVar;
		boolean magicAttack = false;
		do
		{
			int doubleDamage = (1+(int)(Math.random()*10)); 
			int doubleLight = (1+(int)(Math.random()*10)); 
			int doubleMedium = (1+(int)(Math.random()*10)); 
			int doubleHeavy = (1+(int)(Math.random()*10)); 
			int ultimateBlock = (1+(int)(Math.random()*10));
			int doubleGold = (1+(int)(Math.random()*10));
			int critical = (1+(int)(Math.random()*10));
			int dropGold = (1+(int)(Math.random()*10));
			int goldAmount = (1+(int)(Math.random()*5));
			int PracticeEnemyMediumDefenseChoice = (1+(int)(Math.random()*2));
			if (magicAttack == false)
				magicCount++;			
			if (magicCount % 3 == 0 && !player.getMagic().equals(""))
				magicAttack = true;
			if (doubleDamage == 1)
				System.out.println("DOUBLE DAMAGE INFLICTING ROUND!");
			if (doubleLight == 1)
				System.out.println("DOUBLE DAMAGE LIGHT WEAPON ROUND!");
			if (doubleMedium == 1)
				System.out.println("DOUBLE DAMAGE MEDIUM WEAPON ROUND!");
			if (doubleHeavy == 1)
				System.out.println("DOUBLE DAMAGE HEAVY WEAPON ROUND!");
			if (ultimateBlock == 1)
				System.out.println("ULTIMATE BLOCK ROUND!");
			if (doubleGold == 1)
				System.out.println("DOUBLE GOLD DROPPED ROUND!");
			System.out.println("(1) Attack with "+player.getPowerUp()+player.getLightWeapon()+"\n(2) Attack with "+player.getPowerUp()+player.getMediumWeapon()+"\n(3) Attack with "+player.getPowerUp()+player.getHeavyWeapon());
			if (magicAttack == true)
				System.out.println("(4) Attack with "+player.getPowerUp()+player.getMagic());
			choiceAttack = input.next();
			if (choiceAttack.equals("1"))
			{
				if (PracticeEnemyMediumDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleLightVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getLightDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked()+" damage");
				}
				else if (PracticeEnemyMediumDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					practiceEnemyMediumDodgeMaybe = practiceEnemyMedium.practiceEnemyMediumDodge();
					if (practiceEnemyMediumDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Practice Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (PracticeEnemyMediumDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleMediumVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMediumDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked()+" damage");
				}
				else if (PracticeEnemyMediumDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					practiceEnemyMediumDodgeMaybe = practiceEnemyMedium.practiceEnemyMediumDodge();
					if (practiceEnemyMediumDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Practice Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (PracticeEnemyMediumDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleHeavyVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
							practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHeavyDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked()+" damage");
				}
				else if (PracticeEnemyMediumDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					practiceEnemyMediumDodgeMaybe = practiceEnemyMedium.practiceEnemyMediumDodge();
					if (practiceEnemyMediumDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Practice Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHeavyDamage(), 0);
							}
						}
					}
				}
			}
			else if (magicAttack == true && choiceAttack.equals("4"))
			{
				magicAttack = false;
				if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*4;
						System.out.println("CRITICAL HIT!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						player.attackMagic();
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMagicDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Practice Enemy blocked "+practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked()+" damage");
			}
			practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
			System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && practiceEnemyMediumDodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Practice Enemy drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Practice Enemy drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth()+"\n");
			if (practiceEnemyMedium.getPracticeEnemyMediumHealth() <= 0)
				break;
			int PracticeEnemyMediumAttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (PracticeEnemyMediumAttackChoice == 1)
			{
				practiceEnemyMedium.setPracticeEnemyMediumLightDamage();
				System.out.println("The Practice Enemy attacks with Whip\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (ultimateBlock == 1)
					{
						player.setDamageReceived(0, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumLightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
					player.calculateHealth();
				}
				else if (choiceDefense.equals("2"))
				{
					dodgeMaybe = player.dodge();
					if (dodgeMaybe == true)
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received 0 damage from the Practice Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumLightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
						player.calculateHealth();
					}
					dropGold = (1+(int)(Math.random()*10));
					if (dropGold == 1)
					{
						if (doubleGold == 1)
						{
							goldAmount = (1+(int)(Math.random()*5));
							goldAmount = goldAmount*2;
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (PracticeEnemyMediumAttackChoice == 2)
			{
				practiceEnemyMedium.setPracticeEnemyMediumMediumDamage();
				System.out.println("The Practice Enemy attacks with Staff\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getMediumWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (ultimateBlock == 1)
					{
						player.setDamageReceived(0, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumMediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
					player.calculateHealth();
				}
				else if (choiceDefense.equals("2"))
				{
					dodgeMaybe = player.dodge();
					if (dodgeMaybe == true)
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received 0 damage from the Practice Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumMediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
						player.calculateHealth();
					}
					dropGold = (1+(int)(Math.random()*10));
					if (dropGold == 1)
					{
						if (doubleGold == 1)
						{
							goldAmount = (1+(int)(Math.random()*5));
							goldAmount = goldAmount*2;
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (PracticeEnemyMediumAttackChoice == 3)
			{
				practiceEnemyMedium.setPracticeEnemyMediumHeavyDamage();
				System.out.println("The Practice Enemy attacks with Longsword\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHeavyWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (ultimateBlock == 1)
					{
						player.setDamageReceived(0, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
					player.calculateHealth();
				}
				else if (choiceDefense.equals("2"))
				{
					dodgeMaybe = player.dodge();
					if (dodgeMaybe == true)
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received 0 damage from the Practice Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Practice Enemy");
						player.calculateHealth();
					}
					dropGold = (1+(int)(Math.random()*10));
					if (dropGold == 1)
					{
						if (doubleGold == 1)
						{
							goldAmount = (1+(int)(Math.random()*5));
							goldAmount = goldAmount*2;
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Practice Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth()+"\n");
		} while ((player.getHealth() > 0) && (practiceEnemyMedium.getPracticeEnemyMediumHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = 10;
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded 10 gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
		}
		else
		{
			System.out.println("Defeat");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
		}
	}
}
