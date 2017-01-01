package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {9,3,4,12,9};
		System.out.println(rob(a1));
	}
	
	//dp[0][0]=0;[0][1]=0;
	//dp[1][0]=0;[1][1]=9;[2][0]=9;[2][1]=3;[3][0]=9;[3][1]=13;[4][0]=13;[4][1]=21

	public static int rob(int[] nums) {
		int result1=0;
		int result2=0;
		int temp;
		int l = nums.length;
 
		for(int i =1;i<=l;i++){
			temp = result1;
			result1 = Math.max(result1, result2);
			result2 = temp+nums[i-1];
		}
		return Math.max(result1, result2);

    }
	
	public static void sum(int id,int count,int result, ArrayList<Integer> a){
		if(count<(a.size()/2) + 2){
			
		}
	}

}
