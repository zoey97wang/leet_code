package leetcode;

public class PerfectNumber_507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public boolean checkPerfectNumber(int num) {
	        if(num<2)
	            return false;
	        int sum = 1;
	        int i = 2;
	        while(i < Math.sqrt(num)){
	            if(num%i==0){
	                sum = sum + i + num/i;
	            }
	            i++;
	        }
	        if(num==sum)
	            return true;
	        else
	            return false;
	    }
	}

}
