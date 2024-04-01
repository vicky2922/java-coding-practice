package Interviews;

import java.util.Comparator;
import java.util.stream.IntStream;

public class TCSInterview {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 4, 2, 2 };
		int[] distinctNums = IntStream.of(nums)
		.boxed()	//to int to Integer (primitive to wrapper)
		.distinct()
		.mapToInt(e->e).toArray();
	}

}

//@RestController
class mycontroller{
	
	//@GetMapping("/convert/{money}")
	public String convertMoney(/*@PathVariable */String money){
		int moneyInt=0;
		try {
			if(null!=money && !"".equals(money)){
				moneyInt = Integer.parseInt(money);
			} 
		}catch(Exception e) {
			return "Invalid number";
		}
		return moneyInt/70+"";
	}
}
