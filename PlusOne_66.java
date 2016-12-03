package leetcode;

public class PlusOne_66 {

	public static void main(String[] args){
		int[] t = {1,2,3};
		//t = {1,2,3};
		System.out.println(plusOne(t)[2]);
	}
	
	public static int[] plusOne(int[] digits) {
		int l = digits.length;
        int[] result = new int[l+1];
        result[0] = 1;            //this for 9999999;
        for(int i = l-1;i>=0;i--){
        	if(digits[i]<9){
        		digits[i]++;
        		return digits;
        	}
        	digits[i]=0;        //this for 19;299;499;
        }
        return result;
    }
}
