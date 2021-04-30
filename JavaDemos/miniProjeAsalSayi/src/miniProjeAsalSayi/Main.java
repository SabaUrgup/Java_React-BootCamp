package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2; //% :2 ile bölümünden kalaný verir
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Asal deðildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayý");
			return;
		}
		
		for (int i=2 ; i<number ; i++) {
			if(number % i == 0 ) {
				isPrime = false;	
			}
		}
		
		if(isPrime) {
			System.out.println("Sayý asaldýr.");
		}else {
			System.out.println("Sayý asal deðildir.");

		}

	}

}
