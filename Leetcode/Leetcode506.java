package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode506 {
	static public String[] findRelativeRanks(int[] score) {
		int len = score.length;
        String[] positions = new String[len];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> score[b]-score[a]);
        for(int i = 0 ; i<len; i++) {
        	pq.offer(i);
        }
        int pos=1;
        while(!pq.isEmpty()) {
        	int index = pq.poll();
        	if(pos==1) {
        		positions[index]="Gold Medal";
        	} else if(pos==2) {
        		positions[index]="Silver Medal";
        	} else if(pos==3) {
        		positions[index]="Bronze Medal";
        	} else {
        		positions[index]=String.valueOf(pos);
        	}
        	pos++;
        }
        return positions;
    }
	
	public static void main(String[] args) {
		int[] score = {10,3,8,9,4};
		Arrays.stream((findRelativeRanks(score))).forEach(System.out::println);
	}

}
