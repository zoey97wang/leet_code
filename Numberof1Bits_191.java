package leetcode;

public class Numberof1Bits_191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hammingWeight(2147483648)
		
	}
	
	public static int hammingWeight(int n) {
		int result = 0;
        for(int i=0;i<32;i++){
            result += n&1;
            n>>>=1;
        }
        return result;
    }

}
