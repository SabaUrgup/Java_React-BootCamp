package oopIntro;

public class Product {
	
	public Product() {  //contructor blo�u
		System.out.println("Ben �al��t�m");
		// �mza ile product2 ve product3 i�in �al��an constructorlar
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();  //constructorlarla birbirini �al��t�rd�k ve product1 i�in de 'Ben �al��t�m' ifadesini ekrana yazd�rd�k.
		this.id = id; 	//public class Product s�n�f�ndaki id
		this.name = name;	//public class Product s�n�f�ndaki name
		this.unitPrice = unitPrice;		//public class Product s�n�f�ndaki unitPrice
		this.detail = detail;	//public class Product s�n�f�ndaki detail	
		// imza uygunlu�u ile product1 i�in �al��an constructor
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
