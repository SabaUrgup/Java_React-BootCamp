package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu ="İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu= false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");	
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String kredi1 = "Hızlı Kredisi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "Kültür bakanlığı Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = 
				{
							"Hızlı Kredisi",
							"Mutlu Emekli Kredisi",
							"Konut Kredisi",
							"Çiftçi Kredisi",
							"Msb Kredisi",
							"Meb Kredisi",
							"Kültür bakanlığı Kredisi"
				};
//		foreach
		for(String kredi : krediler) { 
			System.out.println(kredi);

		}
//		i++ ile i=i+1 aynı şeyi temsil eder.
		for (int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
	}
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);

		
	}
}
