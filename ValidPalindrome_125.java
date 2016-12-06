package leetcode;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("c.b.c.....d.bc"));
		
	}
	
	public static boolean isPalindrome(String s) {
		int l = s.length();
		int count1 =0 ;
		int count2=0;
		if(l==0||l==1){
			return true;
		}
		for(int i=0,j=l-1; i<j; i++,j--){
			//if(count1!==count2)
			while(!Character.isLetterOrDigit(s.charAt(i))&&i<j)
				{i++;
				}
			while(!Character.isLetterOrDigit(s.charAt(j))&&i<j)
				{
				j--;
				}
			if(i == j)
				return true;
			if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
				return false;
			
		}
        return true;
    }

}
