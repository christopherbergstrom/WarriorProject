package warriorProject;
import java.util.Scanner;
// Giant Spider
public class Enemy7Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy7DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy7 enemy7 = new Enemy7();
	City city = new City();
	static int gold = 0;
	public void enemy7Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy7.setEnemy7Health(1750, 0);
		
		System.out.println("Level 7: Giant Spider\n");
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
		System.out.println("\nGiant Spider stats:");
		System.out.println("Health: "+enemy7.getEnemy7Health());
		System.out.println("Trample damage: 61-63");
		System.out.println("Bite damage: 64-67");
		System.out.println("Stinger damage: 68-70");
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
				enemy7DodgeMaybe = enemy7.enemy7Dodge();
				if (enemy7DodgeMaybe == true)
				{
					System.out.println("The Giant Spider successfully dodged your attack");
					enemy7.setEnemy7DamageReceived(0);
				}
				else
				{
					System.out.println("The Giant Spider unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleLightVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							player.attackLightWeapon();
							enemy7.setEnemy7DamageReceived(player.getLightDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
				enemy7DodgeMaybe = enemy7.enemy7Dodge();
				if (enemy7DodgeMaybe == true)
				{
					System.out.println("The Giant Spider successfully dodged your attack");
					enemy7.setEnemy7DamageReceived(0);
				}
				else
				{
					System.out.println("The Giant Spider unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleMediumVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							player.attackMediumWeapon();
							enemy7.setEnemy7DamageReceived(player.getMediumDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
				enemy7DodgeMaybe = enemy7.enemy7Dodge();
				if (enemy7DodgeMaybe == true)
				{
					System.out.println("The Giant Spider successfully dodged your attack");
					enemy7.setEnemy7DamageReceived(0);
				}
				else
				{
					System.out.println("The Giant Spider unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleHeavyVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy7.setEnemy7DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy7.setEnemy7DamageReceived(critical);
						}
						else
						{
							player.attackHeavyWeapon();
							enemy7.setEnemy7DamageReceived(player.getHeavyDamage());
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
						enemy7.setEnemy7DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy7.setEnemy7DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy7.setEnemy7DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy7.setEnemy7DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
			}
			enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
			System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy7DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Giant Spider drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Giant Spider drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGiant Spider health: "+enemy7.getEnemy7Health()+"\n");
			if (enemy7.getEnemy7Health() <= 0)
				break;
			int Enemy7AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy7AttackChoice == 1)
			{
				enemy7.setEnemy7LightDamage();
				System.out.println("The Giant Spider tries to Trample you\n");
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
						player.setDamageReceived(enemy7.getEnemy7LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy7.setEnemy7DamageReceived(player.getLightDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received 0 damage from the Giant Spider");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy7.setEnemy7DamageReceived(player.getLightDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setDamageReceived(enemy7.getEnemy7LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy7AttackChoice == 2)
			{
				enemy7.setEnemy7MediumDamage();
				System.out.println("The Giant Spider attacks with a Bite\n");
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
						player.setDamageReceived(enemy7.getEnemy7MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy7.setEnemy7DamageReceived(player.getMediumDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received 0 damage from the Giant Spider");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy7.setEnemy7DamageReceived(player.getMediumDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setDamageReceived(enemy7.getEnemy7MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy7AttackChoice == 3)
			{
				enemy7.setEnemy7HeavyDamage();
				System.out.println("The Giant Spider attacks with Stinger\n");
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
						player.setDamageReceived(enemy7.getEnemy7HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy7.setEnemy7DamageReceived(player.getHeavyDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received 0 damage from the Giant Spider");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy7.setEnemy7DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy7.setEnemy7DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy7.setEnemy7DamageReceived(player.getHeavyDamage());
							}
						}
						enemy7.setEnemy7Health(enemy7.getEnemy7Health(), enemy7.getEnemy7DamageReceived());
						player.setDamageReceived(enemy7.getEnemy7HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy7.getEnemy7DamageReceived()+" damage to the Giant Spider");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Giant Spider");
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
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Giant Spider drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGiant Spider health: "+enemy7.getEnemy7Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy7.getEnemy7Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (195+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 8)
				City.level = 8;
			if (City.health < 600)
				City.health = 600;
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

