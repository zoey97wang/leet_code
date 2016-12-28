package leetcode;

public class RotateArray_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,2,3,4,5};
		rotate(nums,0);  // 1 ; 312
		for(int i=0; i<nums.length;i++)
		System.out.println(nums[i]);
	}
	
	public static void rotate(int[] nums, int k) {
		k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	/*	int l = nums.length;
		int count = 0;
		int temp = 0;
        while(k>l){
        	k=k%l;
        }
        for(int i=l-k;i<l;i++){
        	for(int j=i;j>count;j--){
        		temp = nums[j-1];
        		nums[j-1] = nums[j];
        		nums[j] = temp;
        	}
        	count++;
        }
        */
    }

	private static void reverse(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		 while (start < end) {
		        int temp = nums[start];
		        nums[start] = nums[end];
		        nums[end] = temp;
		        start++;
		        end--;
		    }
	}

}
