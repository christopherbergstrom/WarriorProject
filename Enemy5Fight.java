package warriorProject;
import java.util.Scanner;
// Centaur
public class Enemy5Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy5 enemy5 = new Enemy5();
	City city = new City();
	static int gold = 0;
	public void enemy5Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy5.setEnemy5Health(1250, 0);
		
		System.out.println("Level 5: Centaur\n");
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
		System.out.println("\nCentaur stats:");
		System.out.println("Health: "+enemy5.getEnemy5Health());
		System.out.println("Charge damage: 41-43");
		System.out.println("Chain Whip damage: 44-47");
		System.out.println("Flail damage: 48-50");
		System.out.println("Shield block damage: 21-25\n");
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
				if (doubleDamage == 1 && doubleLight == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackLightWeapon()*4;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleLight == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleLightVar = player.attackLightWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleLightVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackLightWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackLightWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						player.attackLightWeapon();
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(player.getLightDamage(), enemy5.getEnemy5DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
				System.out.println("The Centaur blocked "+enemy5.getEnemy5DamageBlocked()+" damage");
			}
			else if (choiceAttack.equals("2"))
			{
				if (doubleDamage == 1 && doubleMedium == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMediumWeapon()*4;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleMedium == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleMediumVar = player.attackMediumWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleMediumVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMediumWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMediumWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						player.attackMediumWeapon();
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(player.getMediumDamage(), enemy5.getEnemy5DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
				System.out.println("The Centaur blocked "+enemy5.getEnemy5DamageBlocked()+" damage");
			}
			else if (choiceAttack.equals("3"))
			{
				if (doubleDamage == 1 && doubleHeavy == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*8;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackHeavyWeapon()*4;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleHeavy == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleHeavyVar = player.attackHeavyWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleHeavyVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*4;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackHeavyWeapon()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHeavyWeapon()*2;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						player.attackHeavyWeapon();
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(player.getHeavyDamage(), enemy5.getEnemy5DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
				System.out.println("The Centaur blocked "+enemy5.getEnemy5DamageBlocked()+" damage");
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
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(doubleDamageVar, enemy5.getEnemy5DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(critical, enemy5.getEnemy5DamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy5.setEnemy5DamageBlocked();
						enemy5.setEnemy5DamageReceived(player.getMagicDamage(), enemy5.getEnemy5DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Centaur blocked "+enemy5.getEnemy5DamageBlocked()+" damage");
			}
			enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
			System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Centaur drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Centaur drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCentaur health: "+enemy5.getEnemy5Health()+"\n");
			if (enemy5.getEnemy5Health() <= 0)
				break;
			int Enemy5AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy5AttackChoice == 1)
			{
				enemy5.setEnemy5LightDamage();
				System.out.println("The Centaur Charges at you\n");
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
						player.setDamageReceived(enemy5.getEnemy5LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy5.setEnemy5DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received 0 damage from the Centaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy5.setEnemy5DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setDamageReceived(enemy5.getEnemy5LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy5AttackChoice == 2)
			{
				enemy5.setEnemy5MediumDamage();
				System.out.println("The Centaur attacks with Chain Whip\n");
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
						player.setDamageReceived(enemy5.getEnemy5MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy5.setEnemy5DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received 0 damage from the Centaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy5.setEnemy5DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setDamageReceived(enemy5.getEnemy5MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy5AttackChoice == 3)
			{
				enemy5.setEnemy5HeavyDamage();
				System.out.println("The Centaur attacks with Flail\n");
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
						player.setDamageReceived(enemy5.getEnemy5HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy5.setEnemy5DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received 0 damage from the Centaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy5.setEnemy5DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy5.setEnemy5DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy5.setEnemy5DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy5.setEnemy5Health(enemy5.getEnemy5Health(), enemy5.getEnemy5DamageReceived());
						player.setDamageReceived(enemy5.getEnemy5HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy5.getEnemy5DamageReceived()+" damage to the Centaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Centaur");
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
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Centaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCentaur health: "+enemy5.getEnemy5Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy5.getEnemy5Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (135+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 6)
				City.level = 6;
			if (City.health < 500)
				City.health = 500;
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
