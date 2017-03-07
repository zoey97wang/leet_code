package leetcode;

public class SumofTwoIntegers_371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getSum(int a, int b) {
        return b==0? a:getSum(a^b, (a&b)<<1);
    }

}
