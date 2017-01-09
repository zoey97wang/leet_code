package leetcode;

public class ReverseString_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hw"));
	}
	
	public static String reverseString(String s) {
        char[] s2 = s.toCharArray();
		int i=0;
        int j=s2.length-1;
        char temp;
		while(i<j){
			temp = s2[i];
			s2[i] = s2[j];
			s2[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(s2);
    }

}
