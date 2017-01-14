package leetcode;

import java.util.Arrays;

public class AssignCookies_455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] g = {10,9,8,7};	
		int[] s = {5,6,7,8};
		System.out.println(findContentChildren(g, s));
		
	}
	
	public static int findContentChildren(int[] g, int[] s) {
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0,j=0;i<s.length&&j<g.length;){
            if(s[i]<g[j])
                i++;
            else
            { result++;
            i++;j++;}
        }
        return result;
    }

}
