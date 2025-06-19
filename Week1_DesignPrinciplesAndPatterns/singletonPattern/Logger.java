package singletonPattern;

public class Logger {	
	private static Logger instance;
	
	Logger(){
		System.out.println("In Logger Constructor");
	}
	
	public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }	
	 public void log(String message) {
	        System.out.println("[LOG]: " + message);
	 }
}
