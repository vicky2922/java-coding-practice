package Leetcode;
import java.util.Arrays;

public class Leetcode135 {

	public static int candy(int[] ratings) {
		int[] candy = new int[ratings.length];
		Arrays.fill(candy, 1);
		int tCandy = 0;
		for(int i=0; i<candy.length-1; i++) {
			if (ratings[i]<ratings[i+1]  && candy[i]>=candy[i+1]) {
				candy[i+1]=candy[i]+1;
			}
		}
		for(int i=candy.length-1; i>0; i--) {
			if (ratings[i]<ratings[i-1]  && candy[i]>=candy[i-1]) {
				candy[i-1]=candy[i]+1;
			}
		}
		for(int i=0; i<candy.length; i++) {
		//	System.out.print(candy[i]+" ");
			tCandy+=candy[i];
		}
        return tCandy;
    }
	public static void main(String[] args) {
		int[] ratings = {1,0,2};//1,2,87,87,87,2,1 -> 1231111,1231321
		System.out.println(candy(ratings));
	}

}
