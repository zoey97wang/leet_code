package leetcode;

public class TotalHammingDistance_477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public int totalHammingDistance(int[] nums) {
	        int l = nums.length;
	        int result = 0;
	        for(int i=0;i<32;i++){
	            int oneCount = 0;
	            for(int j=0;j<l;j++)
	                oneCount += (nums[j]>>i)&1;
	            result = result + oneCount*(l-oneCount);
	        }
	        return result;
	    }
	}

}
