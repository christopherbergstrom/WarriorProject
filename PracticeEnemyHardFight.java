package warriorProject;
import java.util.Scanner;
public class PracticeEnemyHardFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, practiceEnemyHardDodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	PracticeEnemyHard practiceEnemyHard = new PracticeEnemyHard();
	PracticeArena practice = new PracticeArena();
	static int gold = 0;
	public void practiceEnemyHardFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		practiceEnemyHard.setPracticeEnemyHardHealth(750, 0);
		
		System.out.println("Practice Enemy Hard\n");
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
		System.out.println("Health: "+practiceEnemyHard.getPracticeEnemyHardHealth());
		System.out.println("Bow damage: 15-16");
		System.out.println("Mace damage: 18-20");
		System.out.println("Trident damage: 22-23");
		System.out.println("Shield block damage: 8-10");
		System.out.println("Dodge percentage: 20%\n");
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
			int PracticeEnemyHardDefenseChoice = (1+(int)(Math.random()*2));
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
				if (PracticeEnemyHardDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleLightVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getLightDamage(), practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyHard.getPracticeEnemyHardDamageBlocked()+" damage");
				}
				else if (PracticeEnemyHardDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					practiceEnemyHardDodgeMaybe = practiceEnemyHard.practiceEnemyHardDodge();
					if (practiceEnemyHardDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(0, 0);
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (PracticeEnemyHardDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleMediumVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getMediumDamage(), practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyHard.getPracticeEnemyHardDamageBlocked()+" damage");
				}
				else if (PracticeEnemyHardDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					practiceEnemyHardDodgeMaybe = practiceEnemyHard.practiceEnemyHardDodge();
					if (practiceEnemyHardDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(0, 0);
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (PracticeEnemyHardDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleHeavyVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getHeavyDamage(), practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyHard.getPracticeEnemyHardDamageBlocked()+" damage");
				}
				else if (PracticeEnemyHardDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					practiceEnemyHardDodgeMaybe = practiceEnemyHard.practiceEnemyHardDodge();
					if (practiceEnemyHardDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(0, 0);
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getHeavyDamage(), 0);
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
						practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
					}
					else
					{
						player.attackMagic();
						practiceEnemyHard.setPracticeEnemyHardDamageBlocked();
						practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getMagicDamage(), practiceEnemyHard.getPracticeEnemyHardDamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Practice Enemy blocked "+practiceEnemyHard.getPracticeEnemyHardDamageBlocked()+" damage");
			}
			practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
			System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && practiceEnemyHardDodgeMaybe == false)
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyHard.getPracticeEnemyHardHealth()+"\n");
			if (practiceEnemyHard.getPracticeEnemyHardHealth() <= 0)
				break;
			int PracticeEnemyHardAttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (PracticeEnemyHardAttackChoice == 1)
			{
				practiceEnemyHard.setPracticeEnemyHardLightDamage();
				System.out.println("The Practice Enemy attacks with Bow\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (ultimateBlock == 1 && player.getShield().equals("Reflector Shield"))
					{
						if (critical == 1)
						{
							System.out.println("CRITICAL HIT!");
							player.setDamageReceived(0, player.getDamageBlocked());
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), 0);
							System.out.println("You reflected "+practiceEnemyHard.getPracticeEnemyHardLightDamage()+" damage to the Practice Enemy");							
							practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						}
						else
						{
							player.setDamageReceived(0, player.getDamageBlocked());
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage()/2, 0);
							System.out.println("You reflected "+practiceEnemyHard.getPracticeEnemyHardLightDamage()/2+" damage to the Practice Enemy");							
							practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						}
					}
					else if (ultimateBlock == 1)
					{
						player.setDamageReceived(0, player.getDamageBlocked());
					}
					else if (player.getShield().equals("Reflector Shield"))
					{
						if (critical == 1)
						{
							System.out.println("CRITICAL HIT!");
							player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), player.getDamageBlocked());
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), 0);
							System.out.println("You reflected "+practiceEnemyHard.getPracticeEnemyHardLightDamage()+" damage to the Practice Enemy");														
							practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						}
						else
						{
							player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), player.getDamageBlocked());
							practiceEnemyHard.setPracticeEnemyHardDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage()/2, 0);
							System.out.println("You reflected "+practiceEnemyHard.getPracticeEnemyHardLightDamage()/2+" damage to the Practice Enemy");							
							practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), player.getDamageBlocked());
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardLightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
			else if (PracticeEnemyHardAttackChoice == 2)
			{
				practiceEnemyHard.setPracticeEnemyHardMediumDamage();
				System.out.println("The Practice Enemy attacks with Mace\n");
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
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardMediumDamage(), player.getDamageBlocked());
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardMediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
			else if (PracticeEnemyHardAttackChoice == 3)
			{
				practiceEnemyHard.setPracticeEnemyHardHeavyDamage();
				System.out.println("The Practice Enemy attacks with Trident\n");
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
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardHeavyDamage(), player.getDamageBlocked());
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyHard.setPracticeEnemyHardDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyHard.setPracticeEnemyHardHealth(practiceEnemyHard.getPracticeEnemyHardHealth(), practiceEnemyHard.getPracticeEnemyHardDamageReceived());
						player.setDamageReceived(practiceEnemyHard.getPracticeEnemyHardHeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyHard.getPracticeEnemyHardDamageReceived()+" damage to the Practice Enemy");
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyHard.getPracticeEnemyHardHealth()+"\n");
		} while ((player.getHealth() > 0) && (practiceEnemyHard.getPracticeEnemyHardHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = 15;
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded 15 gold");
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
