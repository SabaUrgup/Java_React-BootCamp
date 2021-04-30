package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel. ";
		System.out.println(mesaj);
		
		System.out.println("---------------------");
		
		System.out.println("Eleman sayýsý : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.concat(" Yaþasýn!")); //yeni bir string oluþturur. Tekrar kullanýlacaksa bir deðiþkene atanmalýdýr.
		System.out.println(mesaj);
		
		System.out.println("---------------------");
		/*
		 * startsWith ve endsWith metotlarý boolean karakter geri döndürür.
		 * startsWith("b") : metin b ile mi baþlýyor? True or False endsWith(".") :
		 * metin . ile mi bitiyor? True or False
		 */
				
		System.out.println(mesaj.startsWith("b")); // java case sensitive bir dildir.
		System.out.println(mesaj.endsWith("."));
		
		System.out.println("---------------------");
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.indexOf('a')); //sol baþtan baþlayarak a karakterini arar indexini döndürür.
		System.out.println(mesaj.indexOf("av")); //sol baþtan baþlayarak av'ý arar indexini döndürür.
		System.out.println(mesaj.lastIndexOf('a')); //sað baþtan baþlayarak a karakterini arar indexini döndürür.
		
		System.out.println("---------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-'); //yeni bir metin oluþturur ve onu yeniMesaj'a aktarýr.
		System.out.println(yeniMesaj);
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.substring(2)); //substring metodu metinin 2. indexinden baþlar sonuna kadar alýr.
		System.out.println(mesaj.substring(2,5)); //substring metodu metinin 2. indexinden baþlar 5. indexine kadar alýr.
		
		System.out.println("---------------------");
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			// Split metodu ile metnin bütün kelimelirini alt alta yazdýrdýk. Boþluðu da kapsar.
		}

		System.out.println("---------------------");
		
		System.out.println(mesaj.toLowerCase());  //Metinin bütün harflerini küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase());  //Metinin bütün harflerini büyük harfe çevirir.
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.trim());  //trim metodu ile metnin baþýndaki ve sonundaki boþluklarý sildik.

		
	}

}
