package leetcode;

public class atoi_8 {

	public static void main(String[] args){
		System.out.println(myAtoi("2147483648"));
		//System.out.println(Integer.MAX_VALUE);
	}
	
	public static int myAtoi(String str) {
		int result = 0;
        int j=0;
        int mark = 1;
        int sign = 0;
        int value;
        if(str.length()==0)
        	return 0;
        while(str.charAt(j)==' '){
        	j++;
        }
        for(int i=j;i<str.length();i++){
        	if(str.charAt(i)=='-'||str.charAt(i)=='+')
        		sign++;
        	System.out.println(sign);
        	if(sign>1)
        		return 0;
        	if(str.charAt(i)=='-')
        		mark = -1*mark;
        	else if(str.charAt(i)=='+')
        	{System.out.println("mark");
        	    mark = 1*mark;
        	}
        	else if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
        		value = str.charAt(i)-'0';
        		System.out.println(value);
        		//System.out.println(result*10+value);
        		System.out.println("0-9");
        		if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&value>7)){
        			if(mark==1)
        			return Integer.MAX_VALUE;
        			else
        			return Integer.MIN_VALUE;
        		}
        		result = result*10 + str.charAt(i)-'0';
        		//System.out.println(result);
        	}else{
        		return mark*result;
        	}
        	
        }
        
        return mark*result;
    }
	
}
