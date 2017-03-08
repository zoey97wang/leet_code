package leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryWatch_401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> readBinaryWatch(int num) {
        List<String> result = new LinkedList<String>();
        int[] hours = {8,4,2,1};
        int[] minutes = {32,16,8,4,2,1};
        for(int i=0;i<=num;i++){
            List<Integer> pre = getTime(hours, i);
            List<Integer> post = getTime(minutes, num-i);
            for(int h:pre){
                if(h>=12) continue;
                for(int m:post){
                    if(m>=60) continue;
                    result.add(h+":"+(m<10?"0"+m:m));
                }
            }
        }
        return result;
    }
    
    public List<Integer> getTime(int[] nums, int counter){
        List<Integer> result = new LinkedList<Integer>();
        getTimeHelper(nums,counter,0,0,result);
        return result;
    }
    
    public void getTimeHelper(int[]nums,int counter,int position,int sum,List<Integer> result){
        if(counter==0){
            result.add(sum);
            return;
        }
        for(int i=position;i<nums.length;i++){
            getTimeHelper(nums,counter-1,i+1,sum+nums[i],result);
        }
    }

}
