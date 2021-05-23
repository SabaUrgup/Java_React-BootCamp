package kodlamaio.northwind.entities.concretes;
//entitie katmanı: varlık katmanı
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")	//table=attribute=decorator
//table anatasyonu, uygulama ayağa kalktığında products nesnesinin bir veri tabanı tablosuna karşılık geldiğini ve o tablonun hangisi olduğunu söyler.
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
	private int id;
    
    @Column(name="category_id")
	private int categoryId;
    
    @Column(name="product_name")
	private String productName;
    
    @Column(name="unit_price")
	private double unitPrice;
    
    @Column(name="units_in_stock")
	private short unitsInStock;
    
    @Column(name="quantity_per_unit")
	private String quantityPerUnit;
	

	/*
	 * Spring Famework Bir class'ın hangi katmana karşılık geldiğini Anatosyon yöntemi ile sorar. 
	 * anotasyon ---> Bir class'ın çalışma ya da derleme anında
	 onunla ilgili bilgi toplamak için kullanılan bir yapı 
	 * Java' da anotasyonun karşılığı --> @Entity
	 * Lombok'ın tüm argümanları kullanarak constructor ekleme anatasyonu --> @AllArgsConstructor
	 * Lombok'ın parametresiz constructor ekleme anatasyonu --> @NoArgsConstructor
	 */
}
