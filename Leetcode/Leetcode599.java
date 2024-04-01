package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Leetcode599 {
	
	static public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> stringIndexs = new HashMap<>();
        int i=0;
        for(String s1 : list1) {
        	stringIndexs.put(s1, i);
        	i++;
        }
        i=0;
        int min=Integer.MAX_VALUE;
        Map<String, Integer> stringIndexs2 = new HashMap<>();
        for(String s2 : list2) {
        	if(stringIndexs.containsKey(s2)) {
        		stringIndexs2.put(s2, stringIndexs.get(s2)+i);
        		if(min > stringIndexs2.get(s2)) {
        			min = stringIndexs2.get(s2);
        		}
        	}
        	i++;
        }
        List<String> answer = new ArrayList<String>();
      /*  stringIndexs2.entrySet().stream().forEach(System.out::println);
        System.out.println(min);*/
        for(String s3 : stringIndexs2.keySet()) {
        	if(stringIndexs2.get(s3)==min) {
        		answer.add(s3);
        	}
        }
       // answer.forEach(System.out::println);
        String[] answerS = new String[answer.size()];
        for(int j=0; j<answer.size();j++) {
        	answerS[j]=answer.get(j);
        }
        return answerS;
	}

	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Shogun","Burger King"};
		findRestaurant(list1, list2);

	}

}
