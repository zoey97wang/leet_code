package leetcode;

import java.util.HashSet;

public class LongestPalindromicSubstring_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "babad";
		System.out.println(palindrome(s,0,2));
	}

	public String longestPalindrome(String s) {
        int length = 0;
        String result = "";
        for(int i=0;i<s.length();i++){
            if(palindrome(s,i-length-1,i)){
                result = s.substring(i-length-1,i+1);
                length = length+2;
            }else if(palindrome(s,i-length,i)){
                result = s.substring(i-length,i+1);
                length = length+1;
            }
        }
        return result;
    }
	
	public static boolean palindrome(String s, int begin, int end){
        if(begin<0)
            return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)){
            	System.out.println(begin+" "+end);
                return false;
            }
        }
        return true;
        
	}
}
