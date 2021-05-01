package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
//BaseLogger parametresi DatabaseLogger'ın referansını tutuyor.
	
	public void add() {
		System.out.println("Musteri eklendi");
		this.logger.log("Log mesajı");
	}
}
