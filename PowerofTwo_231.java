package leetcode;

public class PowerofTwo_231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(32));
	}

	public static boolean isPowerOfTwo(int n) {
        if(n<=0)
        	return false;
        while(n>=2){
        	if(n%2!=0)
        		return false;
        	n=n/2;
        }
		return true;
    }
	
}
