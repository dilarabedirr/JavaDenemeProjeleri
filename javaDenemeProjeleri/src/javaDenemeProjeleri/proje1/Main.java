package javaDenemeProjeleri.proje1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();

		ogrenciList.add(new Ogrenci(155, "Ahmet Yilmaz", "Bilgisayar"));
		ogrenciList.add(new Ogrenci(135, "Ayse Ozturk", "Elektronik"));
		ogrenciList.add(new Ogrenci(155, "Dilara Bedir", "Bilgisayar"));

		System.out.println("Öðrenci Listesi Yazdýrýlýyor.");

		for (Ogrenci ogrenci : ogrenciList) {
			printObj(ogrenci);
		}

		HashMap<Integer, String> malzemeList = new HashMap<Integer, String>();

		malzemeList.put(155, "Mouse");
		malzemeList.put(135, "Keyboard");

		System.out.println("Malzeme Listesi Yazdýrýlýyor.");

		for (Integer i : malzemeList.keySet()) {
			printObj(i, malzemeList.get(i));
		}

		String okulAdi = "ytu";
		System.out.println("Okul Adý Yazdýrýlýyor.");
		printObj(okulAdi);

	}

	static void printObj(Ogrenci ogrenci) {
		System.out.println("No : " + ogrenci.getNo() + ", Ad : " + ogrenci.getAd() + ", Bölüm : " + ogrenci.getBolum());
	}

	static void printObj(String okulAdi) {
		System.out.println("Okul Adý : " + okulAdi);
	}

	static void printObj(int key, String value) {
		System.out.println("No : " + key + ", Ad : " + value);
	}
}
