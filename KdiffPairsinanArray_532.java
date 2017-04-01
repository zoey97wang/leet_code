package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class KdiffPairsinanArray_532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findPairs(int[] nums, int k) {
        if(k<0)
            return 0;
        HashSet<Integer> h = new HashSet<>();
        Arrays.sort(nums);
        int l = nums.length;
        int i=0;
        int j=1;
        while(i<l&&j<l){
            int t = nums[j]-nums[i];
            if(t<k){
                j++;
            }else if(t==k){
                h.add(nums[i]+ nums[j]);
                i++;
                j++;
            }
            else
                i++;
            if(i==j)
                j++;
        }
        return h.size();
    }
	
	public class Solution {
	    public int findPairs(int[] nums, int k) {
	        if(k<0)
	            return 0;
	        HashSet<Integer> h = new HashSet<>();
	        int l = nums.length;
	        for(int i =0;i<l;i++){
	            for(int j=i+1;j<l;j++){
	                if(nums[i]-nums[j]==k||nums[i]-nums[j]==-k)
	                    h.add(nums[i]+ nums[j]);
	            }
	        }
	        return h.size();
	    }
	    
	    public int findPairs2(int[] nums, int k) {
	        if(k<0)
	            return 0;
	        HashSet<Integer> h = new HashSet<>();
	        Arrays.sort(nums);
	        int l = nums.length;
	        for(int i =0;i<l;i++){
	            for(int j=i+1;j<l;j++){
	                if(nums[i]-nums[j]==k||nums[i]-nums[j]==-k)
	                  { h.add(nums[i]+ nums[j]);
	                      break;
	                  }
	            }
	        }
	        return h.size();
	    }
	}

}
