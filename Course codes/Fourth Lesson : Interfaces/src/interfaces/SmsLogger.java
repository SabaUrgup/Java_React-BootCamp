package interfaces;

//Logger'i SmsLogger'a uyarla demek.
public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms gonderildi : " + message);
		
	}

}
