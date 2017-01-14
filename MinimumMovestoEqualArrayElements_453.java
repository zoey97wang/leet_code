package leetcode;

public class MinimumMovestoEqualArrayElements_453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min)
                min = nums[i];
            sum = sum + nums[i];
        }
        return sum-nums.length*min;
    }

}
