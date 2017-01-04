package leetcode;

import java.util.HashSet;

public class WordPattern_290 {

	public static void main(String[] args){
		System.out.println(wordPattern("abba","dog cat cat dog"));
		String s1 = "hello";
		String s2 = "hello";
		if(s1==s2){
			System.out.println("equal");
		}
		if(s1.equals(s2)){
			System.out.println("equal");
		}
	}
	
	public static boolean wordPattern(String pattern, String str) {
		String[] a = new String[26];
		HashSet<String> h = new HashSet<>();
		String[] s = str.split(" ");
		char[] p = pattern.toCharArray();
		
		if(s.length!=p.length)
            return false;
		for(int i=0; i<s.length;i++){
			if(h.add(s[i]))               //check str[] already have or not; if not;
			{
				if(a[p[i]-'a']==null)          //if not; check if same pattern map different str;
					a[p[i]-'a'] = s[i];
				else
					return false;
			}else{                                     //if str[] already exist;
				if(a[p[i]-'a']==null)                  //check if different pattern map same str;
					return false;
				if(!a[p[i]-'a'].equals(s[i]))                                 //!!!!!!!suppose be  if(a[p[i]-'a']!=s[i])
					return false;
			}
		}
        return true;
    }
}
