package methods2;
//operasyon = metot = fonksiyon
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0,2); //substring bir değer döndürür.
		//Bizim örneğimizde mesaj metninin 0. indexiyle 1.indexini döndürür.
		System.out.println(yeniMesaj);
		String yeniMesaj2 = sehirVer(); 
		System.out.println(yeniMesaj2);
		int sayi = topla(15,7);  // 5 ve 7 argümanlardır.
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
		
		
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}	
	
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2)  // int sayi1 ve int sayi2 topla metotunun parametreleridir.
	{	return sayi1 + sayi2;
		//int metotu geriye tam sayı bir değer döndürür.
	}
	
	public static int topla2(int... sayilar)   //variable arguments
	{	
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
		//String metotu geriye string döndürür.
	}
}

