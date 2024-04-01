package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Leetcode1481node{
	int val;
	long freq;
	Leetcode1481node(int val, long freq){
		this.val=val;
		this.freq=freq;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public long getFreq() {
		return freq;
	}
	public void setFreq(long freq) {
		this.freq = freq;
	}
	
}

public class Leetcode1481 {

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		Map<Integer, Long> freqMap = 
					Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Leetcode1481node> freqList = new ArrayList<>();
		for(Integer x : freqMap.keySet()) {
			freqList.add(new Leetcode1481node(x,freqMap.get(x)));
		}
		freqList = freqList.stream().sorted(Comparator.comparing(Leetcode1481node::getFreq)).collect(Collectors.toList());
		for(Leetcode1481node n : freqList) {
			if(k==0) {
				break;
			}
			if(k>n.getFreq()) {
				k=(int) (k-n.getFreq());
				n.setFreq(0);
			} else {
				n.setFreq(n.getFreq()-k);
				k=0;
			}
		}
		int cnt=0;
		for(Leetcode1481node n : freqList) {
			if(n.getFreq()>0) {
				cnt++;
			}
		}
        return cnt;
    }

	public static void main(String[] args) {
		int[] arr = {4,3,1,1,3,3,2};
		System.out.println(findLeastNumOfUniqueInts(arr, 3));
	}

}
