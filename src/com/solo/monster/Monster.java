package com.solo.monster;

import java.util.Random;

import com.solo.test.CharacterAtribut;

public class Monster extends CharacterAtribut implements SuaraMonster{
	public int monsterLvl;
	public int hp;
	public int STR = 1;
	public String race = "";
	Random rand = new Random();
	
	public Monster(int heroLevel) {
		monsterLvl = (int) (1 + (heroLevel * 1.75));
		STR += (monsterLvl * 1);
		setRace(rand.nextInt(4));
		hp = super.getHp(STR);
	}

	private void setRace(int randomRace) {
		switch (randomRace) {
			case 0: {
				race = "Slime";
				break;
			}
			case 1: {
				race = "Dragon";
				break;
			}
			case 2: {
				race = "Wolf";
				break;
			}
			default: race = "unknown";
		}
	}

	@Override
	public String suaraMonster() {
		String suara = "";
		switch (race) {
			case "Slime": {
				 suara = race + ": blub blub";
				 break;
			}
			case "Dragon": {
				suara = race + ": growl";
				break;
			}
			case "Wolf": {
				suara = race + ": howl";
				break;
			}
			default: suara = race + ": roar";
		}
		return suara;
	}

}
