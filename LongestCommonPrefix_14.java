package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix_14 {

	public static void main(String[] args){
		String[] strs = {"c","c"};
		System.out.println("result="+longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	       String result = "";
	       
	       
	       Arrays.sort(strs);
	       
	       System.out.println(strs[0].substring(0, 0));
	       
	       if(strs.length == 0)
		       return result;
		       
		   else if(strs.length == 1){
	    	   result = strs[0];
	    	   return result;
	       }
	       
	       else
	       {
	    	   for(int i=1;i<=strs[0].length();i++){
	    		   String prefix = strs[0].substring(0, i);
	    		   System.out.println(prefix);
	    		   if(strs[strs.length-1].startsWith(prefix)){
	    			   result = strs[0].substring(0, i);
	    		   }else
	    			   return result;
	    	   }
	       }
	      
	       return result;
    }
	
}
