package warriorProject;
//import java.util.Scanner;

public class Player
{
	Player(String light, String medium, String heavy, String shield, String power, String magic)
	{
		playerLightWeapon = light;
		playerMediumWeapon = medium;
		playerHeavyWeapon = heavy;
		playerShield = shield;
		playerPowerUp = power;
		playerMagic = magic;
	}
	Player()
	{
		
	}
	private String playerLightWeapon;
	private String playerMediumWeapon;
	private String playerHeavyWeapon;
	private String playerShield;
	private String playerPowerUp;
	private String playerMagic;
	private int healthAmount; 
	private int level;
	
	private String lightWeaponDamageRange, mediumWeaponDamageRange, heavyWeaponDamageRange, shieldDamageRange, powerUpRange, magicDamageRange;
	private int lightDamage, mediumDamage, heavyDamage, damageBlocked, damageReceived, magicDamage;
	private boolean dodgeAmount;
	LightWeapon lightWeapon = new LightWeapon();
	MediumWeapon mediumWeapon = new MediumWeapon();
	HeavyWeapon heavyWeapon = new HeavyWeapon();
	Shield shield = new Shield();
	Magic magic = new Magic();
	Dodge dodge = new Dodge();
	Health health = new Health();
	LightWeaponDamageRange checkLightWeaponDamageRange = new LightWeaponDamageRange();
	MediumWeaponDamageRange checkMediumWeaponDamageRange = new MediumWeaponDamageRange();
	HeavyWeaponDamageRange checkHeavyWeaponDamageRange = new HeavyWeaponDamageRange();
	ShieldDamageRange checkShieldDamageRange = new ShieldDamageRange();
	PowerUpRange checkPowerUpRange = new PowerUpRange();
	MagicDamageRange checkMagicDamageRange = new MagicDamageRange();
	
	

	public String getLightWeapon()
	{
		return playerLightWeapon;
	}
	public int getLightDamage()
	{
		return lightDamage;
	}
	public void setPlayerLightWeapon(String playerLightWeapon)
	{
		this.playerLightWeapon = playerLightWeapon;
	}
	public String getLightWeaponDamageRange()
	{
		if (playerLightWeapon.equals("Blow Darts"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.blowDarts(level);
		}
		else if (playerLightWeapon.equals("Throwing Knives"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.throwingKnives(level);
		}
		else if (playerLightWeapon.equals("Throwing Axe"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.throwingAxe(level);
		}
		else if (playerLightWeapon.equals("Mystical Bow"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.mysticalBow();
		}
		else if (playerLightWeapon.equals("Crossbow"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.crossbow(level);
		}
		else if (playerLightWeapon.equals("Javelin"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.javelin(level);
		}
		else if (playerLightWeapon.equals("Recurve Bow"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.recurveBow(level);
		}
		else if (playerLightWeapon.equals("Long Bow"))
		{
			lightWeaponDamageRange = checkLightWeaponDamageRange.longBow(level);
		}
		return lightWeaponDamageRange;
	}
	public int attackLightWeapon()
	{
		if (playerLightWeapon.equals("Blow Darts"))
		{
			lightDamage = lightWeapon.blowDarts(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Throwing Knives"))
		{
			lightDamage = lightWeapon.throwingKnives(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Throwing Axe"))
		{
			lightDamage = lightWeapon.throwingAxe(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Mystical Bow"))
		{
			lightDamage = lightWeapon.mysticalBow(playerPowerUp);
		}
		else if (playerLightWeapon.equals("Crossbow"))
		{
			lightDamage = lightWeapon.crossbow(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Javelin"))
		{
			lightDamage = lightWeapon.javelin(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Recurve Bow"))
		{
			lightDamage = lightWeapon.recurveBow(level, playerPowerUp);
		}
		else if (playerLightWeapon.equals("Long Bow"))
		{
			lightDamage = lightWeapon.longBow(level, playerPowerUp);
		}
		return lightDamage;
	}
	
	public String getMediumWeapon()
	{
		return playerMediumWeapon;
	}
	public int getMediumDamage()
	{
		return mediumDamage;
	}
	public void setPlayerMediumWeapon(String playerMediumWeapon)
	{
		this.playerMediumWeapon = playerMediumWeapon;
	}
	public String getMediumWeaponDamageRange()
	{
		if (playerMediumWeapon.equals("Chain Whip"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.chainWhip(level);
		}
		else if (playerMediumWeapon.equals("Ring Sword"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.ringSword(level);
		}
		else if (playerMediumWeapon.equals("Staff"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.staff(level);
		}
		else if (playerMediumWeapon.equals("Cestus"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.cestus(level);
		}
		else if (playerMediumWeapon.equals("Spiked Chain"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.spikedChain(level);
		}
		else if (playerMediumWeapon.equals("Meteor Hammer"))
		{
			mediumWeaponDamageRange = checkMediumWeaponDamageRange.meteorHammer(level);
		}
		return mediumWeaponDamageRange;
	}
	public int attackMediumWeapon()
	{
		if (playerMediumWeapon.equals("Chain Whip"))
		{
			mediumDamage = mediumWeapon.chainWhip(level, playerPowerUp);
		}
		else if (playerMediumWeapon.equals("Ring Sword"))
		{
			mediumDamage = mediumWeapon.ringSword(level, playerPowerUp);
		}
		else if (playerMediumWeapon.equals("Staff"))
		{
			mediumDamage = mediumWeapon.staff(level, playerPowerUp);
		}
		else if (playerMediumWeapon.equals("Cestus"))
		{
			mediumDamage = mediumWeapon.cestus(level, playerPowerUp);
		}
		else if (playerMediumWeapon.equals("Spiked Chain"))
		{
			mediumDamage = mediumWeapon.spikedChain(level, playerPowerUp);
		}
		else if (playerMediumWeapon.equals("Meteor Hammer"))
		{
			mediumDamage = mediumWeapon.meteorHammer(level, playerPowerUp);
		}
		return mediumDamage;
	}
	
	public String getHeavyWeapon()
	{
		return playerHeavyWeapon;
	}
	public int getHeavyDamage()
	{
		return heavyDamage;
	}
	public void setPlayerHeavyWeapon(String playerHeavyWeapon)
	{
		this.playerHeavyWeapon = playerHeavyWeapon;
	}
	public String getHeavyWeaponDamageRange()
	{
		if (playerHeavyWeapon.equals("Shortsword"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.shortsword(level);
		}
		else if (playerHeavyWeapon.equals("War Hammer"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.warHammer(level);
		}
		else if (playerHeavyWeapon.equals("Mace"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.mace(level);
		}
		else if (playerHeavyWeapon.equals("Flail"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.flail(level);
		}
		else if (playerHeavyWeapon.equals("Spear"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.spear(level);
		}
		else if (playerHeavyWeapon.equals("Mystical Sword"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.mysticalSword();
		}
		else if (playerHeavyWeapon.equals("Trident"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.trident(level);
		}
		else if (playerHeavyWeapon.equals("Scythe"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.scythe(level);
		}
		else if (playerHeavyWeapon.equals("Battle Axe"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.battleAxe(level);
		}
		else if (playerHeavyWeapon.equals("Broadsword"))
		{
			heavyWeaponDamageRange = checkHeavyWeaponDamageRange.broadsword(level);
		}
		return heavyWeaponDamageRange;
	}
	public int attackHeavyWeapon()
	{
		if (playerHeavyWeapon.equals("Shortsword"))
		{
			heavyDamage = heavyWeapon.shortsword(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("War Hammer"))
		{
			heavyDamage = heavyWeapon.warHammer(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Mace"))
		{
			heavyDamage = heavyWeapon.mace(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Flail"))
		{
			heavyDamage = heavyWeapon.flail(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Spear"))
		{
			heavyDamage = heavyWeapon.spear(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Mystical Sword"))
		{
			heavyDamage = heavyWeapon.mysticalSword(playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Trident"))
		{
			heavyDamage = heavyWeapon.trident(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Scythe"))
		{
			heavyDamage = heavyWeapon.scythe(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Battle Axe"))
		{
			heavyDamage = heavyWeapon.battleAxe(level, playerPowerUp);
		}
		else if (playerHeavyWeapon.equals("Broadsword"))
		{
			heavyDamage = heavyWeapon.broadsword(level, playerPowerUp);
		}
		return heavyDamage;
	}

	public String getShield()
	{
		return playerShield;
	}
	public int getDamageBlocked()
	{
		return damageBlocked;
	}
	public void setPlayerShield(String playerShield)
	{
		this.playerShield = playerShield;
	}
	public String getShieldDamageRange()
	{
		if (playerShield.equals("Wood Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.woodShield(level);			
		}
		else if (playerShield.equals("Steel Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.steelShield(level);			
		}
		else if (playerShield.equals("Mystical Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.mysticalShield();			
		}
		else if (playerShield.equals("Iron Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.ironShield(level);			
		}
		else if (playerShield.equals("Gold Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.goldShield(level);			
		}
		else if (playerShield.equals("Reflector Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.reflectorShield(level);			
		}
		return shieldDamageRange;
	}
	public int block()
	{
		if (playerShield.equals("Wood Shield"))
		{
			damageBlocked = shield.woodShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Steel Shield"))
		{
			damageBlocked = shield.steelShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Mystical Shield"))
		{
			damageBlocked = shield.mysticalShield(playerPowerUp);			
		}
		else if (playerShield.equals("Iron Shield"))
		{
			damageBlocked = shield.ironShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Gold Shield"))
		{
			damageBlocked = shield.goldShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Reflector Shield"))
		{
			damageBlocked = shield.reflectorShield(level, playerPowerUp);			
		}
		return damageBlocked;
	}

	public String getPowerUp()
	{
		if (playerPowerUp.equals("Ice"))
		{
			return playerPowerUp+" ";
		}
		else if (playerPowerUp.equals("Fire"))
		{
			return playerPowerUp+" ";
		}
		else if (playerPowerUp.equals("Lightning"))
		{
			return playerPowerUp+" ";
		}
		else
		{
			return "";
		}
	}
	public void setPlayerPowerUp(String playerPowerUp)
	{
		this.playerPowerUp = playerPowerUp;
	}
	public String getPowerUpRange()
	{
		if (playerPowerUp.equals("Ice"))
		{
			powerUpRange = checkPowerUpRange.ice();
		}
		else if (playerPowerUp.equals("Fire"))
		{
			powerUpRange = checkPowerUpRange.fire();
		}
		else if (playerPowerUp.equals("Lightning"))
		{
			powerUpRange = checkPowerUpRange.lightning();
		}
		else
		{
			powerUpRange = "";
		}
		return powerUpRange;
	}

	public String getMagic()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			return playerMagic+" ";
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			return playerMagic+" ";
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			return playerMagic+" ";
		}
		else
		{
			return "";
		}
	}
	public int getMagicDamage()
	{
		return magicDamage;
	}
	public void setPlayerMagic(String playerMagic)
	{
		this.playerMagic = playerMagic;
	}
	public String getMagicDamageRange()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			magicDamageRange = checkMagicDamageRange.ice(level);
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			magicDamageRange = checkMagicDamageRange.fire(level);
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			magicDamageRange = checkMagicDamageRange.lightning(level);
		}
		else
		{
			magicDamageRange = "";
		}
		return magicDamageRange;
	}
	public int attackMagic()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			magicDamage = magic.ice(level, playerPowerUp);
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			magicDamage = magic.fire(level, playerPowerUp);
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			magicDamage = magic.lightning(level, playerPowerUp);
		}
		else
		{
			magicDamage = 0;
		}
		return magicDamage;
	}
	
	public boolean getDodge()
	{
		return dodgeAmount;
	}
	public boolean dodge()
	{
		dodgeAmount = dodge.dodge();
		return dodgeAmount;
	}

	public int getHealth()
	{
		return healthAmount;
	}
	public void setHealth(int health)
	{
		healthAmount = health;
	}
	public int calculateHealth()
	{
		healthAmount = health.health(healthAmount, damageReceived);
		return healthAmount;
	}

	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}

	public int getDamageReceived()
	{
		return damageReceived;
	}
	public void setDamageReceived(int damageReceived, int damageBlocked)
	{
		int check;
		check = damageReceived - damageBlocked;
		if (check < 0)
			this.damageReceived = 0;
		else
			this.damageReceived = check;
	}
}
