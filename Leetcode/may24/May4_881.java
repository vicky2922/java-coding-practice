package Leetcode.may24;

import java.util.Arrays;

public class May4_881 {

	public static void main(String[] args) {
		May4_881 obj = new May4_881();
		int[] weight = {3,2,2,1};
		int limit = 3;
		System.out.println(obj.numRescueBoats(weight, limit));
	}
	
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        int boats = 0;
        while(l<=r) {
        	if(people[l]+people[r]<=limit) {
        		boats++;
        		l++;
        		r--;
        	} else {
        		boats++;
        		r--;
        	}
        }
        return boats;
    }

}
//MEDIUM