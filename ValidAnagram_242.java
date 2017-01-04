package leetcode;

import java.util.LinkedList;

public class ValidAnagram_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("adb", "dba"));
	}

	public static boolean isAnagram(String s, String t) {
		LinkedList<Character> r = new LinkedList<>();
		int l1 = s.length();
		int l2 = t.length();
		if(l1==l2){
			char[] c1 = s.toCharArray();
			char[] c2 = t.toCharArray();
			for(int i=0;i<l1;i++){
				r.add(c1[i]);
				System.out.println(r.get(i
						));
			}
			for(int i=0;i<l2;i++){
				Character c = c2[i];
				System.out.println(c);
				if(!r.remove(c)){
					return false;
				}
			}
			return r.isEmpty();
		}
		return false;
    }
}
