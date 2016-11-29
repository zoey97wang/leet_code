package leetcode;

public class LongestCommonPrefix_14 {

	public static void main(String[] args){
		String[] strs = {""};
		System.out.println("result="+longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	       String result = "";
	       int max = 0;
	       
	       if(strs.length == 0)
		       return result;
		       
		   else if(strs.length == 1){
	    	   result = strs[0];
	    	   return result;
	       }
	       
	       else
	       {
	       for(int i = 0; i<strs.length;i++){
	    	   if(strs[i].length() > strs[max].length())
	    		   max = i;
	    	   
	       }
	       
	       String maxStr = strs[max];
	       result = maxStr;
	      System.out.println(maxStr);
	       
	       for(int m = 1; m <= strs[max].length();m++){
	    	   String prefix = strs[max].substring(0, m);
	    	  System.out.println("prefix = "+prefix);
		       for(int j = 0; j<strs.length;j++){
		    	   if(!strs[j].startsWith(prefix)){
		    		   System.out.println(j);
		    		   result = strs[max].substring(0, m-1);
		    		   return result;
		    	   }
		       }
	       }
	       }
	       return result;
    }
	
}
