package warriorProject;
import java.util.Scanner;
// Undead Soldier
public class Enemy2Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy2DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy2 enemy2 = new Enemy2();
	City city = new City();
	static int gold = 0;
	public void enemy2Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
//		enemy2.setEnemy2Health(500, 0);
		
		System.out.println("Level 2: Undead Soldier\n");
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
		System.out.println("\nUndead Soldier stats:");
		System.out.println("Health: "+enemy2.getEnemy2Health());
		System.out.println("Mace damage: 11-13");
		System.out.println("Sword damage: 14-17");
		System.out.println("Halberd damage: 18-20");
		System.out.println("Shield block damage: 6-10");
		System.out.println("Dodge percentage: 10%\n");
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
			int enemy2DefenseChoice = (1+(int)(Math.random()*2));
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
				if (enemy2DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleLightVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(player.getLightDamage(), enemy2.getEnemy2DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Undead Soldier blocked "+enemy2.getEnemy2DamageBlocked()+" damage");
				}
				else if (enemy2DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getLightWeapon());
					enemy2DodgeMaybe = enemy2.enemy2Dodge();
					if (enemy2DodgeMaybe == true)
					{
						System.out.println("The Undead Soldier successfully dodged your attack");
						enemy2.setEnemy2DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Undead Soldier unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy2.setEnemy2DamageReceived(player.getLightDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				if (enemy2DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleMediumVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(player.getMediumDamage(), enemy2.getEnemy2DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Undead Soldier blocked "+enemy2.getEnemy2DamageBlocked()+" damage");
				}
				else if (enemy2DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
					enemy2DodgeMaybe = enemy2.enemy2Dodge();
					if (enemy2DodgeMaybe == true)
					{
						System.out.println("The Undead Soldier successfully dodged your attack");
						enemy2.setEnemy2DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Undead Soldier unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy2.setEnemy2DamageReceived(player.getMediumDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				if (enemy2DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleHeavyVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							enemy2.setEnemy2DamageBlocked();
							enemy2.setEnemy2DamageReceived(player.getHeavyDamage(), enemy2.getEnemy2DamageBlocked());
						}
					}
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Undead Soldier blocked "+enemy2.getEnemy2DamageBlocked()+" damage");
				}
				else if (enemy2DefenseChoice == 2)
				{
					System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
					enemy2DodgeMaybe = enemy2.enemy2Dodge();
					if (enemy2DodgeMaybe == true)
					{
						System.out.println("The Undead Soldier successfully dodged your attack");
						enemy2.setEnemy2DamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Undead Soldier unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy2.setEnemy2DamageReceived(player.getHeavyDamage(), 0);
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
						enemy2.setEnemy2DamageBlocked();
						enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy2.setEnemy2DamageBlocked();
						enemy2.setEnemy2DamageReceived(doubleDamageVar, enemy2.getEnemy2DamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy2.setEnemy2DamageBlocked();
						enemy2.setEnemy2DamageReceived(critical, enemy2.getEnemy2DamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy2.setEnemy2DamageBlocked();
						enemy2.setEnemy2DamageReceived(player.getMagicDamage(), enemy2.getEnemy2DamageBlocked());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Undead Soldier blocked "+enemy2.getEnemy2DamageBlocked()+" damage");
			}
			enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
			System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy2DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Undead Soldier drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Undead Soldier drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nUndead Soldier health: "+enemy2.getEnemy2Health()+"\n");
			if (enemy2.getEnemy2Health() <= 0)
				break;
			int Enemy2AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy2AttackChoice == 1)
			{
				enemy2.setEnemy2LightDamage();
				System.out.println("The Undead Soldier attacks with Mace\n");
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
						player.setDamageReceived(enemy2.getEnemy2LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy2.setEnemy2DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received 0 damage from the Undead Soldier");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy2.setEnemy2DamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setDamageReceived(enemy2.getEnemy2LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy2AttackChoice == 2)
			{
				enemy2.setEnemy2MediumDamage();
				System.out.println("The Undead Soldier attacks with Sword\n");
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
						player.setDamageReceived(enemy2.getEnemy2MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy2.setEnemy2DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received 0 damage from the Undead Soldier");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy2.setEnemy2DamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setDamageReceived(enemy2.getEnemy2MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy2AttackChoice == 3)
			{
				enemy2.setEnemy2HeavyDamage();
				System.out.println("The Undead Soldier attacks with Halberd\n");
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
						player.setDamageReceived(enemy2.getEnemy2HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy2.setEnemy2DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received 0 damage from the Undead Soldier");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy2.setEnemy2DamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy2.setEnemy2DamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy2.setEnemy2DamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy2.setEnemy2Health(enemy2.getEnemy2Health(), enemy2.getEnemy2DamageReceived());
						player.setDamageReceived(enemy2.getEnemy2HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy2.getEnemy2DamageReceived()+" damage to the Undead Soldier");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Undead Soldier");
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
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Undead Soldier drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nUndead Soldier health: "+enemy2.getEnemy2Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy2.getEnemy2Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (45+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 3)
				City.level = 3;
			if (City.health < 350)
				City.health = 350;
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
