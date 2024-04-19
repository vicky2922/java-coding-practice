package Leetcode.april24;

public class April19_200 {

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		April19_200 obj = new April19_200();
		System.out.println(obj.numIslands(grid));
	}
	
    public int numIslands(char[][] grid) {
    	int islands = 0;
    	int m = grid.length;
    	int n = grid[0].length;
    	boolean[][] visited = new boolean[m][n];
    	for(int i = 0 ; i < m ; i++) {
    		for(int j = 0 ; j < n ; j++) {
    			if(grid[i][j] == '1' && !visited[i][j]) {
    				dfs(grid, i, j, visited);
    				islands++;
    			}
    		}
    	}
        return islands;
    }

	private void dfs(char[][] grid, int row, int col, boolean[][] visited) {
		int[] x = {-1,0,0,1};
		int[] y = {0,-1,1,0};
		visited[row][col] = true;
		for(int i=0; i<4; i++) {
			int nR = row+x[i];
			int nC = col+y[i];
			if(isValid(nR, nC, grid)) {
				if(grid[nR][nC] == '1' && !visited[nR][nC]) {
					dfs(grid, nR, nC, visited);
				}
			} 
		}
	}
	
	private boolean isValid(int i, int j, char[][] grid) {
		if(i>=0 && j>=0 && i<grid.length && j<grid[0].length)
			return true;
		return false;
	}
	
	/*
	 public int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
    */

}
