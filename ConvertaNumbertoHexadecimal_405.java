package leetcode;

public class ConvertaNumbertoHexadecimal_405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toHex(int num) {
        char[] hex = {'0','1','2','3','4','5','6',
            '7','8','9','a','b','c','d','e','f'};
        if(num==0)
        return "0";
        String result = "";
        while(num!=0)
        {
            result = hex[num&15]+result;
            num = num>>>4;
        }
        return result;
    }

}
