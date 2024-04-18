package Leetcode;

public class Leetcode463 {

	public static void main(String[] args) {
		Leetcode463 obj = new Leetcode463();
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(obj.islandPerimeter(grid));
	}
	
    public int islandPerimeter(int[][] grid) {
    	int peri = 0;
    	int m = grid.length;
    	int n = grid[0].length;
    	for(int i = 0 ; i < m ; i++) {
    		for(int j = 0 ; j < n ; j++) {
    			if(grid[i][j] == 1) {
    				peri += calculatePeri(grid, i, j);
    			}
    		}
    	}
        return peri;
    }

	private int calculatePeri(int[][] grid, int row, int col) {
		int[] x = {-1,0,0,1};
		int[] y = {0,-1,1,0};
		int ans=0;
		for(int i=0; i<4; i++) {
			int nR = row+x[i];
			int nC = col+y[i];
			if(isValid(nR, nC, grid)) {
				if(grid[nR][nC] == 0) {
					ans++;
				}
			} else {
				ans++;
			}
		}
		return ans;
	}

	private boolean isValid(int i, int j, int[][] grid) {
		if(i>=0 && j>=0 && i<grid.length && j<grid[0].length)
			return true;
		return false;
	}

}
