package inheritance2;

public class Main {

	public static void main(String[] args) {
		//birbirinin alternatifi olan kod bloklar� i�in if ile y�netilemez.
		/*LogManager logManager = new LogManager();
		logManager.log(3);*/
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
		
	}

}
