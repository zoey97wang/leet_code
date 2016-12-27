package leetcode;

import java.util.Arrays;

public class CompareVersionNumbers_165_SplitVersion {

	public static void main(String[] args){
		String s1 = "1.0.0";
		String s2 = "1.0.0.0.1";
	System.out.println(compareVersion(s1, s2));
	}

	private static int compareVersion(String version1, String version2) {
		// TODO Auto-generated method stub	
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		int l1 = s1.length;
		int l2 = s2.length;
		for(int i=0; i<Math.max(l1, l2);i++){
			if(i>=l1)
			{	if(Integer.parseInt(s2[i])>0)
					return -1;
			}
			else if (i>=l2)
			{	if(Integer.parseInt(s1[i])>0)
				return 1;
			}
			{	
				if(Integer.parseInt(s1[i])>Integer.parseInt(s2[i]))
					return 1;
				if(Integer.parseInt(s1[i])<Integer.parseInt(s2[i]))
					return -1;
			}
		}
			return 0;

	}
	
}
