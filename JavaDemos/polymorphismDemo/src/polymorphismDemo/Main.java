package polymorphismDemo;

//polymorphism referans tiplerin aralarında inheritance varsa birbirlerinin referansını tutma durumudur.
public class Main {

	public static void main(String[] args) {

	BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
// Her biri farklı iş yapan ama her biri BaseLogger olan üç elemanlı inheritance

		for (BaseLogger logger : loggers) {
			logger.log("Log mesajı");
		}

		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
