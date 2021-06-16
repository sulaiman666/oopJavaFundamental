package com.solo.section1;

public class Ayah extends Kakek {
	private String nama = "Ayah";
	
	@Override
	public void keluargaSulaiman() {
		// TODO Auto-generated method stub
		System.out.println("Saya anak dari Sulaiman");
	}
	
	public Ayah() {
		System.out.println("Ayah diinisiasi");	
		super.getNama();
	}
	
	@Override
	public void getNama() {
		// TODO Auto-generated method stub
		System.out.println(nama);
	}
	
	@Override
	public void prestasi() {
		// TODO Auto-generated method stub
		System.out.println("Prestasi ayah: ");
		System.out.println("1. Seorang Dokter");
		super.prestasi();
	}
	
	public void punyaGadget() {
		System.out.println("Ayah punya Iphone");
		System.out.println();
	}

}
