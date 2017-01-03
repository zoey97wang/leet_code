package leetcode;

import java.util.HashSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class ContainsDuplicate2_219 {

	public static void main(String[] args){
		int[] a = {1,2,1};
		System.out.println(containsNearbyDuplicate(a, 3));
	}
		
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
        	if(!h.add(nums[i])){
        		for(int j=0;j<i;j++){
        			if(nums[j]==nums[i]&&i-j<k)  
        				return true;
        		}
        	}
        }
		return false;
    }
	
}
