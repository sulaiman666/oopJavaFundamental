package com.solo.hero;

import com.solo.test.CharacterAtribut;

public class Hero extends CharacterAtribut {
	int xp;
	int xpTreshold;
	String name;
	private int lvl;
	int hp;
	public int str = 1;
	public Hero(String name) {
		lvl = 0;
		xpTreshold = 40;
		xp = 0;
		hp = super.getHp(str);
		this.name = name;
		System.out.println("Welcome " + this.name + "!");
		System.out.println("Level: " + lvl);
		System.out.println("XP needed to level up: " + xpTreshold);
		System.out.println("Your HP: " + hp);
		
	}
	
	public int getLVL() {
		return lvl;
	}
	
	public String lvlUp() {
		str += (lvl * 1);
		return "";
	}
	
	
	public String foundAMonster(String race) {
		return "A wild " + race + " appears!";
	}
	
	public String attackMonster(String race, int damage) {
		if (damage == 0 ) {
			return "Miss!";
		} else return "You launch an attack to " + race + "! \n"
				+ "Damage: " + damage;
	}
	
	public String killMonster(String race, int monsterLevel) {
		xp += (monsterLevel * 40);
		String kalimat = "An "+ race +" has been slain! you get " + xp + " XP\n";
		return kalimat;
	}

	public void lvlCheck() {
		// TODO Auto-generated method stub		
		while (xp >= xpTreshold) {
			xp -= xpTreshold;
			lvl++;
			xpTreshold = lvl * 40;
			//str += ;
			System.out.println("Level up to level " + lvl + "!");
			System.out.println("XP needed to level up: " + xpTreshold);
			System.out.println("Your XP: " + xp + "\n");
		}
	}
}
