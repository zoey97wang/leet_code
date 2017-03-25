package leetcode;

import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> result = new LinkedList<String>();
		result.add("a");
		result.add("b");
		result.add(0,"w");
		result.size();
		String s = "aacde";
		System.out.println(result);
		System.out.println(s.substring(2,5));
	}
	
	public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<List<String>>();
        int l = s.length();
        for(int i=0;i<l;i++){
            if(helper(s,0,i)){
                List<List<String>> temp = new LinkedList<List<String>>();
                if(i!=l-1){
                temp = partition(s.substring(i+1,l));
                }
                if(temp.size() == 0){
                    LinkedList<String> ll = new LinkedList<String>();
                    ll.add(s.substring(0,i+1));
                    temp.add(ll);
                }else{
                    for(List tp:temp){
                        tp.add(0,s.substring(0,i+1));
                    }
                }
                for(List t:temp){
                    result.add(t);
                }
            }
        }
        return result;
    }
    public boolean helper(String s, int begin, int end){
        if(begin<0)
            return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
	

}
