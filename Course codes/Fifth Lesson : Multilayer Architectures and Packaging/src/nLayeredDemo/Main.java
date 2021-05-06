package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JloggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek(13.satır)
		ProductService productService = new ProductManager(new AbcProductDao(), 
				new JloggerManagerAdapter());
		Product product = new Product(1, 2,"Elma", 12, 50);
		productService.add(product);
	}

}
//Katmanlı Mimariler
//Core katmanı bütün projelerde kullanılacak yapıyı barındırır.
//entities iş yapan, özellikleri taşıyan sınıfları içerir
//Katmanlar(Data Access-Business-API) bibiri ile etkileşim sağlarken soyutlama tekniğini (interfaces) kullanırlar.
//concretes --> somut, iş yapan sınıflar
//abstracts --> soyut sınıflar
// interface'ler somut sınıfların referansını tutabilir.