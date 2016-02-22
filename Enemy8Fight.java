package warriorProject;
import java.util.Scanner;
// Minotaur
public class Enemy8Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy8DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy8 enemy8 = new Enemy8();
	City city = new City();
	static int gold = 0;
	public void enemy8Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy8.setEnemy8Health(2000, 0);
		
		System.out.println("Level 8: Minotaur\n");
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
		System.out.println("\nMinotaur stats:");
		System.out.println("Health: "+enemy8.getEnemy8Health());
		System.out.println("Throwing Axe damage: 71-73");
		System.out.println("Horns damage: 74-77");
		System.out.println("Axe damage: 78-80");
		System.out.println("Shield block damage: 36-40");
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
			int enemyDefenseChoice = (1+(int)(Math.random()*2));
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
				if (enemyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleLightVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(player.getLightDamage(), enemy8.getEnemy8DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Minotaur blocked "+enemy8.getEnemy8DamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					enemy8DodgeMaybe = enemy8.enemy8Dodge();
					if (enemy8DodgeMaybe == true)
					{
						System.out.println("The Minotaur successfully dodged your attack");
						enemy8.setEnemy8DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Minotaur unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy8.setEnemy8DamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (enemyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleMediumVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(player.getMediumDamage(), enemy8.getEnemy8DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Minotaur blocked "+enemy8.getEnemy8DamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					enemy8DodgeMaybe = enemy8.enemy8Dodge();
					if (enemy8DodgeMaybe == true)
					{
						System.out.println("The Minotaur successfully dodged your attack");
						enemy8.setEnemy8DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Minotaur unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy8.setEnemy8DamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (enemyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleHeavyVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							enemy8.setEnemy8DamageBlocked();
							enemy8.setEnemy8DamageReceived(player.getHeavyDamage(), enemy8.getEnemy8DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Minotaur blocked "+enemy8.getEnemy8DamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					enemy8DodgeMaybe = enemy8.enemy8Dodge();
					if (enemy8DodgeMaybe == true)
					{
						System.out.println("The Minotaur successfully dodged your attack");
						enemy8.setEnemy8DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Minotaur unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy8.setEnemy8DamageReceived(player.getHeavyDamage(), 0);
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
						enemy8.setEnemy8DamageBlocked();
						enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy8.setEnemy8DamageBlocked();
						enemy8.setEnemy8DamageReceived(doubleDamageVar, enemy8.getEnemy8DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy8.setEnemy8DamageBlocked();
						enemy8.setEnemy8DamageReceived(critical, enemy8.getEnemy8DamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy8.setEnemy8DamageBlocked();
						enemy8.setEnemy8DamageReceived(player.getMagicDamage(), enemy8.getEnemy8DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Minotaur blocked "+enemy8.getEnemy8DamageBlocked()+" damage");
			}
			enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
			System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy8DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Minotaur drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Minotaur drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nMinotaur health: "+enemy8.getEnemy8Health()+"\n");
			if (enemy8.getEnemy8Health() <= 0)
				break;
			int Enemy8AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy8AttackChoice == 1)
			{
				enemy8.setEnemy8LightDamage();
				System.out.println("The Minotaur attacks with Throwing Axe\n");
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
							enemy8.setEnemy8DamageReceived(enemy8.getEnemy8LightDamage(), 0);
							System.out.println("You reflected "+enemy8.getEnemy8LightDamage()+" damage to the Minotaur");
							enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy8.setEnemy8DamageReceived(enemy8.getEnemy8LightDamage()/2, 0);
							System.out.println("You reflected "+enemy8.getEnemy8LightDamage()/2+" damage to the Minotaur");
							enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
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
							player.setDamageReceived(enemy8.getEnemy8LightDamage(), player.getDamageBlocked());
							enemy8.setEnemy8DamageReceived(enemy8.getEnemy8LightDamage(), 0);
							System.out.println("You reflected "+enemy8.getEnemy8LightDamage()+" damage to the Minotaur");
							enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy8.getEnemy8LightDamage(), player.getDamageBlocked());
							enemy8.setEnemy8DamageReceived(enemy8.getEnemy8LightDamage()/2, 0);
							System.out.println("You reflected "+enemy8.getEnemy8LightDamage()/2+" damage to the Minotaur");
							enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy8.getEnemy8LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy8.setEnemy8DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received 0 damage from the Minotaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy8.setEnemy8DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setDamageReceived(enemy8.getEnemy8LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy8AttackChoice == 2)
			{
				enemy8.setEnemy8MediumDamage();
				System.out.println("The Minotaur attacks with Horns\n");
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
						player.setDamageReceived(enemy8.getEnemy8MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy8.setEnemy8DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received 0 damage from the Minotaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy8.setEnemy8DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setDamageReceived(enemy8.getEnemy8MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy8AttackChoice == 3)
			{
				enemy8.setEnemy8HeavyDamage();
				System.out.println("The Minotaur attacks with Axe\n");
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
						player.setDamageReceived(enemy8.getEnemy8HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy8.setEnemy8DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received 0 damage from the Minotaur");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy8.setEnemy8DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy8.setEnemy8DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy8.setEnemy8DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy8.setEnemy8Health(enemy8.getEnemy8Health(), enemy8.getEnemy8DamageReceived());
						player.setDamageReceived(enemy8.getEnemy8HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy8.getEnemy8DamageReceived()+" damage to the Minotaur");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Minotaur");
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
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Minotaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nMinotaur health: "+enemy8.getEnemy8Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy8.getEnemy8Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (225+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 9)
				City.level = 9;
			if (City.health < 650)
				City.health = 650;
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
