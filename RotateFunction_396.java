package leetcode;

public class RotateFunction_396 {

	public static void main(String[] args){
		int[] a = {-2147483648,-2147483648};
		System.out.println(maxRotateFunction(a));
		int a2 = -2147483648;
		int sum = a2+a2;
		System.out.println(a2);
	}
	
	public static int maxRotateFunction(int[] A) {
		if(A.length<=1)
	        return 0;
		int sum = 0;
        int total = 0;
        int l = A.length;
        for(int i=0;i<l;i++){
        	sum = sum + i*A[i];
        	total = total+A[i];
        }
        int result = sum;
        System.out.println("sum: "+sum);
        System.out.println("total: "+total);
        for(int i=1;i<=l;i++){
        	int sum2 = sum+total-l*A[l-i];
        	System.out.println("i is "+i+" sum2 is"+sum2);
        	result = Math.max(result, sum2);
        	System.out.println("result is "+result);
        	sum = sum2;
        }
        return result;
    }
	
}
