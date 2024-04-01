package Interviews;
import java.util.HashSet;
import java.util.Set;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 160;
		Set<Integer> primes = new HashSet<>();
		if(num<=0) {
			System.out.println("Given number is less or equal zero");
		} else {
			primes.add(1);
			primes.add(num);
			int num2=num;
			for(int x=2;x<num2;x++) {
				while(num%x==0) {
					num=num/x;
					primes.add(x);
				}
			}
			primes.stream().forEach(System.out::println);
		}
		

	}

}
