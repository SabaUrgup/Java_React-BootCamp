package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		/*
		 * İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir. 
		 * Örnek: 220 ve 284 
		 * 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 284: 1 + 2 + 4 + 71 + 142 = 220
		 */
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1; i<number1; i++) {
			if(number1 % i == 0) {
				total1+=i;	//total1+=i --> total1 = total1 + i		
			}
			if(number2 % i == 0) {
				total2+=i;			
			}
		}
		//&&--> end operatörü iki koşulu da sağlayı sağlamadığına bakar.
		if(total1==number2 && total2==number1) {
			System.out.println("Arkadaş sayılardır");
		}else {
			System.out.println("Arkadaş sayılar değildir");
		}
		
	}

}
