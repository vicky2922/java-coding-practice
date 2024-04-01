package Leetcode;

public class Leetcode121 {
	 public static int maxProfit(int[] prices) {
		 int maxProfit = 0;
		 int[] diff = new int[prices.length-1];
		 for(int i = 0 ; i < prices.length-1; i++) {
			 diff[i] = prices[i+1]-prices[i];
		 }
		 int maxP=0;
		 //Maximum contigous sum
		 for(int i = 0 ; i < diff.length; i++) {
			 maxP=maxP+diff[i];
			 if(maxProfit<maxP) {
				 maxProfit=maxP;
			 }
			 if(maxP<0) {
				 maxP=0;
			 }
		 }
		 return maxProfit;
	}
	public static void main(String[] args) {
		int[] sharePrice = {7,1,5,3,6,4};
		System.out.println(Leetcode121.maxProfit(sharePrice));
	}

}
 