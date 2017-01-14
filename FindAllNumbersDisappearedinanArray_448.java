package leetcode;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray_448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        for(int i=1;i<=nums.length;i++)
            result.add(i);
        for(int i=0;i<nums.length;i++)
            result.remove((Integer)nums[i]);
        return result;
    }
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
        	int index = nums[i]-1;
        	if(nums[index]>0)
        		nums[index]*=-1;
        }
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]<0)
        		result.add(nums[i]);
        }
        return result;
    }

}
