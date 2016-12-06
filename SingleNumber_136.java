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
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
        	if(!a1.contains(nums[i]))
        		a1.add(nums[i]);
        	else
        	{
        		int index = a1.indexOf(nums[i]);
        		a1.remove(index);
        	}
        }
        result = a1.get(0);
        return result;
    }

}
