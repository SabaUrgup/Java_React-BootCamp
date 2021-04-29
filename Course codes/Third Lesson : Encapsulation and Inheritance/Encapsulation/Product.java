package oopIntro;

public class Product {
	
	//encapsulation: kaps�lleme tekni�i	
	// private yaparak d��ar�dan eri�ime kapat�yoruz ve i�eriden y�neten (okuma ve e�itleme veren) getter ve setter metotlar yaz�yoruz. 
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product() {  //contructor blo�u: Bir nesnenin referans�n� bellekte olu�turdu�umuz zaman �al��an blok.

	}
	
	public Product(int id, String name, double unitPrice, 
			String detail, double discount) {
		this(); 
		this.id = id; 	//public class Product s�n�f�ndaki id
		this.name = name;	//public class Product s�n�f�ndaki name
		this.unitPrice = unitPrice;		//public class Product s�n�f�ndaki unitPrice
		this.detail = detail;	//public class Product s�n�f�ndaki detail
		this.discount = discount;
		// imza uygunlu�u ile product1 i�in �al��an constructor
	}

	/* getter setter metot denilen i� yapan nesnelerdir.
	 * getter: okuma yapar ve geri d�n�� de�eri (return d�nd�r�r) verir.
	 * setter: yazma yapar
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100); //getUnitPriceAfterDiscount de�erini hesaplatt�r�p d�nd�rd�k.
	}

}
