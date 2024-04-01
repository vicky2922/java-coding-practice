package DesignPatterns.ProxyDesignPattern;

public class Proxy extends RealImpl{

	@Override
	public void display() {
		System.out.println("I am from PROXY class and validate first");
		super.display();
	}
	
}
