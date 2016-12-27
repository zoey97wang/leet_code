package leetcode;

import java.util.Arrays;

public class CompareVersionNumbers_165_SplitVersion {

	public static void main(String[] args){
		String s1 = "1.0.0";
		String s2 = "1.0.0.0.1";
	/*	String[] words1 = s2.split("\\.");
		String[] words = Arrays.copyOfRange(words1, 1, 1);
		for(String w:words){  
			System.out.println(w);  
			} 
	*/ 
	System.out.println(compareVersion(s1, s2));
	}

	private static int compareVersion(String version1, String version2) {
		// TODO Auto-generated method stub	
		int flag=0;
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		int l1 = s1.length;
		int l2 = s2.length;
		for(int i=0; i<Math.max(l1, l2);i++){
			if(i>=l1)
			{	flag = compare(0, Integer.parseInt(s2[i]));
				if(flag != 0 )
					return flag;
			}
			else if(i>=l2)
			{	flag = compare(Integer.parseInt(s1[i]), 0);
				if(flag != 0 )
					return flag;
			}
			else
			{	flag = compare(Integer.parseInt(s1[i]), Integer.parseInt(s2[i]));
				if(flag != 0 )
					return flag;
			}
		}
		
	/*	
		if(s1.length<s2.length)
		{
			System.out.println("length "+s2.length);
		for(int i=0;i<s1.length;i++){
			System.out.println(Integer.parseInt(s1[i]));
			System.out.println(Integer.parseInt(s2[i]));
			if(Integer.parseInt(s1[i])==Integer.parseInt(s2[i]))
				flag = 0;
			if(Integer.parseInt(s1[i])<Integer.parseInt(s2[i]))
				return -1;
			if(Integer.parseInt(s1[i])>Integer.parseInt(s2[i]))	
				return 1;
		}
		System.out.println("out for loop");
		return compareVersion("0",Arrays.toString(Arrays.copyOfRange(s2, s1.length-1, s2.length)));
		}
		if(s1.length>s2.length){
			for(int i=0;i<s2.length;i++){
				if(Integer.parseInt(s1[i])==Integer.parseInt(s2[i]))
					flag=0;
				if(Integer.parseInt(s1[i])<Integer.parseInt(s2[i]))
					return -1;
				if(Integer.parseInt(s1[i])>Integer.parseInt(s2[i]))	
					return 1;
			}
			return compareVersion(Arrays.toString(Arrays.copyOfRange(s1, s2.length, s1.length)),"0");
		}
		if(s1.length==s2.length){
			for(int i=0;i<s2.length;i++){
				if(Integer.parseInt(s1[i])==Integer.parseInt(s2[i]))
					flag=0;
				if(Integer.parseInt(s1[i])<Integer.parseInt(s2[i]))
					return -1;
				if(Integer.parseInt(s1[i])>Integer.parseInt(s2[i]))	
					return 1;
			}
		}
		
		*/
			return 0;

	}
	
	public static int compare(int a, int b){
		if(a<b)
			return-1;
		if(a>b)
			return 1;
		else
			return 0;
	}
}
