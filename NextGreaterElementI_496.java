package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public int[] nextGreaterElement(int[] findNums, int[] nums) {
	        int l = findNums.length;
	        int[] result = new int[l];
	        for(int i=0;i<l;i++){
	            int flag = 0;
	            for(int j=0;j<nums.length;j++){
	                if(nums[j]==findNums[i])
	                    flag = 1;
	                else if(nums[j]>findNums[i]&&flag==1){
	                    result[i] = nums[j];
	                    break;
	                }
	            }
	            if(result[i]==0)
	                result[i] = -1;
	        }
	        return result;
	    }
	}
	
	public class Solution2{
	    public int[] nextGreaterElement(int[] findNums, int[] nums) {
	        Map<Integer,Integer> helper = new HashMap();
	        Stack<Integer> s = new Stack<>();
	        int l = findNums.length;
	        int[] result = new int[l];
	        for(Integer num:nums){
	            while(!s.empty()&&s.peek() < num)
	                helper.put(s.pop(),num);
	            s.push(num);
	        }
	        for(int j=0;j<l;j++)
	            result[j] = helper.getOrDefault(findNums[j],-1);
	        return result;
	    }
	}
}
