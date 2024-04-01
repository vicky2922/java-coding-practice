package DesignPatterns.SingletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonCreation s1 = SingletonCreation.getInstance();
		SingletonCreation s2 = SingletonCreation.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
