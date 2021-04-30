package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for d�ng�s� ile 1'den 10'a kadar tek say�lar� yazd�rd�k
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);

		}
		System.out.println("For d�ng�s� bitti");

		
		// while d�ng�s� ile 1'den 10'a kadar �ift say�lar� yazd�rd�k
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While d�ng�s� bitti");

		
		// do-while d�ng�s� ile 1'den 10'a kadar say�lar� yazd�rd�k
		// do d�ng�s� �nce �al���r sonra �arta bakar.
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);

		System.out.println("Do-While d�ng�s� bitti");

	}

}
