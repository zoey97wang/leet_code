package leetcode;

public class NextGreaterElementI_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public int[] nextGreaterElement(int[] findNums, int[] nums) {
	        int l = findNums.length;
	        int[] result = new int[l];
	        for(int i=0;i<l;i++){
	            int flag = 0;
	            for(int j=0;j<nums.length;j++){
	                if(nums[j]==findNums[i])
	                    flag = 1;
	                else if(nums[j]>findNums[i]&&flag==1){
	                    result[i] = nums[j];
	                    break;
	                }
	            }
	            if(result[i]==0)
	                result[i] = -1;
	        }
	        return result;
	    }
	}
}
