package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel. ";
		System.out.println(mesaj);
		
		System.out.println("---------------------");
		
		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.concat(" Ya�as�n!")); //yeni bir string olu�turur. Tekrar kullan�lacaksa bir de�i�kene atanmal�d�r.
		System.out.println(mesaj);
		
		System.out.println("---------------------");
		/*
		 * startsWith ve endsWith metotlar� boolean karakter geri d�nd�r�r.
		 * startsWith("b") : metin b ile mi ba�l�yor? True or False endsWith(".") :
		 * metin . ile mi bitiyor? True or False
		 */
				
		System.out.println(mesaj.startsWith("b")); // java case sensitive bir dildir.
		System.out.println(mesaj.endsWith("."));
		
		System.out.println("---------------------");
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.indexOf('a')); //sol ba�tan ba�layarak a karakterini arar indexini d�nd�r�r.
		System.out.println(mesaj.indexOf("av")); //sol ba�tan ba�layarak av'� arar indexini d�nd�r�r.
		System.out.println(mesaj.lastIndexOf('a')); //sa� ba�tan ba�layarak a karakterini arar indexini d�nd�r�r.
		
		System.out.println("---------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-'); //yeni bir metin olu�turur ve onu yeniMesaj'a aktar�r.
		System.out.println(yeniMesaj);
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.substring(2)); //substring metodu metinin 2. indexinden ba�lar sonuna kadar al�r.
		System.out.println(mesaj.substring(2,5)); //substring metodu metinin 2. indexinden ba�lar 5. indexine kadar al�r.
		
		System.out.println("---------------------");
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			// Split metodu ile metnin b�t�n kelimelirini alt alta yazd�rd�k. Bo�lu�u da kapsar.
		}

		System.out.println("---------------------");
		
		System.out.println(mesaj.toLowerCase());  //Metinin b�t�n harflerini k���k harfe �evirir.
		System.out.println(mesaj.toUpperCase());  //Metinin b�t�n harflerini b�y�k harfe �evirir.
		
		System.out.println("---------------------");
		
		System.out.println(mesaj.trim());  //trim metodu ile metnin ba��ndaki ve sonundaki bo�luklar� sildik.

		
	}

}
