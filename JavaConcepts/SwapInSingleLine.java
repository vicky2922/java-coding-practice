package JavaConcepts;

public class SwapInSingleLine {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
	//	a= a*b/(b=a);
		a=a+b-(b=a);
		System.out.println(a+" "+b);
	}

}
