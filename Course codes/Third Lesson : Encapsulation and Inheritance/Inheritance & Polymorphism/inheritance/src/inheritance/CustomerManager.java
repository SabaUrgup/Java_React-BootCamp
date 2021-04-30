package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		//void add(Customer customer):Geriye bir þey döndürme bireysel müþteri ekle
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert: bulk operasyonu
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
//polymorphisim