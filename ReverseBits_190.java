package leetcode;

public class ReverseBits_190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Integer.MAX_VALUE);
		int bitmask = 1;
		bitmask<<=31;
        System.out.println(bitmask);
        
	}
	
	public int solution(int n){
		int result = 0;
		for(int i=0;i<32;i++){
			result<<=1;
			result = n&1;
			n>>>=1;
		}
		return result;
	}

}
