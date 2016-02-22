package warriorProject;
import java.util.Scanner;
public class WeaponShop
{
	private String choiceWeaponType, choiceLight, choiceMedium, choiceHeavy, choiceShield, choicePowerUp, choiceMagic;
	static String playerLightWeapon = "Blow Darts", playerMediumWeapon = "Chain Whip", playerHeavyWeapon = "Shortsword", playerShield = "Wood Shield", playerPowerUp = "", playerMagic = "";
	public void weaponShop()
	{
		WeaponShop weaponShop = new WeaponShop();
		Scanner input = new Scanner(System.in);
		City city = new City();
		System.out.println("\n\n* * * * * * *\n Weapon Shop\n* * * * * * *\n");
		System.out.println("Gold: "+City.gold);
		System.out.println("Level: "+City.level+"\n");
		
		System.out.println("WEAPON TYPE                                                DAMAGE");
		System.out.println();
		System.out.println("LIGHT             Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		System.out.println("Blow Darts          1-2      3-4      5-6      7-8      9-10    11-12    13-14    15-16    17-18    19-20          0");
		if (Purchased.light.contains("Throwing Knives"))
			System.out.println("Throwing Knives     4-5      6-7      8-9     10-11    12-13    14-15    16-17    18-19    20-21    22-23          0");
		else
			System.out.println("Throwing Knives     4-5      6-7      8-9     10-11    12-13    14-15    16-17    18-19    20-21    22-23         10");
		if (Purchased.light.contains("Throwing Axe"))
			System.out.println("Throwing Axe        7-8      9-10    11-12    13-14    15-16    17-18    19-20    21-22    23-24    25-26          0");
		else
			System.out.println("Throwing Axe        7-8      9-10    11-12    13-14    15-16    17-18    19-20    21-22    23-24    25-26         20");
		if (Purchased.light.contains("Mystical Bow"))
			System.out.println("Mystical Bow       10-40                                                                                           0");
		else
			System.out.println("Mystical Bow       10-40                                                                                          30");
		if (Purchased.light.contains("Crossbow"))
			System.out.println("Crossbow           10-11    12-13    14-15    16-17    18-19    20-21    22-23    24-25    26-27    28-29          0");
		else
			System.out.println("Crossbow           10-11    12-13    14-15    16-17    18-19    20-21    22-23    24-25    26-27    28-29         40");
		if (Purchased.light.contains("Javelin"))
			System.out.println("Javelin            13-14    15-16    17-18    19-20    21-22    23-24    25-26    27-28    29-30    31-32          0");
		else
			System.out.println("Javelin            13-14    15-16    17-18    19-20    21-22    23-24    25-26    27-28    29-30    31-32         50");
		if (Purchased.light.contains("Recurve Bow"))
			System.out.println("Recurve Bow        16-17    18-19    20-21    22-23    24-25    26-27    28-29    30-31    32-33    34-35          0");
		else
			System.out.println("Recurve Bow        16-17    18-19    20-21    22-23    24-25    26-27    28-29    30-31    32-33    34-35         60");
		if (Purchased.light.contains("Long Bow"))
			System.out.println("Long Bow           19-20    21-22    23-24    25-26    27-28    29-30    31-32    33-34    35-36    37-38          0");
		else
			System.out.println("Long Bow           19-20    21-22    23-24    25-26    27-28    29-30    31-32    33-34    35-36    37-38         70");
		System.out.println();
		System.out.println();
		System.out.println("MEDIUM            Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		System.out.println("Chain Whip          7-9     10-12    13-15    16-18    19-21    22-24    25-27    28-30    31-33    34-36          0");
		if (Purchased.medium.contains("Ring Sword"))
			System.out.println("Ring Sword         11-13    14-16    17-19    20-22    23-25    26-28    29-31    32-34    35-37    38-40          0");
		else
			System.out.println("Ring Sword         11-13    14-16    17-19    20-22    23-25    26-28    29-31    32-34    35-37    38-40         40");
		if (Purchased.medium.contains("Staff"))
			System.out.println("Staff              15-17    18-20    21-23    24-26    27-29    30-32    33-35    36-38    39-41    42-44          0");
		else
			System.out.println("Staff              15-17    18-20    21-23    24-26    27-29    30-32    33-35    36-38    39-41    42-44         80");
		if (Purchased.medium.contains("Cestus"))
			System.out.println("Cestus             19-21    22-24    25-27    28-30    31-33    34-36    37-39    40-42    43-45    46-48          0");
		else
			System.out.println("Cestus             19-21    22-24    25-27    28-30    31-33    34-36    37-39    40-42    43-45    46-48        120");
		if (Purchased.medium.contains("Spiked Chain"))
			System.out.println("Spiked Chain       23-25    26-28    29-31    32-34    35-37    38-40    41-43    44-46    47-49    50-52          0");
		else
			System.out.println("Spiked Chain       23-25    26-28    29-31    32-34    35-37    38-40    41-43    44-46    47-49    50-52        160");
		if (Purchased.medium.contains("Meteor Hammer"))
			System.out.println("Meteor Hammer      27-29    30-32    33-35    36-38    39-41    42-44    45-47    48-50    51-53    54-56          0");
		else
			System.out.println("Meteor Hammer      27-29    30-32    33-35    36-38    39-41    42-44    45-47    48-50    51-53    54-56        200");
		System.out.println();
		System.out.println();
		System.out.println("HEAVY             Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		System.out.println("Shortsword         15-18    19-22    23-26    27-30    31-34    35-38    39-42    43-46    47-50    51-54          0");
		if (Purchased.heavy.contains("War Hammer"))
			System.out.println("War Hammer         20-23    24-27    28-31    32-35    36-39    40-43    44-47    48-51    52-55    56-59          0");
		else
			System.out.println("War Hammer         20-23    24-27    28-31    32-35    36-39    40-43    44-47    48-51    52-55    56-59         55");
		if (Purchased.heavy.contains("Mace"))
			System.out.println("Mace               25-28    29-32    33-36    37-40    41-44    45-48    49-52    53-56    57-60    61-64          0");
		else
			System.out.println("Mace               25-28    29-32    33-36    37-40    41-44    45-48    49-52    53-56    57-60    61-64        110");
		if (Purchased.heavy.contains("Flail"))
			System.out.println("Flail              30-33    34-37    38-41    42-45    46-49    50-53    54-57    58-61    62-65    66-69          0");
		else
			System.out.println("Flail              30-33    34-37    38-41    42-45    46-49    50-53    54-57    58-61    62-65    66-69        165");
		if (Purchased.heavy.contains("Spear"))
			System.out.println("Spear              35-38    39-42    43-46    47-50    51-54    55-58    59-62    63-66    67-70    71-74          0");
		else
			System.out.println("Spear              35-38    39-42    43-46    47-50    51-54    55-58    59-62    63-66    67-70    71-74        220");
		if (Purchased.heavy.contains("Mystical Sword"))
			System.out.println("Mystical Sword     40-100                                                                                          0");
		else
			System.out.println("Mystical Sword     40-100                                                                                        275");
		if (Purchased.heavy.contains("Trident"))
			System.out.println("Trident            40-43    44-47    48-51    52-55    56-59    60-63    64-67    68-71    72-75    76-79          0");
		else
			System.out.println("Trident            40-43    44-47    48-51    52-55    56-59    60-63    64-67    68-71    72-75    76-79        330");
		if (Purchased.heavy.contains("Scythe"))
			System.out.println("Scythe             45-48    49-52    53-56    57-60    61-64    65-68    69-72    73-76    77-80    81-84          0");
		else
			System.out.println("Scythe             45-48    49-52    53-56    57-60    61-64    65-68    69-72    73-76    77-80    81-84        385");
		if (Purchased.heavy.contains("Battle Axe"))
			System.out.println("Battle Axe         50-53    54-57    58-61    62-65    66-69    70-73    74-77    78-81    82-85    86-89          0");
		else
			System.out.println("Battle Axe         50-53    54-57    58-61    62-65    66-69    70-73    74-77    78-81    82-85    86-89        440");
		if (Purchased.heavy.contains("Broadsword"))
			System.out.println("Broadsword         55-58    59-62    63-66    67-70    71-74    75-78    79-82    83-86    87-90    91-94          0");
		else
			System.out.println("Broadsword         55-58    59-62    63-66    67-70    71-74    75-78    79-82    83-86    87-90    91-94        500");
		System.out.println();
		System.out.println();
		System.out.println("SHIELDS           Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		System.out.println("Wood Shield         2-4      5-7      8-10    11-13    14-16    17-19    20-22    23-25    26-28    29-31          0");
		if (Purchased.shield.contains("Steel Shield"))
			System.out.println("Steel Shield        6-8      9-11    12-14    15-17    18-20    21-23    24-26    27-29    30-32    33-35          0");
		else
			System.out.println("Steel Shield        6-8      9-11    12-14    15-17    18-20    21-23    24-26    27-29    30-32    33-35         25");
		if (Purchased.shield.contains("Mystical Shield"))
			System.out.println("Mystical Shield    10-45                                                                                           0");
		else
			System.out.println("Mystical Shield    10-45                                                                                          50");
		if (Purchased.shield.contains("Iron Shield"))
			System.out.println("Iron Shield        10-12    13-15    16-18    19-21    22-24    25-27    28-30    31-33    34-36    37-39          0");
		else
			System.out.println("Iron Shield        10-12    13-15    16-18    19-21    22-24    25-27    28-30    31-33    34-36    37-39         75");
		if (Purchased.shield.contains("Gold Shield"))
			System.out.println("Gold Shield        14-16    17-19    20-22    23-25    26-28    29-31    32-34    35-37    38-40    41-43          0");
		else
			System.out.println("Gold Shield        14-16    17-19    20-22    23-25    26-28    29-31    32-34    35-37    38-40    41-43        100");
		if (Purchased.shield.contains("Reflector Shield"))
		{
			System.out.println("Reflector Shield    1-4      5-8      9-12    13-16    17-20    21-24    25-28    29-32    33-36    37-40          0");
			System.out.println("                    (Reflects half of the damage from range attacks back to the enemy)");
		}
		else
		{
			System.out.println("Reflector Shield    1-4      5-8      9-12    13-16    17-20    21-24    25-28    29-32    33-36    37-40        150");
			System.out.println("                    (Reflects half of the damage from range attacks back to the enemy)");
		}
		System.out.println();
		System.out.println();
		System.out.println("POWER UPS         Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		if (Purchased.power.contains("Ice"))
			System.out.println("Ice                 +10                                                                                            0");
		else
			System.out.println("Ice                 +10                                                                                          250");
		if (Purchased.power.contains("Fire"))
			System.out.println("Fire                +20                                                                                            0");
		else
			System.out.println("Fire                +20                                                                                          500");
		if (Purchased.power.contains("Lightning"))
			System.out.println("Lightning           +30                                                                                            0");
		else
			System.out.println("Lightning           +30                                                                                          750");
		System.out.println();
		System.out.println();
		System.out.println("MAGIC             Level 1  Level 2  Level 3  Level 4  Level 5  Level 6  Level 7  Level 8  Level 9  Level 10  Cost in Gold");
		if (Purchased.magic.contains("Ice Blast"))
			System.out.println("Ice Blast          10-20    20-30    30-40    40-50    50-60    60-70    70-80    80-90    90-100  100-110         0");
		else
			System.out.println("Ice Blast          10-20    20-30    30-40    40-50    50-60    60-70    70-80    80-90    90-100  100-110       600");
		if (Purchased.magic.contains("Fire Blast"))
			System.out.println("Fire Blast         25-35    35-45    45-55    55-65    65-75    75-85    85-95    95-105  105-115  115-125         0");
		else
			System.out.println("Fire Blast         25-35    35-45    45-55    55-65    65-75    75-85    85-95    95-105  105-115  115-125       700");
		if (Purchased.magic.contains("Lightning Blast"))
			System.out.println("Lightning Blast    40-50    50-60    60-70    70-80    80-90    90-100  100-110  110-120  120-130  130-140         0");
		else
			System.out.println("Lightning Blast    40-50    50-60    60-70    70-80    80-90    90-100  100-110  110-120  120-130  130-140       800");
		
		do
		{
			System.out.println("\n\nGold: "+City.gold);
			System.out.println("\n(1) Light Weapons");
			System.out.println("(2) Medium Weapons");
			System.out.println("(3) Heavy Weapons");
			System.out.println("(4) Shields");
			System.out.println("(5) Power Ups");
			System.out.println("(6) Magic Attacks");
			System.out.println("(7) Current Loadout");
			System.out.println("(8) Display Available Weapons");			
			System.out.println("(9) Exit");
			choiceWeaponType = input.next();
			
			if (choiceWeaponType.equals("1"))
			{
				System.out.println("(1) Blow Darts       0 Gold");
				if (Purchased.light.contains("Throwing Knives"))
					System.out.println("(2) Throwing Knives  0 Gold");
				else
					System.out.println("(2) Throwing Knives 10 Gold");
				if (Purchased.light.contains("Throwing Axe"))
					System.out.println("(3) Throwing Axe     0 Gold");
				else
					System.out.println("(3) Throwing Axe    20 Gold");
				if (Purchased.light.contains("Mystical Bow"))
					System.out.println("(4) Mystical Bow     0 Gold");
				else
					System.out.println("(4) Mystical Bow    30 Gold");
				if (Purchased.light.contains("Crossbow"))
					System.out.println("(5) Crossbow         0 Gold");
				else
					System.out.println("(5) Crossbow        40 Gold");
				if (Purchased.light.contains("Javelin"))
					System.out.println("(6) Javelin          0 Gold");
				else
					System.out.println("(6) Javelin         50 Gold");
				if (Purchased.light.contains("Recurve Bow"))
					System.out.println("(7) Recurve Bow      0 Gold");
				else
					System.out.println("(7) Recurve Bow     60 Gold");
				if (Purchased.light.contains("Long Bow"))
					System.out.println("(8) Long Bow         0 Gold");
				else
					System.out.println("(8) Long Bow        70 Gold");
				System.out.println("(0) Back");
				choiceLight = input.next();
				if (choiceLight.equals("0"));
					System.out.println();
				if (choiceLight.equals("1"))
				{
					if (Purchased.light.contains("Blow Darts"))
					{
						playerLightWeapon = "Blow Darts";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Blow Darts";
							Purchased.light += "Blow Darts";
							City.gold -= 0;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("2"))
				{
					if (Purchased.light.contains("Throwing Knives"))
					{
						playerLightWeapon = "Throwing Knives";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 10)
						{
							System.out.println("Not enough gold");
							System.out.println("10 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Throwing Knives";
							Purchased.light += "Throwing Knives";
							City.gold -= 10;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("3"))
				{
					if (Purchased.light.contains("Throwing Axe"))
					{
						playerLightWeapon = "Throwing Axe";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 20)
						{
							System.out.println("Not enough gold");
							System.out.println("20 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Throwing Axe";
							Purchased.light += "Throwing Axe";
							City.gold -= 20;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("4"))
				{
					if (Purchased.light.contains("Mystical Bow"))
					{
						playerLightWeapon = "Mystical Bow";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 30)
						{
							System.out.println("Not enough gold");
							System.out.println("30 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Mystical Bow";
							Purchased.light += "Mystical Bow";
							City.gold -= 30;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("5"))
				{
					if (Purchased.light.contains("Crossbow"))
					{
						playerLightWeapon = "Crossbow";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 40)
						{
							System.out.println("Not enough gold");
							System.out.println("40 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Crossbow";
							Purchased.light += "Crossbow";
							City.gold -= 40;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("6"))
				{
					if (Purchased.light.contains("Javelin"))
					{
						playerLightWeapon = "Javelin";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 50)
						{
							System.out.println("Not enough gold");
							System.out.println("50 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Javelin";
							Purchased.light += "Javelin";
							City.gold -= 50;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("7"))
				{
					if (Purchased.light.contains("Recurve Bow"))
					{
						playerLightWeapon = "Recurve Bow";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 60)
						{
							System.out.println("Not enough gold");
							System.out.println("60 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Recurve Bow";
							Purchased.light += "Recurve Bow";
							City.gold -= 60;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
				if (choiceLight.equals("8"))
				{
					if (Purchased.light.contains("Long Bow"))
					{
						playerLightWeapon = "Long Bow";
						System.out.println(playerLightWeapon+" selected");
					}
					else
					{
						if (City.gold < 70)
						{
							System.out.println("Not enough gold");
							System.out.println("70 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerLightWeapon = "Long Bow";
							Purchased.light += "Long Bow";
							City.gold -= 70;
							System.out.println(playerLightWeapon+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("2"))
			{
				System.out.println("(1) Chain Whip      0 Gold");
				if (Purchased.medium.contains("Ring Sword"))
					System.out.println("(2) Ring Sword      0 Gold");
				else
					System.out.println("(2) Ring Sword     40 Gold");
				if (Purchased.medium.contains("Staff"))
					System.out.println("(3) Staff           0 Gold");
				else
					System.out.println("(3) Staff          80 Gold");
				if (Purchased.medium.contains("Cestus"))
					System.out.println("(4) Cestus          0 Gold");
				else
					System.out.println("(4) Cestus        120 Gold");
				if (Purchased.medium.contains("Spiked Chain"))
					System.out.println("(5) Spiked Chain    0 Gold");
				else
					System.out.println("(5) Spiked Chain  160 Gold");
				if (Purchased.medium.contains("Meteor Hammer"))
					System.out.println("(6) Meteor Hammer   0 Gold");
				else
					System.out.println("(6) Meteor Hammer 200 Gold");
				System.out.println("(0) Back");
				choiceMedium = input.next();
				if (choiceMedium.equals("0"));
				System.out.println();
				if (choiceMedium.equals("1"))
				{
					if (Purchased.medium.contains("Chain Whip"))
					{
						playerMediumWeapon = "Chain Whip";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Chain Whip";
							Purchased.medium += "Chain Whip";
							City.gold -= 0;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
				if (choiceMedium.equals("2"))
				{
					if (Purchased.medium.contains("Ring Sword"))
					{
						playerMediumWeapon = "Ring Sword";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 40)
						{
							System.out.println("Not enough gold");
							System.out.println("40 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Ring Sword";
							Purchased.medium += "Ring Sword";
							City.gold -= 40;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
				if (choiceMedium.equals("3"))
				{
					if (Purchased.medium.contains("Staff"))
					{
						playerMediumWeapon = "Staff";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 80)
						{
							System.out.println("Not enough gold");
							System.out.println("80 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Staff";
							Purchased.medium += "Staff";
							City.gold -= 80;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
				if (choiceMedium.equals("4"))
				{
					if (Purchased.medium.contains("Cestus"))
					{
						playerMediumWeapon = "Cestus";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 120)
						{
							System.out.println("Not enough gold");
							System.out.println("120 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Cestus";
							Purchased.medium += "Cestus";
							City.gold -= 120;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
				if (choiceMedium.equals("5"))
				{
					if (Purchased.medium.contains("Spiked Chain"))
					{
						playerMediumWeapon = "Spiked Chain";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 160)
						{
							System.out.println("Not enough gold");
							System.out.println("160 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Spiked Chain";
							Purchased.medium += "Spiked Chain";
							City.gold -= 160;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
				if (choiceMedium.equals("6"))
				{
					if (Purchased.medium.contains("Meteor Hammer"))
					{
						playerMediumWeapon = "Meteor Hammer";
						System.out.println(playerMediumWeapon+" selected");
					}
					else
					{
						if (City.gold < 200)
						{
							System.out.println("Not enough gold");
							System.out.println("200 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMediumWeapon = "Meteor Hammer";
							Purchased.medium += "Meteor Hammer";
							City.gold -= 200;
							System.out.println(playerMediumWeapon+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("3"))
			{
				System.out.println("(1) Shortsword       0 Gold");
				if (Purchased.heavy.contains("War Hammer"))
					System.out.println("(2) War Hammer       0 Gold");
				else
					System.out.println("(2) War Hammer      55 Gold");
				if (Purchased.heavy.contains("Mace"))
					System.out.println("(3) Mace             0 Gold");
				else
					System.out.println("(3) Mace           110 Gold");
				if (Purchased.heavy.contains("Flail"))
					System.out.println("(4) Flail            0 Gold");
				else
					System.out.println("(4) Flail          165 Gold");
				if (Purchased.heavy.contains("Spear"))
					System.out.println("(5) Spear            0 Gold");
				else
					System.out.println("(5) Spear          220 Gold");
				if (Purchased.heavy.contains("Mystical Sword"))
					System.out.println("(6) Mystical Sword   0 Gold");
				else
					System.out.println("(6) Mystical Sword 275 Gold");
				if (Purchased.heavy.contains("Trident"))
					System.out.println("(7) Trident          0 Gold");
				else
					System.out.println("(7) Trident        330 Gold");
				if (Purchased.heavy.contains("Scythe"))
					System.out.println("(8) Scythe           0 Gold");
				else
					System.out.println("(8) Scythe         385 Gold");
				if (Purchased.heavy.contains("Battle Axe"))
					System.out.println("(9) Battle Axe       0 Gold");
				else
					System.out.println("(9) Battle Axe     440 Gold");
				if (Purchased.heavy.contains("Broadsword"))
					System.out.println("(10) Broadsword      0 Gold");
				else
					System.out.println("(10) Broadsword    500 Gold");
				System.out.println("(0) Back");
				choiceHeavy = input.next();
				if (choiceHeavy.equals("0"));
					System.out.println();
				if (choiceHeavy.equals("1"))
				{
					if (Purchased.heavy.contains("Shortsword"))
					{
						playerHeavyWeapon = "Shortsword";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Shortsword";
							Purchased.heavy += " Shortsword";
							City.gold -= 0;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("2"))
				{
					if (Purchased.heavy.contains("War Hammer"))
					{
						playerHeavyWeapon = "War Hammer";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 55)
						{
							System.out.println("Not enough gold");
							System.out.println("55 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "War Hammer";
							Purchased.heavy += " War Hammer";
							City.gold -= 55;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("3"))
				{
					if (Purchased.heavy.contains("Mace"))
					{
						playerHeavyWeapon = "Mace";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 110)
						{
							System.out.println("Not enough gold");
							System.out.println("110 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Mace";
							Purchased.heavy += " Mace";
							City.gold -= 110;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("4"))
				{
					if (Purchased.heavy.contains("Flail"))
					{
						playerHeavyWeapon = "Flail";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 165)
						{
							System.out.println("Not enough gold");
							System.out.println("165 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Flail";
							Purchased.heavy += " Flail";
							City.gold -= 165;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("5"))
				{
					if (Purchased.heavy.contains("Spear"))
					{
						playerHeavyWeapon = "Spear";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 220)
						{
							System.out.println("Not enough gold");
							System.out.println("220 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Spear";
							Purchased.heavy += " Spear";
							City.gold -= 220;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("6"))
				{
					if (Purchased.heavy.contains("Mystical Sword"))
					{
						playerHeavyWeapon = "Mystical Sword";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 275)
						{
							System.out.println("Not enough gold");
							System.out.println("275 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Mystical Sword";
							Purchased.heavy += " Mystical Sword";
							City.gold -= 275;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("7"))
				{
					if (Purchased.heavy.contains("Trident"))
					{
						playerHeavyWeapon = "Trident";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 330)
						{
							System.out.println("Not enough gold");
							System.out.println("330 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Trident";
							Purchased.heavy += " Trident";
							City.gold -= 330;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("8"))
				{
					if (Purchased.heavy.contains("Scythe"))
					{
						playerHeavyWeapon = "Scythe";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 385)
						{
							System.out.println("Not enough gold");
							System.out.println("385 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Scythe";
							Purchased.heavy += " Scythe";
							City.gold -= 385;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("9"))
				{
					if (Purchased.heavy.contains("Battle Axe"))
					{
						playerHeavyWeapon = "Battle Axe";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 440)
						{
							System.out.println("Not enough gold");
							System.out.println("440 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Battle Axe";
							Purchased.heavy += " Battle Axe";
							City.gold -= 440;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
				if (choiceHeavy.equals("10"))
				{
					if (Purchased.heavy.contains("Broadsword"))
					{
						playerHeavyWeapon = "Broadsword";
						System.out.println(playerHeavyWeapon+" selected");
					}
					else
					{
						if (City.gold < 500)
						{
							System.out.println("Not enough gold");
							System.out.println("500 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHeavyWeapon = "Broadsword";
							Purchased.heavy += " Broadsword";
							City.gold -= 500;
							System.out.println(playerHeavyWeapon+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("4"))
			{
				System.out.println("(1) Wood Shield        0 Gold");
				if (Purchased.shield.contains("Steel Shield"))
					System.out.println("(2) Steel Shield       0 Gold");
				else
					System.out.println("(2) Steel Shield      25 Gold");
				if (Purchased.shield.contains("Mystical Shield"))
					System.out.println("(3) Mystical Shield    0 Gold");
				else
					System.out.println("(3) Mystical Shield   50 Gold");
				if (Purchased.shield.contains("Iron Shield"))
					System.out.println("(4) Iron Shield        0 Gold");
				else
					System.out.println("(4) Iron Shield       75 Gold");
				if (Purchased.shield.contains("Gold Shield"))
					System.out.println("(5) Gold Shield        0 Gold");
				else
					System.out.println("(5) Gold Shield      100 Gold");
				if (Purchased.shield.contains("Reflector Shield"))
					System.out.println("(6) Reflector Shield   0 Gold");
				else
					System.out.println("(6) Reflector Shield 200 Gold");
				System.out.println("(0) Back");
				choiceShield = input.next();
				if (choiceShield.equals("0"));
					System.out.println();
				if (choiceShield.equals("1"))
				{
					if (Purchased.shield.contains("Wood Shield"))
					{
						playerShield = "Wood Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Wood Shield";
							Purchased.shield += "Wood Shield";
							City.gold -= 0;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("2"))
				{
					if (Purchased.shield.contains("Steel Shield"))
					{
						playerShield = "Steel Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 25)
						{
							System.out.println("Not enough gold");
							System.out.println("25 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Steel Shield";
							Purchased.shield += "Steel Shield";
							City.gold -= 25;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("3"))
				{
					if (Purchased.shield.contains("Mystical Shield"))
					{
						playerShield = "Mystical Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 50)
						{
							System.out.println("Not enough gold");
							System.out.println("50 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Mystical Shield";
							Purchased.shield += "Mystical Shield";
							City.gold -= 50;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("4"))
				{
					if (Purchased.shield.contains("Iron Shield"))
					{
						playerShield = "Iron Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 75)
						{
							System.out.println("Not enough gold");
							System.out.println("75 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Iron Shield";
							Purchased.shield += "Iron Shield";
							City.gold -= 75;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("5"))
				{
					if (Purchased.shield.contains("Gold Shield"))
					{
						playerShield = "Gold Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 100)
						{
							System.out.println("Not enough gold");
							System.out.println("100 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Gold Shield";
							Purchased.shield += "Gold Shield";
							City.gold -= 100;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("6"))
				{
					if (Purchased.shield.contains("Reflector Shield"))
					{
						playerShield = "Reflector Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 150)
						{
							System.out.println("Not enough gold");
							System.out.println("150 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Reflector Shield";
							Purchased.shield += "Reflector Shield";
							City.gold -= 150;
							System.out.println(playerShield+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("5"))
			{
				if (Purchased.power.contains("Ice"))
					System.out.println("(1) Ice         0 Gold");
				else
					System.out.println("(1) Ice       250 Gold");
				if (Purchased.power.contains("Fire"))
					System.out.println("(2) Fire        0 Gold");
				else
					System.out.println("(2) Fire      500 Gold");
				if (Purchased.power.contains("Lightning"))
					System.out.println("(3) Lightning   0 Gold");
				else
					System.out.println("(3) Lightning 750 Gold");
				System.out.println("(0) Back");
				choicePowerUp = input.next();
				if (choicePowerUp.equals("0"));
					System.out.println();
				if (choicePowerUp.equals("1"))
				{
					if (Purchased.power.contains("Ice"))
					{
						playerPowerUp = "Ice";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 250)
						{
							System.out.println("Not enough gold");
							System.out.println("250 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Ice";
							Purchased.power += "Ice";
							City.gold -= 250;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
				if (choicePowerUp.equals("2"))
				{
					if (Purchased.power.contains("Fire"))
					{
						playerPowerUp = "Fire";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 500)
						{
							System.out.println("Not enough gold");
							System.out.println("500 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Fire";
							Purchased.power += "Fire";
							City.gold -= 500;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
				if (choicePowerUp.equals("3"))
				{
					if (Purchased.power.contains("Lightning"))
					{
						playerPowerUp = "Lightning";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 750)
						{
							System.out.println("Not enough gold");
							System.out.println("750 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Lightning";
							Purchased.power += "Lightning";
							City.gold -= 750;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("6"))
			{
				if (Purchased.magic.contains("Ice Blast"))
					System.out.println("(1) Ice Blast          0 Gold");
				else
					System.out.println("(1) Ice Blast        600 Gold");
				if (Purchased.magic.contains("Fire Blast"))
					System.out.println("(2) Fire Blast         0 Gold");
				else
					System.out.println("(2) Fire Blast       700 Gold");
				if (Purchased.magic.contains("Lightning Blast"))
					System.out.println("(3) Lightning Blast    0 Gold");
				else
					System.out.println("(3) Lightning Blast  800 Gold");
				System.out.println("(0) Back");
				choiceMagic = input.next();
				if (choiceMagic.equals("0"));
					System.out.println();
				if (choiceMagic.equals("1"))
				{
					if (Purchased.magic.contains("Ice Blast"))
					{
						playerMagic = "Ice Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 600)
						{
							System.out.println("Not enough gold");
							System.out.println("600 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Ice Blast";
							Purchased.magic += "Ice Blast";
							City.gold -= 600;
							System.out.println(playerMagic+" selected");
						}
					}
				}
				if (choiceMagic.equals("2"))
				{
					if (Purchased.magic.contains("Fire Blast"))
					{
						playerMagic = "Fire Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 700)
						{
							System.out.println("Not enough gold");
							System.out.println("700 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Fire Blast";
							Purchased.magic += "Fire Blast";
							City.gold -= 700;
							System.out.println(playerMagic+" selected");
						}
					}
				}
				if (choiceMagic.equals("3"))
				{
					if (Purchased.magic.contains("Lightning Blast"))
					{
						playerMagic = "Lightning Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 800)
						{
							System.out.println("Not enough gold");
							System.out.println("800 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Lightning Blast";
							Purchased.magic += "Lightning Blast";
							City.gold -= 800;
							System.out.println(playerMagic+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("7"))
			{
				System.out.println("Light Weapon: "+playerLightWeapon);
				System.out.println("Medium Weapon: "+playerMediumWeapon);
				System.out.println("Heavy Weapon: "+playerHeavyWeapon);
				System.out.println("Shield: "+playerShield);
				System.out.println("Power Up: "+playerPowerUp);
				System.out.println("Magic: "+playerMagic);
			}
			if (choiceWeaponType.equals("8"))
			{
				weaponShop.weaponShop();
			}
			if (choiceWeaponType.equals("9"))
				city.city();
//			System.out.println(Purchased.weapons);
		} while (!choiceWeaponType.equals("9"));
	}
}
