package Leetcode.april24;

import java.util.ArrayList;
import java.util.List;

public class April21_1971 {

	public static void main(String[] args) {
		int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int n = 6;
        int source = 0;
        int destination = 5;
        April21_1971 obj = new April21_1971();
        System.out.println(obj.validPath(n, edges, source, destination));
	}
	
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    	List<List<Integer>> adjList = new ArrayList<>();
    	for(int i=0; i<n; i++)
    		adjList.add(new ArrayList<Integer>());
    	for(int[] arr : edges) {
    		adjList.get(arr[0]).add(arr[1]);
    		adjList.get(arr[1]).add(arr[0]);
    	}
    	boolean[] visited =new boolean[n];
    	dfs(source, visited, adjList);
        return visited[destination];
    }

	private void dfs(int source, boolean[] visited, List<List<Integer>> adjList) {
		visited[source] = true;
		List<Integer> list= adjList.get(source);
		for(Integer i : list) {
			if(!visited[i])
				dfs(i, visited, adjList);
		}
	}

}
