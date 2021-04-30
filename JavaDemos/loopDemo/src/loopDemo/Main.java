package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for döngüsü ile 1'den 10'a kadar tek sayýlarý yazdýrdýk
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);

		}
		System.out.println("For döngüsü bitti");

		
		// while döngüsü ile 1'den 10'a kadar çift sayýlarý yazdýrdýk
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While döngüsü bitti");

		
		// do-while döngüsü ile 1'den 10'a kadar sayýlarý yazdýrdýk
		// do döngüsü önce çalýþýr sonra þarta bakar.
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);

		System.out.println("Do-While döngüsü bitti");

	}

}
