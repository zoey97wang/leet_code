package leetcode;

public class ArrangingCoins_441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(4));
	}
	
	public static int arrangeCoins(int n) {
        int last = n;
        System.out.println("last "+last);
        for(int i=1;i<=last;i++){
        	System.out.println("n is "+n+" i is"+i);
        	if(n==i)
        		return i;
        	if(n<i)
        		return i-1;
            n=n-i;
           
        }
        return 0;
    }

}
