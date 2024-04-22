package Leetcode.april24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class April20_1992 {

	public static void main(String[] args) {
		April20_1992 obj = new April20_1992();
        int[][] land = {
                {1,0,0},
                {0,1,1},
                {0,1,1}};
        System.out.println(Arrays.deepToString(obj.findFarmland(land)));
	}
	//expected 'position of rightmost cell in row' to have value from 2 to 2 only
	
    public int[][] findFarmland(int[][] land) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    int[] landCoordinates = findLandBoundary(land, i, j);
                    ans.add(landCoordinates);
                }
            }
        }
        return ans.toArray(new int[0][]);
    }

	private int[] findLandBoundary(int[][] land, int startX, int startY) {
		int endX = startX;
		int endY = startY;
		//check for each row from startX
		while(endX<land.length && land[endX][startY] == 1) {
			endY=startY;
			//check for each column from startY
			while(endY<land[0].length && land[endX][endY]==1) {
				land[endX][endY]=0;
				endY++;
			}
			endX++;
		}
		return new int[] {startX, startY, endX-1, endY-1};
	}

}
