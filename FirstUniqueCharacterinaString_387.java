package leetcode;

public class FirstUniqueCharacterinaString_387 {

	public static void main(String[] args){
		System.out.println(firstUniqChar("let"));
	}
	
	public static int firstUniqChar(String s) {
        int result = s.length();
        int[] a = new int[26];
        for(int i=0;i<s.length();i++){
        	a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
        	if(a[i]==1) 
        	{
        		char c = (char) (i+'a');
        		int index = s.indexOf(c);
        		if(index<result)
        			result =index;
        	}
        }
        if(result==s.length())
        	return -1;
        return result;
    }
	
}
