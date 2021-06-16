package com.solo.section1;

import com.solo.interfaces.KeluargaSulaiman;

public class Kakek implements KeluargaSulaiman{
	
	private String nama = "Sulaiman";
	
	// Konstruktor
	public Kakek() {
		System.out.println("Kakek diinisiasi");
		System.out.println();
	}
	
	public void getNama() {
		System.out.println(nama);
	}
	
	// Public modifier
	public void prestasi() {
		System.out.println("Prestasi Kakek: ");
		System.out.println("1. Pahlawan");
		System.out.println("2. Menikahi nenek");
		System.out.println();
	}
	
	// Private modifier
	private void dosa() {
		System.out.println("Dosa kakek: ");
		System.out.println("1. Suka nyebat");
		System.out.println();
	}

	@Override
	public void keluargaSulaiman() {
		// TODO Auto-generated method stub
		System.out.println("Saya kepala keluarga Sulaiman");
	}

}
