package classes;

//Classes are reference types

public class Main {
		//Java'da iş yapan her şey bir sınıfdır.
	public static void main(String[] args) {
		CustomerManager customerManager;  //CustomerManager customerManager = new CustomerManager(); ifadesi ile aynıdır çünkü customerManager = customerManager2; 
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; //customerManager'ın referans numarası customerManager2'nin referansına eşittir.
		// CustomerManager sınıfındaki metotları çağırıyoruz;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;	// sayi2'nin değeri sayi1'in değerine eşitle
		sayi1 = 30;
		System.out.println(sayi2);

		//Diziler referans tiptir.
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {4, 5, 6};
		sayilar2 = sayilar1;	//sayilar2'nin referans numarası sayilar1'in referansını aldı
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
}
// Herhangi bir referansı tutan kimse kalmazsa Garbage Collector yani Java'nın bellek yöneticisi bellekten o referansı siler.

}

