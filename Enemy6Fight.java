package warriorProject;
import java.util.Scanner;
public class Enemy6Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy6DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy6 enemy6 = new Enemy6();
	City city = new City();
	static int gold = 0;
	public void enemy6Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy6.setEnemy6Health(1500, 0);
		
		System.out.println("Level 6: Cerberus Dog\n");
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
		System.out.println("\nCerberus Dog stats:");
		System.out.println("Health: "+enemy6.getEnemy6Health());
		System.out.println("Fire Spit damage: 51-53");
		System.out.println("Claws damage: 54-57");
		System.out.println("Bite damage: 58-60");
		System.out.println("Dodge percentage: 15%\n");
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
				enemy6DodgeMaybe = enemy6.enemy6Dodge();
				if (enemy6DodgeMaybe == true)
				{
					System.out.println("The Cerberus Dog successfully dodged your attack");
					enemy6.setEnemy6DamageReceived(0);
				}
				else
				{
					System.out.println("The Cerberus Dog unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleLightVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							player.attackLightWeapon();
							enemy6.setEnemy6DamageReceived(player.getLightDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
				enemy6DodgeMaybe = enemy6.enemy6Dodge();
				if (enemy6DodgeMaybe == true)
				{
					System.out.println("The Cerberus Dog successfully dodged your attack");
					enemy6.setEnemy6DamageReceived(0);
				}
				else
				{
					System.out.println("The Cerberus Dog unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleMediumVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							player.attackMediumWeapon();
							enemy6.setEnemy6DamageReceived(player.getMediumDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
				enemy6DodgeMaybe = enemy6.enemy6Dodge();
				if (enemy6DodgeMaybe == true)
				{
					System.out.println("The Cerberus Dog successfully dodged your attack");
					enemy6.setEnemy6DamageReceived(0);
				}
				else
				{
					System.out.println("The Cerberus Dog unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleHeavyVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy6.setEnemy6DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy6.setEnemy6DamageReceived(critical);
						}
						else
						{
							player.attackHeavyWeapon();
							enemy6.setEnemy6DamageReceived(player.getHeavyDamage());
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
						enemy6.setEnemy6DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy6.setEnemy6DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy6.setEnemy6DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy6.setEnemy6DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
			}
			enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
			System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy6DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCerberus Dog health: "+enemy6.getEnemy6Health()+"\n");
			if (enemy6.getEnemy6Health() <= 0)
				break;
			int Enemy6AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy6AttackChoice == 1)
			{
				enemy6.setEnemy6LightDamage();
				System.out.println("The Cerberus Dog attacks with Fire Spit\n");
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
							enemy6.setEnemy6DamageReceived(enemy6.getEnemy6LightDamage());
							System.out.println("You reflected "+enemy6.getEnemy6LightDamage()+" damage to the Cerberus Dog");
							enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy6.setEnemy6DamageReceived(enemy6.getEnemy6LightDamage()/2);
							System.out.println("You reflected "+enemy6.getEnemy6LightDamage()/2+" damage to the Cerberus Dog");
							enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
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
							player.setDamageReceived(enemy6.getEnemy6LightDamage(), player.getDamageBlocked());
							enemy6.setEnemy6DamageReceived(enemy6.getEnemy6LightDamage());
							System.out.println("You reflected "+enemy6.getEnemy6LightDamage()+" damage to the Cerberus Dog");
							enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy6.getEnemy6LightDamage(), player.getDamageBlocked());
							enemy6.setEnemy6DamageReceived(enemy6.getEnemy6LightDamage()/2);
							System.out.println("You reflected "+enemy6.getEnemy6LightDamage()/2+" damage to the Cerberus Dog");
							enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy6.getEnemy6LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy6.setEnemy6DamageReceived(player.getLightDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received 0 damage from the Cerberus Dog");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy6.setEnemy6DamageReceived(player.getLightDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setDamageReceived(enemy6.getEnemy6LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy6AttackChoice == 2)
			{
				enemy6.setEnemy6MediumDamage();
				System.out.println("The Cerberus Dog attacks with Claws\n");
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
						player.setDamageReceived(enemy6.getEnemy6MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy6.setEnemy6DamageReceived(player.getMediumDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received 0 damage from the Cerberus Dog");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy6.setEnemy6DamageReceived(player.getMediumDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setDamageReceived(enemy6.getEnemy6MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy6AttackChoice == 3)
			{
				enemy6.setEnemy6HeavyDamage();
				System.out.println("The Cerberus Dog attacks with a Bite\n");
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
						player.setDamageReceived(enemy6.getEnemy6HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy6.setEnemy6DamageReceived(player.getHeavyDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received 0 damage from the Cerberus Dog");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy6.setEnemy6DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy6.setEnemy6DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy6.setEnemy6DamageReceived(player.getHeavyDamage());
							}
						}
						enemy6.setEnemy6Health(enemy6.getEnemy6Health(), enemy6.getEnemy6DamageReceived());
						player.setDamageReceived(enemy6.getEnemy6HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy6.getEnemy6DamageReceived()+" damage to the Cerberus Dog");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Cerberus Dog");
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
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Cerberus Dog drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCerberus Dog health: "+enemy6.getEnemy6Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy6.getEnemy6Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (165+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 7)
				City.level = 7;
			if (City.health < 550)
				City.health = 550;
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

