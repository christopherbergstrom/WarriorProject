package warriorProject;
import java.util.Scanner;
public class FightTemplate
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemyDodgeMaybe;
	Player player = new Player(WeaponShop.playerLightWeapon, WeaponShop.playerMediumWeapon, WeaponShop.playerHeavyWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	EnemyTemplate enemy = new EnemyTemplate(); 
	static int gold = 0;
	public void EnemyFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		enemy.setEnemyHealth(250, 0);
		
		System.out.println("Level: Enemy\n");
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
		System.out.println("\nEnemy stats:");
		System.out.println("Health: "+enemy.getEnemyHealth());
		System.out.println("Light damage: ");
		System.out.println("Medium damage: ");
		System.out.println("Heavy damage: ");
		System.out.println("Shield block damage: ");
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
			int enemyDefenseChoice = (1+(int)(Math.random()*2));
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
				if (enemyDefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*8;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*4;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleLight == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleLightVar = player.attackLightWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleLightVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackLightWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackLightWeapon()*2;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							player.attackLightWeapon();
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(player.getLightDamage(), enemy.getEnemyDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getLightWeapon());
					System.out.println("The Enemy blocks "+enemy.getEnemyDamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getLightWeapon());
					enemyDodgeMaybe = enemy.enemyDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Enemy successfully dodged your attack");
						enemy.setEnemyDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy.setEnemyDamageReceived(player.getLightDamage(), 0);
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
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*4;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleMedium == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleMediumVar = player.attackMediumWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleMediumVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackMediumWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackMediumWeapon()*2;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							player.attackMediumWeapon();
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(player.getMediumDamage(), enemy.getEnemyDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getMediumWeapon());
					System.out.println("The Enemy blocks "+enemy.getEnemyDamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getMediumWeapon());
					enemyDodgeMaybe = enemy.enemyDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Enemy successfully dodged your attack");
						enemy.setEnemyDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy.setEnemyDamageReceived(player.getMediumDamage(), 0);
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
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*4;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleHeavy == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleHeavyVar = player.attackHeavyWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleHeavyVar, enemy.getEnemyDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*4;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHeavyWeapon()*2;
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHeavyWeapon()*2;
							System.out.println("Critical Hit!");
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
						}
						else
						{
							player.attackHeavyWeapon();
							enemy.setEnemyDamageBlocked();
							enemy.setEnemyDamageReceived(player.getHeavyDamage(), enemy.getEnemyDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getHeavyWeapon());
					System.out.println("The Enemy blocks "+enemy.getEnemyDamageBlocked()+" damage");
				}
				else if (enemyDefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getHeavyWeapon());
					enemyDodgeMaybe = enemy.enemyDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Enemy successfully dodged your attack");
						enemy.setEnemyDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Enemy unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy.setEnemyDamageReceived(player.getHeavyDamage(), 0);
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
						System.out.println("Critical Hit!");
						enemy.setEnemyDamageBlocked();
						enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy.setEnemyDamageBlocked();
						enemy.setEnemyDamageReceived(doubleDamageVar, enemy.getEnemyDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy.setEnemyDamageBlocked();
						enemy.setEnemyDamageReceived(critical, enemy.getEnemyDamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy.setEnemyDamageBlocked();
						enemy.setEnemyDamageReceived(player.getMagicDamage(), enemy.getEnemyDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
				System.out.println("The Enemy blocks "+enemy.getEnemyDamageBlocked()+" damage");
			}
			enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
			System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1 && enemyDodgeMaybe == false)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Enemy drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Enemy drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nEnemy health: "+enemy.getEnemyHealth()+"\n");
			if (enemy.getEnemyHealth() <= 0)
				break;
			int EnemyAttackChoice = (1+(int)(Math.random()*3));
			critical = (1+(int)(Math.random()*10));
			if (EnemyAttackChoice == 1)
			{
				enemy.setEnemyLightDamage();
				System.out.println("The Enemy attacks with Light weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getLightWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy.getEnemyLightDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy.getEnemyLightDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy.setEnemyDamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take 0 damage from the Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleLight == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleLightVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleLightVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackLightWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackLightWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackLightWeapon();
								enemy.setEnemyDamageReceived(player.getLightDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy.getEnemyLightDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy.getEnemyLightDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (EnemyAttackChoice == 2)
			{
				enemy.setEnemyMediumDamage();
				System.out.println("The Enemy attacks with Medium weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getMediumWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy.getEnemyMediumDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy.getEnemyMediumDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy.setEnemyDamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take 0 damage from the Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleMedium == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleMediumVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleMediumVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackMediumWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackMediumWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackMediumWeapon();
								enemy.setEnemyDamageReceived(player.getMediumDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy.getEnemyMediumDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy.getEnemyMediumDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (EnemyAttackChoice == 3)
			{
				enemy.setEnemyHeavyDamage();
				System.out.println("The Enemy attacks with Heavy weapon\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHeavyWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy.getEnemyHeavyDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy.getEnemyHeavyDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy.setEnemyDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take 0 damage from the Enemy");
					}
					else
					{
						if (doubleDamage == 1 && doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*8;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*4;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else if (doubleHeavy == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleHeavyVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleHeavyVar, 0);
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*4;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHeavyWeapon()*2;
								enemy.setEnemyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHeavyWeapon()*2;
								System.out.println("Critical Hit!");
								enemy.setEnemyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHeavyWeapon();
								enemy.setEnemyDamageReceived(player.getHeavyDamage(), 0);
							}
						}
						enemy.setEnemyHealth(enemy.getEnemyHealth(), enemy.getEnemyDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy.getEnemyHeavyDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy.getEnemyHeavyDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+enemy.getEnemyDamageReceived()+" damage to the Enemy");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Enemy");
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
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nEnemy health: "+enemy.getEnemyHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy.getEnemyHealth() > 0));
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
