package warriorProject;
import java.util.Scanner;
public class FightNoBlock
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemy3DodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy3 enemy3 = new Enemy3(); 
	static int gold = 0;
	public void enemy3Fight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy3.setEnemy3Health(250, 0);
		
		System.out.println("Level: Enemy3\n");
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
		System.out.println("\nEnemy3 stats:");
		System.out.println("Health: "+enemy3.getEnemy3Health());
		System.out.println("Light damage: ");
		System.out.println("Medium damage: ");
		System.out.println("Heavy damage: ");
		System.out.println("Dodge percentage: %\n");
		Scanner input = new Scanner(System.in);
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
			int halfDamage = (1+(int)(Math.random()*10));
			int doubleGold = (1+(int)(Math.random()*10));
			int critical = (1+(int)(Math.random()*10));
			int dropGold = (1+(int)(Math.random()*10));
			int goldAmount = (1+(int)(Math.random()*5));
			int enemy3DefenseChoice = (1+(int)(Math.random()*2));
			if (magicAttack == false)
				magicCount++;			
			if (magicCount % 3 == 0 && !player.getMagic().equals(""))
				magicAttack = true;
			if (doubleDamage == 1)
				System.out.println("Double Damage Dealing Round!");
			if (doubleLight == 1)
				System.out.println("Double Damage Light Weapon Round!");
			if (doubleMedium == 1)
				System.out.println("Double Damage Medium Weapon Round!");
			if (doubleHeavy == 1)
				System.out.println("Double Damage Heavy Weapon Round!");
			if (halfDamage == 1)
				System.out.println("Half Damage Taking Round!");
			if (doubleGold == 1)
				System.out.println("Double Gold Dropped Round!");
			System.out.println("(1) Attack with "+player.getPowerUp()+player.getLightWeapon()+"\n(2) Attack with "+player.getPowerUp()+player.getMediumWeapon()+"\n(3) Attack with "+player.getPowerUp()+player.getHeavyWeapon());
			if (magicAttack == true)
				System.out.println("(4) Attack with "+player.getPowerUp()+player.getMagic());
			choiceAttack = input.next();
			if (choiceAttack.equals("1"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getLightWeapon());
				enemy3DodgeMaybe = enemy3.enemy3Dodge();
				if (enemy3DodgeMaybe == true)
				{
					System.out.println("The Enemy3 successfully dodged your attack");
					enemy3.setEnemy3DamageReceived(0);
				}
				else
				{
					System.out.println("The Enemy3 unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getMediumWeapon());
				enemy3DodgeMaybe = enemy3.enemy3Dodge();
				if (enemy3DodgeMaybe == true)
				{
					System.out.println("The Enemy3 successfully dodged your attack");
					enemy3.setEnemy3DamageReceived(0);
				}
				else
				{
					System.out.println("The Enemy3 unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*8;
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							player.attackMediumWeapon();
							enemy3.setEnemy3DamageReceived(player.getMediumDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("3"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getHeavyWeapon());
				enemy3DodgeMaybe = enemy3.enemy3Dodge();
				if (enemy3DodgeMaybe == true)
				{
					System.out.println("The Enemy3 successfully dodged your attack");
					enemy3.setEnemy3DamageReceived(0);
				}
				else
				{
					System.out.println("The Enemy3 unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*8;
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
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
							System.out.println("Critical Hit!");
							enemy3.setEnemy3DamageReceived(critical);
						}
						else
						{
							player.attackHeavyWeapon();
							enemy3.setEnemy3DamageReceived(player.getHeavyDamage());
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
						System.out.println("Critical Hit!");
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
						System.out.println("Critical Hit!");
						enemy3.setEnemy3DamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy3.setEnemy3DamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
			System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Enemy3 drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Enemy3 drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nEnemy3 health: "+enemy3.getEnemy3Health()+"\n");
			if (enemy3.getEnemy3Health() <= 0)
				break;
			int Enemy3AttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (Enemy3AttackChoice == 1)
			{
				enemy3.setEnemy3LightDamage();
				System.out.println("The Enemy3 attacks with Light weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy3.getEnemy3LightDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemy3LightDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take 0 damage from the Enemy3");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackLightWeapon();
								enemy3.setEnemy3DamageReceived(player.getLightDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy3.getEnemy3LightDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy3.getEnemy3LightDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy3AttackChoice == 2)
			{
				enemy3.setEnemy3MediumDamage();
				System.out.println("The Enemy3 attacks with Medium weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getMediumWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy3.getEnemy3MediumDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemy3MediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take 0 damage from the Enemy3");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackMediumWeapon();
								enemy3.setEnemy3DamageReceived(player.getMediumDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy3.getEnemy3MediumDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy3.getEnemy3MediumDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (Enemy3AttackChoice == 3)
			{
				enemy3.setEnemy3HeavyDamage();
				System.out.println("The Enemy3 attacks with Heavy weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHeavyWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take 0 damage from the Enemy3");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
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
								System.out.println("Critical Hit!");
								enemy3.setEnemy3DamageReceived(critical);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy3.setEnemy3DamageReceived(player.getHeavyDamage());
							}
						}
						enemy3.setEnemy3Health(enemy3.getEnemy3Health(), enemy3.getEnemy3DamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy3.getEnemy3HeavyDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy3.getEnemy3HeavyDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy3.getEnemy3DamageReceived()+" damage to the Enemy3");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy3");
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
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy3 drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nEnemy3 health: "+enemy3.getEnemy3Health()+"\n");
		} while ((player.getHealth() > 0) && (enemy3.getEnemy3Health() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 1)
				City.level = 1;
			if (City.health < 1)
				City.health = 1;
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

