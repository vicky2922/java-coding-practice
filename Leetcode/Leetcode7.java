package Leetcode;

public class Leetcode7 {

	public int reverse(int x) {
		boolean isNeg = false;
		if(x<0) {
			isNeg=true;
			x = x*(-1);
		}
		long rev=0;
		while(x>0) {
			int n = x%10;
			x = x/10;
			rev = rev*10+n;
		}
		if(isNeg)
			rev = rev*-1;
		if(rev < Math.pow(-2, 31) || rev > Math.pow(2,31)) 
			return 0;
		return (int) rev;
		
		
		
	}

	public static void main(String[] args) {
		Leetcode7 obj = new Leetcode7();
		System.out.println(obj.reverse(1534236469));
	}

}
