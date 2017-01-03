package leetcode;

public class IsomorphicStrings_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isIsomorphic("aa", "bb"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
        int l = s.length();
        int[] s1 = new int[128];
        int[] t1 = new int[128];
        for(int i = 0;i<l;i++){
        	int s2 = s.charAt(i);
        	int t2 = t.charAt(i);
        	if(s1[s2]==0&&t1[t2]==0){
        		s1[s2]=t2;
        		t1[t2]=1;                      //this one used for check ab aa;
        	}else if(s1[s2]!=t2)
        		return false;
        }
		return true;
    }

}
