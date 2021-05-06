package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;
//Java'da başka bir paketteki sınıfı kullanmak istiyorsak onu import etmek gerekir.

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitInStock;
	
	public Product() {}

	public Product(int id, int categoryId, String name, double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	
	
	
}
