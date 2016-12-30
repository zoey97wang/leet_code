package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,3,1};
		System.out.println(rob(a1));
	}

	public static int rob(int[] nums) {
		if(nums.length==1)
			return nums[0];
		int result = 0;
		int l =nums.length;
		int count = 0;
		ArrayList<Integer> a = new ArrayList<>();
		for(int i =0;i<l;i++){
			a.add(nums[i]);
		}
		Arrays.sort(nums);
		for(int i=l-1;i>l/2-1;i--){
			System.out.println(nums[i]);
			int id = a.indexOf(nums[i]);
			if(a.get(id)!=-1){
				
			if(id==0){
				if(a.get(id+1)!=-1)
				{
					result = result + a.get(id);
					a.set(id, -1);
					count++;
				}
			}
			else if(id==l-1){
				if(a.get(id-1)!=-1){
					result = result + a.get(id);
					a.set(id, -1);
					count++;
				}
			}
			else{
				if(a.get(id-1)!=-1&&a.get(id+1)!=-1)
					{
						result = result + a.get(id);
						a.set(id, -1);
						count++;
					}	
			}
			}
		}
		for(int j=0;count<(l/2)+2&&j<l;j++){
			if(a.get(j)!=-1)
			{
			if(j==0){
				if(a.get(j+1)!=-1)
				{
					result = result + a.get(j);
					a.set(j, -1);
					count++;
				}
			}
			else if(j==l-1){
				if(a.get(j-1)!=-1){
					result = result + a.get(j);
					a.set(j, -1);
					count++;
				}
			}
			else{
				if(a.get(j)!=-1&&a.get(j+1)!=-1)
					{
						result = result + a.get(j);
						a.set(j, -1);
						count++;
					}	
			}
			}
		}
		return result;
    }
	
	public static void sum(int id,int count,int result, ArrayList<Integer> a){
		if(count<(a.size()/2) + 2){
			
		}
	}

}
