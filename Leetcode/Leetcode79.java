package Leetcode;

public class Leetcode79 {

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        Leetcode79 obj = new Leetcode79();
        System.out.println(obj.exist(board, word));
	}
	
	public boolean exist(char[][] board, String word) {
		char[] wordArray = word.toCharArray();
		int rows = board.length;
		int cols = board[0].length;
		int wordLength = word.length();
		boolean[][] visited = new boolean[rows][cols];
		
		for(int i = 0 ; i < rows ; i++) {
			for(int  j = 0 ; j < cols ; j++) {
				if(board[i][j] == wordArray[0] && backtrack(board, wordArray, visited, i, j, 0, rows, cols,wordLength)) {
					return true;
				}
			}
		}
		
        return false;
    }

	public boolean backtrack(char[][] board, char[] wordArray, boolean[][] visited, int row, int col, int k, int rows,
			int cols, int wordLength) {
		if(row<0 || row>=rows 
				|| col<0 || col>=cols 
				|| visited[row][col] 
				|| k>=wordLength 
				|| board[row][col]!=wordArray[k]) {
			return false;
		}
		
		if(k==wordLength-1) {
			return true;
		}
		
		visited[row][col] = true;
		
		if(backtrack(board, wordArray, visited, row-1, col, k+1, rows, cols, wordLength)
				|| backtrack(board, wordArray, visited, row, col-1, k+1, rows, cols, wordLength)
				|| backtrack(board, wordArray, visited, row+1, col, k+1, rows, cols, wordLength)
				|| backtrack(board, wordArray, visited, row, col+1, k+1, rows, cols, wordLength)) {
			return true;
		}
		
		visited[row][col] = false;
		
		return false;
	}

}

/*
Word Search

Medium

Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 
*/