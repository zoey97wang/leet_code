package leetcode;

public class BeautifulArrangement_526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    int counter=0;
	    public int countArrangement(int N) {
	        if(N==0) return 0;
	        int[] num = new int[N+1];
	        backTracking(1,num);
	        return counter;
	    }
	    
	    public void backTracking(int position,int[] nums){
	        int l = nums.length;
	        if(position > l-1){
	            counter++;
	            return;
	        }
	        for(int i=1;i<l;i++){
	            if(nums[i]==0&&(i%position==0||position%i==0)){
	                nums[i]=1;
	                backTracking(position+1,nums);
	                nums[i]=0;
	            }
	        }
	    }
	}

}
