package JavaConcepts;
class Parent {
	int x =100;
	static void staticRun() {
		System.out.println("I am from Parent class static");
	}
	void run() {
		System.out.println("I am from Parent class");
	}
}

class Child extends Parent {
	int x =200;
	public static void staticRun() {
		System.out.println("I am from Child class static");
	}
	public void run() {
		System.out.println("I am from Child class");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Parent x = new Child();
		x.run();//method overriding
		x.staticRun();//method hiding
		System.out.println(x.x);
		
		System.out.println("***");
		
		Child c1 = new Child();
		c1.run();
		System.out.println(c1.x);
		Parent p1 = c1;	//UPCASTING
		p1.run();
		System.out.println(p1.x);
		
		System.out.println("***");
		
		Parent p2 = new Child();
		p2.run();
		System.out.println(p2.x);
		Child c2 = (Child)p2;//DOWNCASTING
		c2.run();
		System.out.println(c2.x);
	}

}
