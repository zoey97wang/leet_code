package leetcode;

public class JumpGame_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean canJump(int[] nums) {
	        int l = nums.length;
	        if(l==0)
	            return false;
	        int position = l-1;
	        for(int i=l-2; i>=0;i--){
	            if(nums[i]>=position-i)
	                position = i;
	        }
	        return position==0?true:false;
	    }

}
