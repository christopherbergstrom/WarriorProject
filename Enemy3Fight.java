package warriorProject;
import java.util.Scanner;
// Harpy
public class Enemy3Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy3DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy3 enemy3 = new Enemy3();
	City city = new City();
	static int gold = 0;
	public void enemy3Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy3.setEnemy3Health(750, 0);
		
		System.out.println("Level 3: Harpy\n");
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
		System.out.println("\nHarpy stats:");
		System.out.println("Health: "+enemy3.getEnemy3Health());
		System.out.println("Piercing Scream damage: 21-23");
		System.out.println("Acid Spit damage: 24-27");
		System.out.println("Tallons damage: 28-30");
		System.out.println("Dodge percentage: 10%");
		System.out.println("Harpy is constantly flying and is out of reach unless it attacks with Tallons\n");
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
			System.out.println("(1) Attack with "+player.getPowerUp()+player.getLightWeapon());
			if (magicAttack == true)
				System.out.println("(2) Attack with "+player.getPowerUp()+player.getMagic());
			choiceAttack = input.next();
			if (choiceAttack.equals("1"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
				enemy3DodgeMaybe = enemy3.enemy3Dodge();
				if (enemy3DodgeMaybe == true)
				{
					System.out.println("The Harpy successfully dodged your attack");
					enemy3.setEnemy3DamageReceived(0);
				}
				else
				{
					System.out.println("The Harpy unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy3.setEnemy3DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy3.setEnemy3DamageReceived(doubleLightVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy3.setEnemy3DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							player.attackLightWeapon();
							enemy3.setEnemy3DamageReceived(player.getLightDamage());
						}
					}
				}
			}
			else if (magicAttack == true && choiceAttack.equals("2"))
			{
				magicAttack = false;
				if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*4;
						System.out.println("CRITICAL HIT!");
						enemy3.setEnemy3DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy3.setEnemy3DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy3.setEnemy3DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy3.setEnemy3DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
			}
			enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
			System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy3DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Harpy drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Harpy drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nHarpy health: "+enemy3.getEnemy3Health()+"\n");
			if (enemy3.getEnemy3Health() <= 0)
				break;
			int Enemy3AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy3AttackChoice == 1)
			{
				enemy3.setEnemy3LightDamage();
				System.out.println("The Harpy attacks with a Piercing Scream\n");
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
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3LightDamage());
							System.out.println("You reflected "+enemy3.getEnemy3LightDamage()+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3LightDamage()/2);
							System.out.println("You reflected "+enemy3.getEnemy3LightDamage()/2+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
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
							player.setDamageReceived(enemy3.getEnemy3LightDamage(), player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3LightDamage());
							System.out.println("You reflected "+enemy3.getEnemy3LightDamage()+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy3.getEnemy3LightDamage(), player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3LightDamage()/2);
							System.out.println("You reflected "+enemy3.getEnemy3LightDamage()/2+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemy3LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received 0 damage from the Harpy");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setDamageReceived(enemy3.getEnemy3LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy3AttackChoice == 2)
			{
				enemy3.setEnemy3MediumDamage();
				System.out.println("The Harpy attacks with Acid Spit\n");
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
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3MediumDamage());
							System.out.println("You reflected "+enemy3.getEnemy3MediumDamage()+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3MediumDamage()/2);
							System.out.println("You reflected "+enemy3.getEnemy3MediumDamage()/2+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
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
							player.setDamageReceived(enemy3.getEnemy3MediumDamage(), player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3MediumDamage());
							System.out.println("You reflected "+enemy3.getEnemy3MediumDamage()+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy3.getEnemy3MediumDamage(), player.getDamageBlocked());
							enemy3.setEnemy3DamageReceived(enemy3.getEnemy3MediumDamage()/2);
							System.out.println("You reflected "+enemy3.getEnemy3MediumDamage()/2+" damage to the Harpy");
							enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemy3MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received 0 damage from the Harpy");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setDamageReceived(enemy3.getEnemy3MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy3AttackChoice == 3)
			{
				enemy3.setEnemy3HeavyDamage();
				System.out.println("The Harpy attacks with Tallons\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon()+"\n(3) Dodge and attack with "+player.getPowerUp()+player.getMediumWeapon()+"\n(4) Dodge and attack with "+player.getPowerUp()+player.getHeavyWeapon());
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
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received 0 damage from the Harpy");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
					}
				}
				else if (choiceDefense.equals("3"))
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
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy3.setEnemy3DamageReceived(player.getMediumDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received 0 damage from the Harpy");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy3.setEnemy3DamageReceived(player.getMediumDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
					}
				}
				else if (choiceDefense.equals("4"))
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
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy3.setEnemy3DamageReceived(player.getHeavyDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received 0 damage from the Harpy");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy3.setEnemy3DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy3.setEnemy3DamageReceived(player.getHeavyDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy3.getEnemy3DamageReceived()+" damage to the Harpy");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Harpy");
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
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Harpy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nHarpy health: "+enemy3.getEnemy3Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy3.getEnemy3Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (75+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 4)
				City.level = 4;
			if (City.health < 400)
				City.health = 400;
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
