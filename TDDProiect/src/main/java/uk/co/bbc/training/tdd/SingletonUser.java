package uk.co.bbc.training.tdd;

public class SingletonUser {
	
	
	public static void main(String[] args) {
		
		// I know where you live antipattern
		MySingleton single = MySingleton.getInstance();
		
	}

}
