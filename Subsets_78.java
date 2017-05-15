package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> result = new LinkedList<List<Integer>>();
	        List<Integer> list = new LinkedList<Integer>();
	        result.add(list);
	        getMore(result, 0, nums, list);
	        return result;
	    }
	    
	    public void getMore(List<List<Integer>> result, int i, int[] nums, List<Integer> list){
	        int len = nums.length;
	        if(i==len)
	            return;
	        for(int j=i;j<len;j++){
	            List<Integer> l = new LinkedList<Integer>();
	            for(Integer in : list)
	                l.add(in);
	            l.add(nums[j]);
	            result.add(l);
	            getMore(result, j+1, nums, l);
	        }
	    }
	}

}


