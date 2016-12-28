package leetcode;

public class ExcelSheetColumnNumber_171 {

	public static void main(String[] args){
		char a ='A';
//		int r = a - 64;
		System.out.println(titleToNumber("AAA"));
//		System.out.println(Math.pow(26, 2));
	}
	
	public static int titleToNumber(String s) {
        int result = 0;
        char[] c = s.toCharArray();
        int l = c.length-1;
        for(int i=0;i<=l;i++){
        	if(i == l){
        		result = c[i]-64 + result;
        	}else
        		result = (int) (Math.pow(26,(l-i)) * (c[i]-64) +result);
        }
        
        //(Math.pow(26,(l-i)) * (c[i]-64)
        
        return result;
    }
	
}
