package leetcode;

import java.util.HashSet;

public class ContainsDuplicate_217 {

	public static void main(String[] args){
		int[] a = {1,2,1};
		System.out.println(containsDuplicate(a));
	}
	
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
        	if(!h.add(nums[i]))
        		return true;
        }
		return false;
    }
	
}
