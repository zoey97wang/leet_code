package leetcode;

public class HammingDistance_461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

}
