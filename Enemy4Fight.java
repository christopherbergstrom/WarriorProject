package warriorProject;
import java.util.Scanner;
// Gorgon
public class Enemy4Fight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy4DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy4 enemy4 = new Enemy4();
	City city = new City();
	static int gold = 0;
	public void enemy4Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy4.setEnemy4Health(1000, 0);
		
		System.out.println("Level 4: Gorgon\n");
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
		System.out.println("\nGorgon stats:");
		System.out.println("Health: "+enemy4.getEnemy4Health());
		System.out.println("Stone Gaze damage: 31-33");
		System.out.println("Claws damage: 34-37");
		System.out.println("Tail damage: 38-40");
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
				enemy4DodgeMaybe = enemy4.enemy4Dodge();
				if (enemy4DodgeMaybe == true)
				{
					System.out.println("The Gorgon successfully dodged your attack");
					enemy4.setEnemy4DamageReceived(0);
				}
				else
				{
					System.out.println("The Gorgon unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleLightVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							player.attackLightWeapon();
							enemy4.setEnemy4DamageReceived(player.getLightDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getMediumWeapon());
				enemy4DodgeMaybe = enemy4.enemy4Dodge();
				if (enemy4DodgeMaybe == true)
				{
					System.out.println("The Gorgon successfully dodged your attack");
					enemy4.setEnemy4DamageReceived(0);
				}
				else
				{
					System.out.println("The Gorgon unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleMediumVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							player.attackMediumWeapon();
							enemy4.setEnemy4DamageReceived(player.getMediumDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				System.out.println("You attacked with "+player.getPowerUp()+player.getHeavyWeapon());
				enemy4DodgeMaybe = enemy4.enemy4Dodge();
				if (enemy4DodgeMaybe == true)
				{
					System.out.println("The Gorgon successfully dodged your attack");
					enemy4.setEnemy4DamageReceived(0);
				}
				else
				{
					System.out.println("The Gorgon unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleHeavyVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy4.setEnemy4DamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("CRITICAL HIT!");
							enemy4.setEnemy4DamageReceived(critical);
						}
						else
						{
							player.attackHeavyWeapon();
							enemy4.setEnemy4DamageReceived(player.getHeavyDamage());
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
						enemy4.setEnemy4DamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy4.setEnemy4DamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("CRITICAL HIT!");
						enemy4.setEnemy4DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy4.setEnemy4DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attacked with "+player.getPowerUp()+player.getMagic());
			}
			enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
			System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemy4DodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Gorgon drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Gorgon drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGorgon health: "+enemy4.getEnemy4Health()+"\n");
			if (enemy4.getEnemy4Health() <= 0)
				break;
			int Enemy4AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy4AttackChoice == 1)
			{
				enemy4.setEnemy4LightDamage();
				System.out.println("The Gorgon attacks with Stone Gaze\n");
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
							enemy4.setEnemy4DamageReceived(enemy4.getEnemy4LightDamage());
							System.out.println("You reflected "+enemy4.getEnemy4LightDamage()+" damage to the Gorgon");
							enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						}
						else
						{							
							player.setDamageReceived(0, player.getDamageBlocked());
							enemy4.setEnemy4DamageReceived(enemy4.getEnemy4LightDamage()/2);
							System.out.println("You reflected "+enemy4.getEnemy4LightDamage()/2+" damage to the Gorgon");
							enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
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
							player.setDamageReceived(enemy4.getEnemy4LightDamage(), player.getDamageBlocked());
							enemy4.setEnemy4DamageReceived(enemy4.getEnemy4LightDamage());
							System.out.println("You reflected "+enemy4.getEnemy4LightDamage()+" damage to the Gorgon");
							enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						}
						else
						{							
							player.setDamageReceived(enemy4.getEnemy4LightDamage(), player.getDamageBlocked());
							enemy4.setEnemy4DamageReceived(enemy4.getEnemy4LightDamage()/2);
							System.out.println("You reflected "+enemy4.getEnemy4LightDamage()/2+" damage to the Gorgon");
							enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						}
					}
					else
					{
						player.setDamageReceived(enemy4.getEnemy4LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy4.setEnemy4DamageReceived(player.getLightDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received 0 damage from the Gorgon");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleLightVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy4.setEnemy4DamageReceived(player.getLightDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setDamageReceived(enemy4.getEnemy4LightDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy4AttackChoice == 2)
			{
				enemy4.setEnemy4MediumDamage();
				System.out.println("The Gorgon attacks with Claws\n");
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
						player.setDamageReceived(enemy4.getEnemy4MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy4.setEnemy4DamageReceived(player.getMediumDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received 0 damage from the Gorgon");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleMediumVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy4.setEnemy4DamageReceived(player.getMediumDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setDamageReceived(enemy4.getEnemy4MediumDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy4AttackChoice == 3)
			{
				enemy4.setEnemy4HeavyDamage();
				System.out.println("The Gorgon attacks with Tail\n");
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
						player.setDamageReceived(enemy4.getEnemy4HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You blocked "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy4.setEnemy4DamageReceived(player.getHeavyDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received 0 damage from the Gorgon");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleHeavyVar);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy4.setEnemy4DamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("CRITICAL HIT!");
								enemy4.setEnemy4DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy4.setEnemy4DamageReceived(player.getHeavyDamage());
							}
						}
						enemy4.setEnemy4Health(enemy4.getEnemy4Health(), enemy4.getEnemy4DamageReceived());
						player.setDamageReceived(enemy4.getEnemy4HeavyDamage(), 0);							
						System.out.println("You unsuccessfully dodged the attack");
						System.out.println("You inflicted "+enemy4.getEnemy4DamageReceived()+" damage to the Gorgon");
						System.out.println("You received "+player.getDamageReceived()+" damage from the Gorgon");
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
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Gorgon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGorgon health: "+enemy4.getEnemy4Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy4.getEnemy4Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (105+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 5)
				City.level = 5;
			if (City.health < 450)
				City.health = 450;
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

