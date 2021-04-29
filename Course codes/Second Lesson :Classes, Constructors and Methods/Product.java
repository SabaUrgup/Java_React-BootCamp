package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	public Product() {  //contructor bloğu: Bir nesnenin referansını bellekte oluşturduğumuz zaman çalışan blok.
		System.out.println("Ben çalıştımm");
		// imza ile product2 ve product3 için çalışan constructorlar
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();  //constructorlarla birbirini çalıştırdık ve product1 için de 'Ben çalıştım' ifadesini ekrana yazdırdık.
		this.id = id; 	//public class Product sınıfındaki id
		this.name = name;	//public class Product sınıfındaki name
		this.unitPrice = unitPrice;		//public class Product sınıfındaki unitPrice
		this.detail = detail;	//public class Product sınıfındaki detail	
		// imza uygunluğu ile product1 için çalışan constructor
	}
	
}
