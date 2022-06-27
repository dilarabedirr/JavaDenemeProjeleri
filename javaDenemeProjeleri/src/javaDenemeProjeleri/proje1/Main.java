package javaDenemeProjeleri.proje1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

		String okulAdi = "ytu";

		printObj(malzemeList);
		printObj(okulAdi);

	}

	static void printObj(Object object) {
		if (object instanceof Ogrenci) {
			System.out.println(" No : " + ((Ogrenci) object).getNo() + ", Ad : " + ((Ogrenci) object).getAd()
					+ ", Bolum : " + ((Ogrenci) object).getBolum());
		}
		if (object instanceof HashMap<?, ?>) {
			System.out.println("Malzeme Listesi Yazdýrýlýyor.");
			for (Map.Entry<?, ?> entry : ((HashMap<?, ?>) object).entrySet()) {
				Object no = entry.getKey();
				Object ad = entry.getValue();
				System.out.println(" No : " + no + ", Ad : " + ad);
			}
		}

		if (object instanceof String) {
			System.out.println("Okul Adý Yazdýrýlýyor.\n Okul Adý : " + object);
		}
	}
}
