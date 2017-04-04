package leetcode;

public class Base7_504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String convertToBase7(int num) {
        int flag;
        if(num==0)
            return "0";
        else if(num <0){
            flag = -1;
            num = -num;
        }
        else
            flag = 0;
        String result = "";
        while(num>0){
            result = num%7 +result;
            num = num/7;
        }
        return (flag<0)?"-"+result:result;
    }

}
