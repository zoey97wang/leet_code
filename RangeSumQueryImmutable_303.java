package leetcode;

public class RangeSumQueryImmutable_303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumRange(int i, int j,int[] nums) {
        int result=0;
        for(int x=i;x<=j;x++){
        	result=result+nums[x];
        }
        return result;
    }
	
	public class NumArray {

	    private int[] nums;

	    public NumArray(int[] nums) {
	        for(int i=1;i<nums.length;i++){
	            nums[i]=nums[i-1]+nums[i];
	        }
	        this.nums = nums;
	    }

	    public int sumRange(int i, int j) {
	        if(i==0)
	            return nums[j];
	        return nums[j]-nums[i-1];
	    }
	}
	
}
