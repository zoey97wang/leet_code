package leetcode;

public class MajorityElement_169 {

	public static void main(String[] args){
		int[] a = {1,2,1,2,3,1};
		System.out.println(majorityElement(a));
	}
	
	public static int majorityElement(int[] nums) {
		
        int result = nums[0],count = 1;
        	for(int j=1;j<nums.length;j++){
        		if(count == 0){
        			result = nums[j];
        			count++;
        		}else if(result == nums[j])
        			count++;
        		else
        			count--;
        	}
        
        return result;
    }
	
}
