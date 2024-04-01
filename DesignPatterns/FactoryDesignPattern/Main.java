package DesignPatterns.FactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		PofessionFactory pf = new PofessionFactory();
		Profession p = pf.getInstance("teacher");
		p.display();
		p=pf.getInstance("doctor");
		p.display();
	}

}
