package kodlamaio.northwind.dataAccess.abstracts;
//data layer-date access-persistence katmanı :Veri erişim işlerinin yapıldığı katman 

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
//veri tabanı intereger olduğu için ona göre yapılandırdık.
	
	
	
}
//interface interface'i extends eder.