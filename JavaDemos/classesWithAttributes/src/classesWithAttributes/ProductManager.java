package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBS codes
		System.out.println("Ürün eklendi: " + product.get_name());
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price, String renk) {
		
	}
}
