package JavaConcepts;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		callDemo();
	}

	private static void callDemo() {
		try {
			System.out.println("print before exception");
			int x = 10/0;
			System.out.println("print after exception"+x);
		//	return ;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally print");
		}
		System.out.println("print out of try catch");
	}

}
