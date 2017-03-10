package leetcode;

public class AddStrings_415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(addStrings("6913259244","71103343"));
		//"6913259244","71103343"
		//int x=6913259244;
		//System.out.println(x);
	}
	
	public String addStrings2(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        StringBuilder s = new StringBuilder();
        int count = 0;
        for(int i=l1-1,j=l2-1;i>=0||j>=0||count==1; i--,j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            s.append((x + y + count) % 10);
            count = (x + y + count) / 10;
        }
        return s.reverse().toString();
    }
	
	public static String addStrings(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        int count = 0;
        int result = 0;
        for(int i=l1-1,j=l2-1;(i>j)?i>-1:j>-1;i--,j--){
            int n1 = (i<0)?0:num1.charAt(i)-'0';
            int n2 = (j<0)?0:num2.charAt(j)-'0';
            int sum = n1+n2;
            int i2 = count;
            System.out.println("sum is "+sum+"count is " + i2);
            while(i2!=0){
                sum=sum*10;
                if(count==9)
                System.out.println(sum);
                i2--;
            }
            result = result +sum;
            count++;
        }
        return result+"";
    }

}
