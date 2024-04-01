package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Leetcode451CharFreq{
	private String ch;
	private long freq;
	public Leetcode451CharFreq() {
		// TODO Auto-generated constructor stub
	}
	public Leetcode451CharFreq(String ch, long freq) {
		this.ch = ch;
		this.freq =freq;
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}
	public long getFreq() {
		return freq;
	}
	public void setFreq(long freq) {
		this.freq = freq;
	}
}

public class Leetcode451 {
	public static String frequencySort(String s) {
		Map<String, Long> freqMap = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Leetcode451CharFreq> list = new ArrayList<>();
		for(String str:freqMap.keySet()) {
			list.add(new Leetcode451CharFreq(str, freqMap.get(str)));
		}
		list = list.parallelStream().sorted(Comparator.comparing(Leetcode451CharFreq::getFreq).reversed()).collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();
		for(Leetcode451CharFreq obj:list) {
			while(obj.getFreq()!=0) {
				sb.append(obj.getCh());
				obj.setFreq(obj.getFreq()-1);
			}
		}
		return sb.toString();
	/*
		char[] str=s.toCharArray();
        int[] freq=new int[128];
        // for(char ch:s) freq[ch]++;
        for(int i=0;i<str.length;i++) freq[str[i]]++;
        for(int i=0;i<str.length;){
            char cmax=',';
            for(int j=0;j<128;j++){
                if(freq[j]>freq[cmax]) cmax=(char)j;
            }
            while(freq[cmax]!=0){
                str[i++]=cmax;
                freq[cmax]--;
            }
        }
        return new String(str);
        */
    }
	public static void main(String[] args) {
		String s = "aabbbcccc";
		System.out.println(frequencySort(s));
	}

}
