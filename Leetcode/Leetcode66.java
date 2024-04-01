package Leetcode;
import java.util.Arrays;

public class Leetcode66 {
	public static int[] plusOne(int[] digits) {
        int[] output = new int[digits.length+1];
        output[0]=0;
        for(int i = 1; i<output.length;i++ ){
            output[i]=digits[i-1];
        }
        for(int i = output.length-1; i>-1;i-- ){
            if(output[i]==9){
                output[i]=0;
            } else{
                output[i]++;
                break;
            }
        }
        if(output[0]!=0){
            return output;
        } 
        return Arrays.copyOfRange(output, 1, output.length);
    }

	public static void main(String[] args) {
		int[] digits = {9,9,9,9};
		int[] output = plusOne(digits);
		Arrays.stream(output).forEach(System.out::println);
	}

}
