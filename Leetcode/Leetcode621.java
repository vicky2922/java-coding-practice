package Leetcode;


public class Leetcode621 {

	public static void main(String[] args) {
		Leetcode621 obj = new Leetcode621();
		char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
		System.out.println(obj.leastInterval(tasks, 2));
	}

	public int leastInterval(char[] tasks, int n) {
		// Array to store frequency of tasks
        int[] freq = new int[26];
        int maxFreq = 0;

        // Calculate frequency of each task and find maximum frequency
        for (char task : tasks) {
            int index = task - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
        }

        // Count the number of tasks with maximum frequency
        int numOfTasksWithMaxFreq = 0;
        for (int frequency : freq) {
            if (frequency == maxFreq) {
                numOfTasksWithMaxFreq++;
            }
        }

        // Calculate the interval needed
        int interval = Math.max((n + 1) * (maxFreq - 1) + numOfTasksWithMaxFreq, tasks.length);
        return interval;
	}

}
