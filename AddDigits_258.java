package leetcode;

public class AddDigits_258 {

	public static void main(String[] args){
		System.out.println(addDigits(0));
	}
	
	public static int addDigits(int num) {
        int result=0;
        while(num>0){
        	result=result+num%10;
        	num=num/10;
        }
        if(result<10)
        	return result;
        else
        	return addDigits(result);
    }
	
}
