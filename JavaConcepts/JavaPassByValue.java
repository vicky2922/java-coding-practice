package JavaConcepts;

public class JavaPassByValue {
	
	public void changeData(int a) {
		a = 5;
	}

	public static void main(String[] args) {
		int a=10;
		JavaPassByValue j = new JavaPassByValue();
		j.changeData(a);
		System.out.println(a);
	}

}
