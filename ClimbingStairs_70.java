package leetcode;

public class ClimbingStairs_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System .out.println(climbStairs(6));
		
	}
	public static int climbStairs(int n) {	
		if(n <= 0) return 0;
	    if(n == 1) return 1;
	    if(n == 2) return 2;
	    
	    int one_step_before = 2;
	    int two_steps_before = 1;
	    int all_ways = 0;
	    
	    for(int i=2; i<n; i++){
	    	all_ways = one_step_before + two_steps_before;
	    	two_steps_before = one_step_before;
	        one_step_before = all_ways;
	    }
	    return all_ways;
	}
}	
	
	
	/*

	public static int climbStairs(int n) {
		//first solution:2 loops; find how many 1, and how many 2 can be n;
        int result = 0;
        for(int i=0; i<=n;i++){
        	for(int j=0;j<=(n-i)/2;j++){
        		if(i+2*j == n){
        			System.out.println(i+" j: "+j);
        			result = (i*j==0)? result+1 : factorial(i+j)/Math.min(i, j);
        		}
        	}
        }
        return result;
    }
	public static int factorial(int n){
		int result = 1;
		int i = 1;
		while(i<=n){
			result = result * i;
			i++;
		}
		return result;
	}
}

	*/