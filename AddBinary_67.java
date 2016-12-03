package leetcode;

public class AddBinary_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("0", "0"));
	}
	
	public static String addBinary(String a, String b) {
		int al = a.length();
		int bl = b.length();
        //Math.max(al, bl);
		int i = 0;
		int carry = 0;
        String result = "";
        while(i<al || i<bl || carry!=0){
        	System.out.println("while");
        	int a1 = (i<al) ? Character.getNumericValue(a.charAt(al - 1 - i)) : 0;
        	int b1 = (i<bl) ? Character.getNumericValue(b.charAt(bl - 1 - i)) : 0;
        	result = (a1+b1+carry)%2 + result;
        	carry = (a1+b1+carry)/2;
        	i++;
        }
        return result;
    }

}
