package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ReverseVowelsofaString_345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a2 = {'A','b'};
		 ArrayList<Character> a = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		 System.out.println(a.contains(Character.toLowerCase(a2[0])));
		System.out.println(reverseVowels("hellE"));
	}
	
	public static String reverseVowels(String s) {
        char[] s2 = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        char temp;
        ArrayList<Character> a = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(i<j){
        	if(a.contains(s2[i])&&a.contains(s2[j])){
        		temp = s2[i];
        		s2[i]=s2[j];
        		s2[j]=temp;
        		i++;
        		j--;
        	}
        	if(!a.contains(s2[i])){
        		i++;
        	}
        	if(!a.contains(s2[j])){
        		j--;
        	}
        }
		return String.valueOf(s2);
    }

}
