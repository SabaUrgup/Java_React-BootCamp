package classesWithAttributes;

public class Product {
	
	//Aynı isimlerle ama farklı parametrelerle metotları kullanmaya overloading methods denir.
	public Product(int id, String name, String description, int stockAmount, double price, String renk) { //constructor: yapıcı blok, yapıcı metot gibi düşünülebilir.
		System.out.println("Yapıcı blok çalıştı.");
		this._id = id;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
		this._renk = renk;
	}
	
	public Product() {
		
	}

	// Bu değerlere attributes veya (|) fields denilebilir.
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	//getter
	public int getId() {
		return _id;
	}

	//setter
	public void setId(int id) {
		this._id = id; // _id = id; ifadesi ile aynıdır.
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	public String get_kod() {
		return this._name.substring(0, 1) + _id;
	}

}

/*
 * public --> Her yerden erişilebilir, halka açık. 
 * private --> Sadece tanımlandığı blokta geçerlidir.
 */

/*
 * getter --> metodu ile okuma yapılabilir. 
 * setter --> metodu ile yazma yapılabilir.
 */

//this içerisinde bulunan sınıf demektir.

/*
 * Her bir sınıfın kendine ait boş bir constructor'ı vardır. 
 * Her constructor sınıfının ismi ile aynı olmak zorundadır.
 */