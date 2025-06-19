package singletonPattern;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger l1= Logger.getInstance();
		l1.log("Login success");
		
		Logger l2= Logger.getInstance();
		l2.log("Performed some action");
		
		if(l1==l2) {
			System.out.println("Same Logger instance used everywhere.");
        } else {
            System.out.println("Different instances (Not Singleton).");
        }
	}
}
