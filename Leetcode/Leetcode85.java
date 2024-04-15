package Leetcode;

import java.util.Stack;

public class Leetcode85 {

	public static void main(String[] args) {
		char[][] matrix = {{'1','0','1','0','0'},
							{'1','0','1','1','1'},
							{'1','1','1','1','1'},
							{'1','0','0','1','0'}};
		Leetcode85 obj = new Leetcode85();
		System.out.println(obj.maximalRectangle(matrix));
	}

    public int maximalRectangle(char[][] matrix) {
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	int result = maxHistogram(rows, cols, matrix[0]);
    	for(int i=1; i<rows; i++) {
    		for(int j=0 ; j<cols ; j++) {
    			if(matrix[i][j]=='1')
    				matrix[i][j] = (char) (matrix[i-1][j]+1);
    		}
    		result = Math.max(result, maxHistogram(rows, cols, matrix[i]));
    	}
        return result;
    }

	private int maxHistogram(int rows, int cols, char[] row) {
		Stack<Integer> stk = new Stack<>();
		int topEle;
		int maxArea = 0;
		int area = 0;
		int i=0;
		while(i < cols) {
			if(stk.isEmpty() || row[stk.peek()] <= row[i])
				stk.push(i++);
			else {
				topEle = row[stk.peek()]-'0';
				stk.pop();
				area = topEle*i;
				if(!stk.isEmpty())
					area = topEle * (i-stk.peek()-1);
					maxArea = Math.max(area, maxArea);
			}
		}
		while (!stk.empty()) { 
            topEle = row[stk.peek()]-'0'; 
            stk.pop(); 
            area = topEle * i; 
            if (!stk.empty()) 
                area = topEle * (i - stk.peek() - 1); 
  
            maxArea = Math.max(area, maxArea); 
        } 
		return maxArea;
	}
}
