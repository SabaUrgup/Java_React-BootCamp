package interfaces;

public class CustomerManager {
	
	//Loosly ve tightly coupled

	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		//referans atamasi vardir.
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Musteri silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}
	
}
//interfaces referans tutucudur.