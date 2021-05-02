package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(),  new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin ", "Demirog");
		customerManager.add(engin);

	}

}
//Dıs class static verilemez ic classlar static verilebilir.
