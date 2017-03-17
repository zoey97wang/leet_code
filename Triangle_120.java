package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Triangle_120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<LinkedList<Integer>> result = new LinkedList<LinkedList<Integer>>();
		LinkedList<Integer> r1 = new LinkedList<Integer>();
		LinkedList<Integer> r2 = new LinkedList<Integer>();
		r1.add(1);
		r1.add(2);
		r2.add(3);
		r2.add(4);
		r2.add(5);
		result.add(r1);
		result.add(r2);
		System.out.println(result.get(0).get(0));
		
		//result.set(0, )
	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        int[][] sum = new int[l][l];
        int left,right;
        sum[0][0] = triangle.get(0).get(0);
        for(int i=1;i<l;i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    left = Integer.MAX_VALUE;
                else
                    left = sum[i-1][j-1];
                if(j==i)
                    right = Integer.MAX_VALUE;
                else
                    right = sum[i-1][j];
                int min = Math.min(left,right);
                sum[i][j] = min + triangle.get(i).get(j);
            }
        }
        int result = sum[l-1][0];
        for(int r=1;r<l;r++){
            if(sum[l-1][r]<result)
                result = sum[l-1][r];
        }
        
        return result;
    }

}
