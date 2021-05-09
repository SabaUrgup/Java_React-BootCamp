package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")

public class Product {
	
	@Id
	@GeneratedValue
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
	
	public Product() {		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
	/*
	 * Spring Famework Bir class'ın hangi katmana karşılık geldiğini Anatosyon yöntemi ile sorar. 
	 * anotasyon ---> Bir class'ın çalışma ya da derleme anında
	 onunla ilgili bilgi toplamak için kullanılan bir yapı 
	 * Java' da anotasyonun karşılığı --> @Entity
	 */
}
