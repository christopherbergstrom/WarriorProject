package warriorProject;
import java.util.Scanner;
public class PracticeEnemyEasyFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, practiceEnemyEasyDodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	PracticeEnemyEasy practiceEnemyEasy = new PracticeEnemyEasy();
	PracticeArena practice = new PracticeArena();
	static int gold = 0;
	public void practiceEnemyEasyFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		practiceEnemyEasy.setPracticeEnemyEasyHealth(250, 0);
		
		System.out.println("Practice Enemy Easy\n");
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
		System.out.println("Health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth());
		System.out.println("Sling Shot damage: 1-2");
		System.out.println("Dagger damage: 2-4");
		System.out.println("Club damage: 4-5");
		System.out.println("Shield block damage: 1-3");
		System.out.println("Dodge percentage: 10%\n");
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
			int practiceEnemyEasyDefenseChoice = (1+(int)(Math.random()*2));
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
				if (practiceEnemyEasyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleLightVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getLightDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked()+" damage");
				}
				else if (practiceEnemyEasyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					practiceEnemyEasyDodgeMaybe = practiceEnemyEasy.practiceEnemyEasyDodge();
					if (practiceEnemyEasyDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(0, 0);
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (practiceEnemyEasyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleMediumVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMediumDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked()+" damage");
				}
				else if (practiceEnemyEasyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					practiceEnemyEasyDodgeMaybe = practiceEnemyEasy.practiceEnemyEasyDodge();
					if (practiceEnemyEasyDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(0, 0);
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (practiceEnemyEasyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleHeavyVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHeavyDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Practice Enemy blocked "+practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked()+" damage");
				}
				else if (practiceEnemyEasyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					practiceEnemyEasyDodgeMaybe = practiceEnemyEasy.practiceEnemyEasyDodge();
					if (practiceEnemyEasyDodgeMaybe == true)
					{
						System.out.println("The Practice Enemy successfully dodged your attack");
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(0, 0);
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHeavyDamage(), 0);
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
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						player.attackMagic();
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMagicDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Practice Enemy blocked "+practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked()+" damage");
			}
			practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
			System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && practiceEnemyEasyDodgeMaybe == false)
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth()+"\n");
			if (practiceEnemyEasy.getPracticeEnemyEasyHealth() <= 0)
				break;
			int PracticeEnemyEasyAttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (PracticeEnemyEasyAttackChoice == 1)
			{
				practiceEnemyEasy.setPracticeEnemyEasyLightDamage();
				System.out.println("The Practice Enemy attacks with Sling Shot\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (ultimateBlock == 1 && player.getShield().equals("Reflector Shield"))
					{
						if (critical == 1)
						{
							critical = practiceEnemyEasy.getPracticeEnemyEasyLightDamage()*2;
							System.out.println("CRITICAL HIT!");
							player.setDamageReceived(0, player.getDamageBlocked());
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							System.out.println("You reflected "+practiceEnemyEasy.getPracticeEnemyEasyLightDamage()+" damage to the Practice Enemy");							
							practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						}
						else
						{
							player.setDamageReceived(0, player.getDamageBlocked());
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(1, 0);
							System.out.println("You reflected "+practiceEnemyEasy.getPracticeEnemyEasyLightDamage()+" damage to the Practice Enemy");							
							practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
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
							critical = practiceEnemyEasy.getPracticeEnemyEasyLightDamage()*2;
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyLightDamage(), player.getDamageBlocked());
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							System.out.println("You reflected "+practiceEnemyEasy.getPracticeEnemyEasyLightDamage()+" damage to the Practice Enemy");
							practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						}
						else
						{							
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyLightDamage(), player.getDamageBlocked());
							practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(1, 0);
							System.out.println("You reflected "+practiceEnemyEasy.getPracticeEnemyEasyLightDamage()+" damage to the Practice Enemy");
							practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyLightDamage(), player.getDamageBlocked());
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getLightDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyLightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
			else if (PracticeEnemyEasyAttackChoice == 2)
			{
				practiceEnemyEasy.setPracticeEnemyEasyMediumDamage();
				System.out.println("The Practice Enemy attacks with Dagger\n");
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
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyMediumDamage(), player.getDamageBlocked());
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMediumDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyMediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
			else if (PracticeEnemyEasyAttackChoice == 3)
			{
				practiceEnemyEasy.setPracticeEnemyEasyHeavyDamage();
				System.out.println("The Practice Enemy attacks with Club\n");
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
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHeavyDamage(), player.getDamageBlocked());
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth()+"\n");
		} while ((player.getHealth() > 0) && (practiceEnemyEasy.getPracticeEnemyEasyHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = 5;
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded 5 gold");
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
