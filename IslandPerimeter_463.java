package leetcode;

public class IslandPerimeter_463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int islandPerimeter(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1)
                {
                    result=result+4;
                    if(i<grid.length-1&&grid[i+1][j]==1)
                        result = result-2;
                    if(j<grid[i].length-1&&grid[i][j+1]==1)
                        result = result-2;
                }
            }
        }
        return result;
    }

}
