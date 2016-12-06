package leetcode;

import java.util.ArrayList;

public class SingleNumber_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,1};
		System.out.println(singleNumber(a));
	}
	
	public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
        	result^=nums[i];
        }
        return result;
    }

}
