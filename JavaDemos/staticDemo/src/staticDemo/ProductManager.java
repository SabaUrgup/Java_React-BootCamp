package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	
		/*
		 * ProductValidator productValidator = new ProductValidator(); 
		 * //new'lediğimiz için constructor bloğu çalışır. 
		 * productValidator.bisey();
		 */
	}
}
