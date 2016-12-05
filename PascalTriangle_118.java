package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {

	public static void main(String[] args){
		List<List<Integer>> result2 = new ArrayList<List<Integer>>();
		result2 = generate(3);
		
        for(int i = 0; i < result2.size(); i++) {
        	System.out.print(i+" ");
        	for(int j = 0; j < result2.get(i).size(); j++) {
        		System.out.print(result2.get(i).get(j));
        	}
        	System.out.println(" ");
        }
	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		//List<Integer> row = new ArrayList<>();
		for(int i = 0; i<numRows; i++){
			List<Integer> row = new ArrayList<>();
			//row.add(3);
			//result.add(row);
			for(int j=0;j<i+1;j++){
				if (j==0 || j==i){
                    row.add(1);
                } else {
                	int pre = result.get(i-1).get(j-1);
    				int aft = result.get(i-1).get(j);
    				row.add(pre+aft);
                }
			}
			result.add(row);
		}
		return result;
    }
	
}
