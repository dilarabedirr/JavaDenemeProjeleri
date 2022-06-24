package javaDenemeProjeleri.proje2;

public class Main {

	public static void main(String[] args) {
		int yuzler, onlar, birler;
		int basNumber = 3;

		for (int i = 100; i < 1000; i++) {
			yuzler = i / 100;
			onlar = (i % 100) / 10;
			birler = i % 10;
			int total = (int) Math.pow(yuzler, basNumber) + (int) Math.pow(onlar, basNumber)
					+ (int) Math.pow(birler, basNumber);

			if (total == i) {
				System.out.println(i + " armstrong sayýdýr.");
			}
		}
	}

}
