package com.solo.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.solo.hero.Hero;
import com.solo.monster.Monster;

//import com.solo.interfaces.KeluargaSulaiman;
//import com.solo.section1.Ayah;
//import com.solo.section1.Ibu;
//import com.solo.section1.Kakek;

public class Main {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Random rand = new Random();
		String name = "Sulaiman";
		System.out.println("Welcome to dungeon hunter "+ name + "!");
		//System.out.println("Enter your hero name!");
		//String name = in.nextLine();
		System.out.println();
		
		Hero knight = new Hero(name);
		int heroSTR = knight.str;
		int damage = 0;
		
		System.out.println();
		
		Monster monster = new Monster(knight.getLVL());
		while (knight.getLVL() < 4) {
			int monsterHP = monster.hp;
			
			System.out.println(knight.foundAMonster(monster.race));
			System.out.println("Monster level: " + monster.monsterLvl);
			System.out.println("Enemy HP: " + monsterHP);
			System.out.println();
			
			while (monsterHP > 0) {
				System.out.println(monster.suaraMonster());
				damage = heroSTR * rand.nextInt(35);
				System.out.println(knight.attackMonster(monster.race, damage));
				monsterHP -= damage;
				if (monsterHP > 0) {
					System.out.println(monster.race + " HP: " + monsterHP);
					System.out.println();
				} else {
					System.out.println(knight.killMonster(monster.race, monster.monsterLvl));
					knight.lvlCheck();
				}
			}
			monster = new Monster(knight.getLVL());
		}
	}
}

//// TODO Auto-generated method stub
//Kakek kakek = new Kakek();
//Ibu ibu = new Ibu();
//kakek.prestasi();
//
//Ayah ayah = new Ayah();
//System.out.println();
//ayah.prestasi();
//ayah.punyaGadget();
//ayah.getNama();
//
//List<KeluargaSulaiman> keluarga = new ArrayList<KeluargaSulaiman>();
//keluarga.add(kakek);
//keluarga.add(ayah);
//keluarga.add(ibu);
//
//for (KeluargaSulaiman keluargaSulaiman : keluarga) {
//	keluargaSulaiman.keluargaSulaiman();
//}
