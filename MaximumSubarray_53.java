package leetcode;

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int l = nums.length;
        int dp[] = new int[l];
        dp[0]=nums[0];
        for(int i=1;i<l;i++){
            dp[i] = dp[i-1]>0?dp[i-1]+nums[i]:nums[i];
            max = Math.max(dp[i],max);
        }
        return max;
    }

}
