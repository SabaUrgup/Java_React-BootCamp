package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik yapıcı blok çalıştı");

	}
	
	static {
		System.out.println("Statik yapıcı blok çalıştı");

	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
//ProductValidator bir ürünü kaydederken, güncellerken ürününün kurallara uygun olup olmadığını bulmak için kullanırız.
//Bir metot static yapıldığında class ismi ile direk çağırılır.
// yapıcı bloklar new'leyince çalışır.
//static yapıcı bloklar new'e gerek duymadan çalışır.
//Birden fazla static blok oluşturulabilir ama yaygın bir kullanımı yoktur.
//inner class ---> Class içersinde başka bir class
//classlar başına static almıyor eğer inner class ise alabiliyor.
