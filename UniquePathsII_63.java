package leetcode;

public class UniquePathsII_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][2];
		System.out.println(a[0].length);
		System.out.println(a[0][0]);
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int flag = 0;
        if(obstacleGrid[0][0]==1)
            return 0;
        for(int c=0;c<col;c++){
            if(flag==0){
               if(obstacleGrid[0][c] == 1){
                   obstacleGrid[0][c] = 0; 
                     ++flag;
               }
                     else
                     obstacleGrid[0][c] = 1; 
            }else
                obstacleGrid[0][c] = 0;
        }
        for(int r=1; r<obstacleGrid.length; r++){
            for(int c=0;c<obstacleGrid[r].length;c++){
                if(obstacleGrid[r][c]==1)
                    obstacleGrid[r][c] = 0;
                else{
                    if(c==0)
                        obstacleGrid[r][c] = obstacleGrid[r-1][c];
                    else
                        obstacleGrid[r][c] = obstacleGrid[r-1][c] + obstacleGrid[r][c-1];
                }
            }
        }
        return obstacleGrid[row-1][col-1];
    }
	
}
