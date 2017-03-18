package leetcode;

public class JumpGameII_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int jump(int[] nums) {                     //time exceed version;
        int len = nums.length;
        if(len==1)
            return 0;
        int[] jump = new int[len];
        for(int i=0;i<len;i++){
            if(i==0)
                jump[i]=0;
            int move = nums[i];
            for(int m=1;m<=move&&m+i<len;m++){
                int min = Math.min(jump[i]+1,jump[m+i]);
                jump[m+i] = min==0? jump[i]+1:min;
            } 
        }
        return jump[len-1];
    }
	
	public int jump2(int[] nums) {
        int max = 0;
        int jump = 0;
        int complete = 0;
        for(int i=0;i<nums.length-1;i++){
            max = Math.max(max,i+nums[i]);
            if(i==complete){
                jump++;
                complete = max;
            }
        }
        return jump;
    }

}
