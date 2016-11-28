package leetcode;

public class zigzag_6 {
	
	public static void main(String arg[]){
	
		System.out.println(convert("hateff",3));
		
	}
	
	public static String convert(String s, int numRows) {
	
		String result = "";
		int dis = 2*numRows - 2;
		
		if(numRows == 1 || numRows >= s.length())
			result = s;
		
		else{
		
		for(int i=0; i<numRows; i++){
			for(int j=i;j<s.length();j = j+dis){
				result = result + s.charAt(j);
				if(i!=0 &&i!=numRows -1){
					if(j+dis-2*i<s.length())
					result = result +s.charAt(j+dis-2*i);
				}
			}
		}
		}
		
		return result;
		
    }

}
