package oopIntro;

public class Product {
	
	//encapsulation: kapsülleme tekniði	
	// private yaparak dýþarýdan eriþime kapatýyoruz ve içeriden yöneten (okuma ve eþitleme veren) getter ve setter metotlar yazýyoruz. 
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product() {  //contructor bloðu: Bir nesnenin referansýný bellekte oluþturduðumuz zaman çalýþan blok.

	}
	
	public Product(int id, String name, double unitPrice, 
			String detail, double discount) {
		this(); 
		this.id = id; 	//public class Product sýnýfýndaki id
		this.name = name;	//public class Product sýnýfýndaki name
		this.unitPrice = unitPrice;		//public class Product sýnýfýndaki unitPrice
		this.detail = detail;	//public class Product sýnýfýndaki detail
		this.discount = discount;
		// imza uygunluðu ile product1 için çalýþan constructor
	}

	/* getter setter metot denilen iþ yapan nesnelerdir.
	 * getter: okuma yapar ve geri dönüþ deðeri (return döndürür) verir.
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
		return this.unitPrice-(this.unitPrice * this.discount / 100); //getUnitPriceAfterDiscount deðerini hesaplattýrýp döndürdük.
	}

}
