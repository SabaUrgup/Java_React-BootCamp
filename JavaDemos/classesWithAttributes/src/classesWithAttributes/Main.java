package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Asus Laptop", 3, 5000, "siyah");
		
		/*
		 * Product product = new Product(); 
		 * product.set_name("Laptop");
		 * product.setId(1); 
		 * product.set_description("Asus Laptop");
		 * product.set_price(5000); 
		 * product.set_stockAmount(3);
		 */
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.get_kod());	
	
	}

}
//Sınıflar ilgili operasyonları ilgili özellikleri tutarlar
//Bir sınıfın içerisinde başka bir sınıfı kullanabiliriz.
//SOLİD prensipleri gereği bir sınıf sadece bir iş yapar, tek bir sorumluluğu vardır.