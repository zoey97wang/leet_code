package leetcode;

public class NthDigit_400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findNthDigit(int n) {
        int length = 1;
        long count = 9;
        int start = 1;
        while(n>length*count){
            n -= length*count;
            length++;
            count = count * 10;
            start = start * 10;
        }
        start = start + (n-1)/length;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n-1)%length));
    }
	
}
