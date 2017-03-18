package leetcode;

public class ReverseStringII_541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefg";
		System.out.println(s.substring(4,s.length()));
		
	}
	
	public String reverseStr(String s, int k) {
        int position = 0;
        String sub = "";
        String result = "";
        int l = s.length();
        if(k<2||l<2)
            return s;
        for(int i=0;i<l;){
            if(i!=position){
                result = result + s.charAt(i);
                i++;
            }else
            {
                if(i+k<l)
                    sub = s.substring(i,i+k);
                else
                    sub = s.substring(i,l);
                result = result + helper(sub);
                i = i+k;
                position = position+2*k;
                System.out.println("position"+position+" i "+i);
            }
        }
        return result;
    }
    
    public String helper(String s){
        String result = "";
        for(int i=s.length()-1;i>=0;i--){
            result = result + s.charAt(i);
        }
        return result;
    }
	
}
