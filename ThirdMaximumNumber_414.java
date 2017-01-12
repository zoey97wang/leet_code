package leetcode;

public class ThirdMaximumNumber_414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,2,1};
		System.out.println(thirdMax(a));
	}
	
	public static int thirdMax(int[] nums) {
		Integer max = null;
        Integer sed = null;
        Integer thd = null;
        for(Integer i : nums){
            if(i.equals(max)||i.equals(sed)||i.equals(thd))
            continue;
            if(max == null ||i>max)
            {
                thd = sed;
                sed = max;
                max = i;
                
            }else if(sed == null ||i>sed){
                thd = sed;
                sed = i;
            }else if(thd == null ||i>thd)
            	{
            	    thd = i;
            	}
        }
        if(thd==null)
            return max;
        return thd;
    }

}
