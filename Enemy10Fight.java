package warriorProject;
import java.util.Scanner;
// Dragon
public class Enemy10Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy10 enemy10 = new Enemy10();
	City city = new City();
	static int gold = 0;
	public void enemy10Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy10.setEnemy10Health(3000, 0);
		
		System.out.println("Level 10: Dragon\n");
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
		System.out.println("\nDragon stats:");
		System.out.println("Health: "+enemy10.getEnemy10Health());
		System.out.println("Claws damage: 91-93");
		System.out.println("Tail damage: 94-97");
		System.out.println("Bite damage: 98-100");
		System.out.println("Fire Breath damage: 101-110");
		System.out.println("If Dragon attacks with Fire Breath it is out of reach until the round is over");
		System.out.println("Dragon takes half damage for first 1000 health\n");
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
				System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
				if (doubleDamage == 1 && doubleLight == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackLightWeapon()*4;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else if (doubleLight == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleLightVar = player.attackLightWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleLightVar);
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackLightWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						player.attackLightWeapon();
						enemy10.setEnemy10DamageReceived(player.getLightDamage());
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
				if (doubleDamage == 1 && doubleMedium == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMediumWeapon()*4;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else if (doubleMedium == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleMediumVar = player.attackMediumWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleMediumVar);
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMediumWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						player.attackMediumWeapon();
						enemy10.setEnemy10DamageReceived(player.getMediumDamage());
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
				if (doubleDamage == 1 && doubleHeavy == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackHeavyWeapon()*4;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else if (doubleHeavy == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleHeavyVar = player.attackHeavyWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleHeavyVar);
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackHeavyWeapon()*2;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						player.attackHeavyWeapon();
						enemy10.setEnemy10DamageReceived(player.getHeavyDamage());
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
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy10.setEnemy10DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy10.setEnemy10DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy10.setEnemy10DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
			}
			enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
			System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Dragon drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Dragon drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nDragon health: "+enemy10.getEnemy10Health()+"\n");
			if (enemy10.getEnemy10Health() <= 0)
				break;
			int Enemy10AttackChoice = (1+(int)(Math.random()*4));
			critical = (1+(int)(Math.random()*10));
			if (Enemy10AttackChoice == 1)
			{
				enemy10.setEnemy10LightDamage();
				System.out.println("The Dragon attacks with Claws\n");
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
						player.setDamageReceived(enemy10.getEnemy10LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy10.setEnemy10DamageReceived(player.getLightDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received 0 damage from the Dragon");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy10.setEnemy10DamageReceived(player.getLightDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setDamageReceived(enemy10.getEnemy10LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy10AttackChoice == 2)
			{
				enemy10.setEnemy10MediumDamage();
				System.out.println("The Dragon attacks with Tail\n");
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
						player.setDamageReceived(enemy10.getEnemy10MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy10.setEnemy10DamageReceived(player.getMediumDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received 0 damage from the Dragon");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy10.setEnemy10DamageReceived(player.getMediumDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setDamageReceived(enemy10.getEnemy10MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy10AttackChoice == 3)
			{
				enemy10.setEnemy10HeavyDamage();
				System.out.println("The Dragon attacks with a Bite\n");
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
						player.setDamageReceived(enemy10.getEnemy10HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy10.setEnemy10DamageReceived(player.getHeavyDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received 0 damage from the Dragon");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy10.setEnemy10DamageReceived(player.getHeavyDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setDamageReceived(enemy10.getEnemy10HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			if (Enemy10AttackChoice == 4)
			{
				enemy10.setEnemy10FireDamage();
				System.out.println("The Dragon flies in the air and attacks with Fire Breath\n");
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
							enemy10.setEnemy10DamageReceived(enemy10.getEnemy10FireDamage());
							System.out.println("You reflected "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
							enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy10.setEnemy10DamageReceived(enemy10.getEnemy10FireDamage()/2);
							System.out.println("You reflected "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
							enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
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
							player.setDamageReceived(enemy10.getEnemy10FireDamage(), player.getDamageBlocked());
							enemy10.setEnemy10DamageReceived(enemy10.getEnemy10FireDamage());
							System.out.println("You reflected "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
							enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy10.getEnemy10FireDamage(), player.getDamageBlocked());
							enemy10.setEnemy10DamageReceived(enemy10.getEnemy10FireDamage()/2);
							System.out.println("You reflected "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
							enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy10.getEnemy10FireDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy10.setEnemy10DamageReceived(player.getLightDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received 0 damage from the Dragon");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy10.setEnemy10DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy10.setEnemy10DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy10.setEnemy10DamageReceived(player.getLightDamage());
							}
						}
						enemy10.setEnemy10Health(enemy10.getEnemy10Health(), enemy10.getEnemy10DamageReceived());
						player.setDamageReceived(enemy10.getEnemy10FireDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy10.getEnemy10DamageReceived()+" damage to the Dragon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Dragon");
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
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Dragon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nDragon health: "+enemy10.getEnemy10Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy10.getEnemy10Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (285+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			System.out.println("Congratulations! You have defeated all of the monsters attacking the city of Berg and saved its people.");
			System.out.println("Those who are left will start to rebuild the city to its former greatness, and you will sit on the throne as the new king of the city of Berg.\n");
			System.exit(0);
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

