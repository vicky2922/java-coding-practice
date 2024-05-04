package Leetcode.april24;

public class Leetcode24_1137 {

	public static void main(String[] args) {
		Leetcode24_1137 obj = new Leetcode24_1137();
		System.out.println(obj.tribonacci(37));
	}

	public int tribonacci(int n) {
		int t0 = 0;
		int t1 = 1;
		int t2 = 1;
		int to = 0;
		if (n < 3) {
			if (n == 0) {
				return 0;
			} else {
				return 1;
			}
		} else {
			for (int i = 3; i < n + 1; i++) {
				to = t0 + t1 + t2;
				t0 = t1;
				t1 = t2;
				t2 = to;
			}
		}
		return to;
	}

}
