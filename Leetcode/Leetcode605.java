package Leetcode;

public class Leetcode605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		int n =1;
		System.out.println(canPlaceFlowers(flowerbed, n));

	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;
		
		for(int i =0; i<len-1; i++) {
			if(i==0) {
				if(flowerbed[0]==0 && flowerbed[1]==0) {
				flowerbed[0]=1;
				n--;
				}
			} else if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
				flowerbed[i]=1;
				n--;
			}
		}
		if(len==1) {
			if(flowerbed[0]==0) {
				flowerbed[0]=1;
				n--;
			}
		}
		if(len>2 && flowerbed[len-1]==0 && flowerbed[len-2]==0) {
			flowerbed[len-1]=1;
			n--;
		}
		return n<=0;
        
    }

}
