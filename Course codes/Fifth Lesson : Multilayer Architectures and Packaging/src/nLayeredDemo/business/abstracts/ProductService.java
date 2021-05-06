package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getall();
	
}
//iş sınıfının interface'i'
//servis edilecek operasyonlar yazılır.