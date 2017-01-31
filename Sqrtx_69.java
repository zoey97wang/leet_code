package leetcode;

public class Sqrtx_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrtx2(16));
	}
	
	public static int mySqrtx(int x){
		int result = 0;
		int r = 3;
		while(x>0){
			x = x-r;
			r = r+2;
			result++;
		}
		return result;
	}
	
	public static int mySqrtx2(int x){
		if(x<4)
			if(x==0)
			return 0;
			else
				return 1;
		int res = 2*mySqrtx2(x/4);
		int result = res+1;
		if(result*result<=x&&result*result>=0)
			return result;
		return res;
	}

}
