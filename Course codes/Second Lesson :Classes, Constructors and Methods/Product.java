package oopIntro;

public class Product {
	
	public Product() {  //contructor bloðu
		System.out.println("Ben çalýþtým");
		// Ýmza ile product2 ve product3 için çalýþan constructorlar
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();  //constructorlarla birbirini çalýþtýrdýk ve product1 için de 'Ben çalýþtým' ifadesini ekrana yazdýrdýk.
		this.id = id; 	//public class Product sýnýfýndaki id
		this.name = name;	//public class Product sýnýfýndaki name
		this.unitPrice = unitPrice;		//public class Product sýnýfýndaki unitPrice
		this.detail = detail;	//public class Product sýnýfýndaki detail	
		// imza uygunluðu ile product1 için çalýþan constructor
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
