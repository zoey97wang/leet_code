package leetcode;

public class RepeatedSubstringPattern_459 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	}

	public static boolean repeatedSubstringPattern(String str) {
		int result=0;
        int[] a = new int[26];
        for(int i=0;i<str.length();i++){
        	int index = str.charAt(i)-'a';
        	if(index%2==0)
        		a[index]++;
        	else
        		a[index]--;
        }
        for(int i=0;i<26;i++){
        	System.out.println(a[i]);
        	result = result + a[i];
        }
        if(result==0)
        	return true;
        else
        	return false;
    }
}
