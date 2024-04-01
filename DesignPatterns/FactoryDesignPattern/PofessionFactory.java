package DesignPatterns.FactoryDesignPattern;

public class PofessionFactory {
	
	public Profession getInstance(String profession) {
		if(profession.equalsIgnoreCase("doctor")) {
			return new Doctor();
		} else if(profession.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		return null;
	}
}
