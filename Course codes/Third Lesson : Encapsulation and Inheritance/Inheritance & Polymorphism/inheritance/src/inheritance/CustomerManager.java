package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		//void add(Customer customer):Geriye bir �ey d�nd�rme bireysel m��teri ekle
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