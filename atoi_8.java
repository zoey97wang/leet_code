package leetcode;

//38ms remove whitespace and use value = str.charAt(j)-'0'
public class atoi_8 {

	public static void main(String[] args){
		System.out.println(myAtoi("2147483648"));
	}
	
	public static int myAtoi(String str) {
		int result = 0;
		int j=0;
		int sign = 0;
        int mark = 1;
        int value;
        if(str.length()==0)
        	return 0;
        while(str.charAt(j)==' '){
        	j++;
        }
        for(j=j;j<str.length();j++){
        	if(str.charAt(j)=='-'||str.charAt(j)=='+')
        		sign++;
        	if(sign>1)
        		return 0;
        	if(str.charAt(j)=='-')
        		mark = -1*mark;
        	else if(str.charAt(j)=='+')
        	    mark = 1*mark;
        	else if(str.charAt(j)<='9'&&str.charAt(j)>='0'){
        		value = str.charAt(j)-'0';
        		if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&value>7)){
        			if(mark==1)
        			return Integer.MAX_VALUE;
        			else
        			return Integer.MIN_VALUE;
        		}
        		result = result*10 + value;
        	}else{
        		return mark*result;
        	}
        	
        }
        
        return mark*result;
    }
	
}
