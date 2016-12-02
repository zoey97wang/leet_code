package leetcode;

public class LengthofLastWord_58 {

	public static void main(String[] args){
		String s ="abc abE ";
		
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		int length=0;
        String news = s.trim();
        int l = news.length();
        for(int i = l-1;i>=0;i--){ 
        	if(news.charAt(i) == ' ')
        		return length;
        	else
        		length++;	
        }
        return length;
    }
	
}
