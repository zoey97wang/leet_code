package leetcode;

public class powerof4_342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPowerOfFour(int num) {
        return ((num-1)&(num))==0&&(num-1)%3==0;
    }

}
