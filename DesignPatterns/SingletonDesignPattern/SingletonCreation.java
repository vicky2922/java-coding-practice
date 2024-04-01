package DesignPatterns.SingletonDesignPattern;

public class SingletonCreation {
	private static SingletonCreation singleInstance = new SingletonCreation();
	
	private SingletonCreation() {
	}
	
	public static SingletonCreation getInstance() {
		return singleInstance;
	}
}
