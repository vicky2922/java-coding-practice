package Leetcode;

public class Leetcode2485 {
	
	static public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int pivot = (int) Math.sqrt(sum);
        return pivot*pivot==sum?pivot:-1;
    }

	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
	}

}
