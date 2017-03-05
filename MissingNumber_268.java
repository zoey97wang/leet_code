package leetcode;

public class MissingNumber_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
	    for (i = 0; i < nums.length; i++) {
	    	xor = xor ^ i ^ nums[i];
    	}
	    return xor ^ i;
    }
	
	public int missingNumber2(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i];
        return sum;
    }

}
