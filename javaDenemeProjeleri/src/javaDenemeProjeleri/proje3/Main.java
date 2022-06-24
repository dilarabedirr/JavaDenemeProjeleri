package javaDenemeProjeleri.proje3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {
		String dosyaYolu = "C:\\Users\\dilar\\Desktop\\atkOzelAtik.jsp";
		File dosyaAdi = new File(dosyaYolu);
		Scanner okuyucu = new Scanner(dosyaAdi);

		while (okuyucu.hasNext()) {
			String okunan = okuyucu.next();
			regex(okunan);
		}

		okuyucu.close();
		search(list);
	}

	static void regex(String text) {
		String regex = "id[\\=][\\\"][\\w-\\.]+[\\\"]";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(text);
		if (m.matches()) {
			list.add(text);
		}

	}

	static void search(ArrayList<String> list) {
		for (String string : list) {
			System.out.println(string);
		}

		String bakildimi[] = new String[list.size()];
		int bakilansayi = 0;
		for (int i = 0; i < list.size(); i++) {
			int a = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(bakildimi[j])) {
					a++;
				}
			}
			if (a == 0) {
				int sayiAdedi = 0;
				for (int t = 0; t < list.size(); t++) {
					if (list.get(i).equals(list.get(t))) {
						sayiAdedi++;
					}
				}
				bakildimi[bakilansayi] = list.get(i);
				bakilansayi++;
				if (sayiAdedi > 1) {
					System.out.println(list.get(i) + " " + sayiAdedi + " kere kullanýlmýþtýr. ");
				}
			}
		}
	}
}
