package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		/*
		 * Mükemmel sayılar kendisi dışında bölenlerinin toplamına eşit olan sayılardır. Örneğin;
		 * 6-->1+2+3 28-->1+2+4+7+14
		 */
		int number = 28;
		int total = 0;
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total+=i;	//total+=i --> total = total + i			
			}
		}
		if(total==number) {
			System.out.println("Mükemmel bir sayıdır");
		}else {
			System.out.println("Mükemmel bir sayı değildir");
		}
	}	

}
