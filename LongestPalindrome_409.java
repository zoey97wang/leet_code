package leetcode;

public class LongestPalindrome_409 {

	public static void main(String[] args){
		System.out.println(longestPalindrome("abccccdd"));
	}
	
	public static int longestPalindrome(String s) {
        int[] a = new int[58];
        int result=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'A']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>1)
            	{System.out.println(a[i]);
            	result=result+(a[i]/2)*2;}
        }
        if(result<s.length())
        result++;
        return result;
    }
	
}
