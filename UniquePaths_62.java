package leetcode;

public class UniquePaths_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePaths(int m, int n) {
        if(m==0||n==0)
            return 0;
        int[][] path = new int[m][n];
        for(int i=0;i<n;i++){
            path[0][i] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0)
                    path[i][j] = path[i-1][j];
                else
                    path[i][j] = path[i][j-1] + path[i-1][j];
            }
        }
        return path[m-1][n-1];
    }                 

}
