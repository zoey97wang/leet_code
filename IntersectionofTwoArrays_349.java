package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays_349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {1,2,3,5,5,7};
		int[] a2 = {2,3,5,5,9};
		int[] a = intersection(a1,a2);
		for(int i:a)
			System.out.println(i);
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = nums1.length;
        int l2 = nums2.length;
        for(int i=0,j=0;i<l1&&j<l2;){
        	System.out.println("i= "+i+"; j= "+j);
        	if(nums1[i]<nums2[j])
        		i++;
        	else if(nums1[i]>nums2[j])
        		j++;
        	else{
        		h.add(nums1[i]);
        		i++;
        		j++;
        	}
        }
        int[] result = new int[h.size()];  
        int i=0;
        for (Integer val : h) result[i++] = val;
        return result;
    }

}
