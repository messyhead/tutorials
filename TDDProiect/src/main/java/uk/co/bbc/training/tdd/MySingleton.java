package uk.co.bbc.training.tdd;

public class MySingleton {
	
	private static class Holder {
		static MySingleton single = new MySingleton();
	}
	
	
	private MySingleton() {
		// private constructor
	}
	
	public static MySingleton getInstance() {
		return Holder.single;
	}
	
	

}
