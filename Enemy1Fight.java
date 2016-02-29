package warriorProject;
import java.util.Scanner;
// Skeleton Archer
public class Enemy1Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy1DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy1 enemy1 = new Enemy1();
	City city = new City();
	static int gold = 0;
	public void enemy1Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy1.setEnemy1Health(250, 0);
		
		System.out.println("Level 1: Skeleton Archer\n");
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
		System.out.println("\nSkeleton Archer stats:");
		System.out.println("Health: "+enemy1.getEnemy1Health());
		System.out.println("Dagger damage: 1-3");
		System.out.println("Throwing Knives damage: 4-7");
		System.out.println("Bow damage: 8-10");
		System.out.println("Shield block damage: 1-5");
		System.out.println("Dodge percentage: 20%\n");
		System.out.println("(1) Fight");
		System.out.println("(0) Quit");
		String quit = "";
		Scanner input = new Scanner(System.in);
		quit = input.next();
		if (quit.equals("0"))
			city.city();
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
			int Enemy1DefenseChoice = (1+(int)(Math.random()*2));
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
				if (Enemy1DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleLightVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(player.getLightDamage(), enemy1.getEnemy1DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Skeleton Archer blocked "+enemy1.getEnemy1DamageBlocked()+" damage");
				}
				else if (Enemy1DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					enemy1DodgeMaybe = enemy1.enemy1Dodge();
					if (enemy1DodgeMaybe == true)
					{
						System.out.println("The Skeleton Archer successfully dodged your attack");
						enemy1.setEnemy1DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Skeleton Archer unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy1.setEnemy1DamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (Enemy1DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleMediumVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(player.getMediumDamage(), enemy1.getEnemy1DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Skeleton Archer blocked "+enemy1.getEnemy1DamageBlocked()+" damage");
				}
				else if (Enemy1DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					enemy1DodgeMaybe = enemy1.enemy1Dodge();
					if (enemy1DodgeMaybe == true)
					{
						System.out.println("The Skeleton Archer successfully dodged your attack");
						enemy1.setEnemy1DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Skeleton Archer unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy1.setEnemy1DamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (Enemy1DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleHeavyVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							enemy1.setEnemy1DamageBlocked();
							enemy1.setEnemy1DamageReceived(player.getHeavyDamage(), enemy1.getEnemy1DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Skeleton Archer blocked "+enemy1.getEnemy1DamageBlocked()+" damage");
				}
				else if (Enemy1DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					enemy1DodgeMaybe = enemy1.enemy1Dodge();
					if (enemy1DodgeMaybe == true)
					{
						System.out.println("The Skeleton Archer successfully dodged your attack");
						enemy1.setEnemy1DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Skeleton Archer unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy1.setEnemy1DamageReceived(player.getHeavyDamage(), 0);
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
						enemy1.setEnemy1DamageBlocked();
						enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy1.setEnemy1DamageBlocked();
						enemy1.setEnemy1DamageReceived(doubleDamageVar, enemy1.getEnemy1DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy1.setEnemy1DamageBlocked();
						enemy1.setEnemy1DamageReceived(critical, enemy1.getEnemy1DamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy1.setEnemy1DamageBlocked();
						enemy1.setEnemy1DamageReceived(player.getMagicDamage(), enemy1.getEnemy1DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Skeleton Archer blocked "+enemy1.getEnemy1DamageBlocked()+" damage");
			}
			enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
			System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy1DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nSkeleton Archer health: "+enemy1.getEnemy1Health()+"\n");
			if (enemy1.getEnemy1Health() <= 0)
				break;
			int Enemy1AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy1AttackChoice == 1)
			{
				enemy1.setEnemy1LightDamage();
				System.out.println("The Skeleton Archer attacks with Dagger\n");
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
						player.setDamageReceived(enemy1.getEnemy1LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy1.setEnemy1DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received 0 damage from the Skeleton Archer");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy1.setEnemy1DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setDamageReceived(enemy1.getEnemy1LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy1AttackChoice == 2)
			{
				enemy1.setEnemy1MediumDamage();
				System.out.println("The Skeleton Archer attacks with Throwing Knives\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getMediumWeapon());
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
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1MediumDamage(), 0);
							System.out.println("You reflected "+enemy1.getEnemy1MediumDamage()+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1MediumDamage()/2, 0);
							System.out.println("You reflected "+enemy1.getEnemy1MediumDamage()/2+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
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
							player.setDamageReceived(enemy1.getEnemy1MediumDamage(), player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1MediumDamage(), 0);
							System.out.println("You reflected "+enemy1.getEnemy1MediumDamage()+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy1.getEnemy1MediumDamage(), player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1MediumDamage()/2, 0);
							System.out.println("You reflected "+enemy1.getEnemy1MediumDamage()/2+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy1.getEnemy1MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy1.setEnemy1DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received 0 damage from the Skeleton Archer");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy1.setEnemy1DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setDamageReceived(enemy1.getEnemy1MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy1AttackChoice == 3)
			{
				enemy1.setEnemy1HeavyDamage();
				System.out.println("The Skeleton Archer attacks with Bow\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHeavyWeapon());
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
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1HeavyDamage(), 0);
							System.out.println("You reflected "+enemy1.getEnemy1HeavyDamage()+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1HeavyDamage()/2, 0);
							System.out.println("You reflected "+enemy1.getEnemy1HeavyDamage()/2+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
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
							player.setDamageReceived(enemy1.getEnemy1HeavyDamage(), player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1HeavyDamage(), 0);
							System.out.println("You reflected "+enemy1.getEnemy1HeavyDamage()+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy1.getEnemy1HeavyDamage(), player.getDamageBlocked());
							enemy1.setEnemy1DamageReceived(enemy1.getEnemy1HeavyDamage()/2, 0);
							System.out.println("You reflected "+enemy1.getEnemy1HeavyDamage()/2+" damage to the Skeleton Archer");
							enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy1.getEnemy1HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy1.setEnemy1DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received 0 damage from the Skeleton Archer");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy1.setEnemy1DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy1.setEnemy1DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy1.setEnemy1DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy1.setEnemy1Health(enemy1.getEnemy1Health(), enemy1.getEnemy1DamageReceived());
						player.setDamageReceived(enemy1.getEnemy1HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy1.getEnemy1DamageReceived()+" damage to the Skeleton Archer");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Skeleton Archer");
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
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Skeleton Archer drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nSkeleton Archer health: "+enemy1.getEnemy1Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy1.getEnemy1Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (15+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 2)
				City.level = 2;
			if (City.health < 250)
				City.health = 300;
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
