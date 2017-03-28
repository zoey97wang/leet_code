package leetcode;

import java.util.LinkedList;
import java.util.List;

public class RelativeRanks_506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++){
			String s = i+"";
			System.out.println(s);	
		}
		
	}
	
	public class Solution {
	    private int[] numbers;
	    public String[] findRelativeRanks(int[] nums) {
	        int len = nums.length;
	        this.numbers = new int[len];
	        for(int a=0;a<len;a++){
	            numbers[a] = nums[a];
	        }
	        quicksort(0, len-1);
	        List<Integer> l = new LinkedList();
	        String[] result = new String[len];
	        for(int i:numbers){
	            l.add(i);
	        }
	        for(int j=0;j<len;j++){
	            if(l.indexOf(nums[j])==0){
	                result[j] = "Gold Medal";
	            }else if(l.indexOf(nums[j])==1){
	                result[j] = "Silver Medal";
	            }else if(l.indexOf(nums[j])==2){
	                result[j] = "Bronze Medal";
	            }else{
	                result[j] = l.indexOf(nums[j])+1+"";
	            }
	        }
	        return result;
	    }
	        private void quicksort(int low, int high) {
	                int i = low, j = high;
	                int pivot = numbers[low + (high-low)/2];
	                while (i <= j) {
	                        while (numbers[i] > pivot) {
	                                i++;
	                        }
	                        while (numbers[j] < pivot) {
	                                j--;
	                        }
	                        if (i <= j) {
	                                exchange(i, j);
	                                i++;
	                                j--;
	                        }
	                }
	                if (low < j)
	                        quicksort(low, j);
	                if (i < high)
	                        quicksort(i, high);
	        }

	        private void exchange(int i, int j) {
	                int temp = numbers[i];
	                numbers[i] = numbers[j];
	                numbers[j] = temp;
	        }
	    }

}
