package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JloggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}

}
//Adaptasyon başkalarının kodlarını projeyi eklememizi sağlar.
