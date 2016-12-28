package leetcode;

public class FactorialTrailingZeroes_172 {
	
	public static void main(String[] args){
		System.out.println(trailingZeroes(30));
	}
	
	public static int trailingZeroes(int n) {
        int result = 0;
        int r1 = n/5;
        while(r1>5){
        	result = result + r1;
        	r1 = r1/5;
        }
        result = result + r1;
        return result;
    }

}
