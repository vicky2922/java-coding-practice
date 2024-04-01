package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Leetcode1431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {1,2,3,4};
		int extraCandies = 1;
	//	OptionalInt opMax = Arrays.stream(candies).max();
	//	int max = opMax.getAsInt();
		int max = 0;
	       for(int i = 0 ; i< candies.length; i++){
	           if(max<candies[i]){
	               max =candies[i];
	           }
	       }
		List<Boolean> output = new ArrayList<>();
	/*	Arrays.stream(candies).forEach(e -> {
			if(e+extraCandies>=max) {
				output.add(true);
			} else {
				output.add(false);
			}
		});
		*/
		for(int i = 0 ; i< candies.length; i++){
			if(candies[i]+extraCandies>=max) {
				output.add(true);
			} else {
				output.add(false);
			}
	       }
		
		
		output.stream().forEach(System.out::println);
	}

}
