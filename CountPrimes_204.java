package leetcode;

public class CountPrimes_204 {

	public static void main(String[] args){
		boolean[] b = new boolean[1];
		int[] a = new int[1];
		System.out.println(b[0]);
		System.out.println(a[0]);
		System.out.println(countPrimes(8));
		System.out.println(countPrimes2(8));
	}
	
	public static int countPrimes(int n) {
		if(n<=2){
			return 0;
		}
        int count = n-2;
        for(int i=4;i<n;i++){
        	for(int j=2;j<=Math.sqrt(i);j++){
        		if(i%j==0){
        			count--;
        			break;
        		}
        	}
        }
        return count;
    }
	
	public static int countPrimes2(int n){
		boolean[] a = new boolean[n];
		int count = 0;
		for(int i=2; i<=Math.sqrt(n);i++){
			if(a[i]==false){
				for(int j=2;i*j<n;j++){
					a[i*j]=true;
				}
			}
		}
		for(int i=2;i<a.length;i++){
			if(!a[i])
				count++;
		}
		return count;
	}
}
