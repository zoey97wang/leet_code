package leetcode;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangleII_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new LinkedList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    row.add(1);
                else
                {
                    int pre = result.get(i-1).get(j-1);
                    int post = result.get(i-1).get(j);
                    row.add(pre+post);
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
	
	public List<Integer> getRow2(int rowIndext){
		List<Integer> result = new LinkedList<Integer>();
		for(int i=0; i<=rowIndext; i++){
			result.add(0,1);
			for(int j=1; j<result.size()-1; j++){
				result.set(j, result.get(j)+result.get(j)+1);
			}
		}
		return result;
	}
	
	
	
}
