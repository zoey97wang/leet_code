package leetcode;

public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int max = 0;
            while(i<nums.length&&nums[i]==1){
                max++;
                i++;
            }
            result = Math.max(result, max);
        }
        return result;
    }
	
}
