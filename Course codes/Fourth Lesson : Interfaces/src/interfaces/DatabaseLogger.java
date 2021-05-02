package interfaces;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Database loglandi : " + message);
		
	}

}
//Java implement edilen metodu da override kabul ediyor.