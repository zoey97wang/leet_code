package leetcode;

public class Heaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] houses = {1,2,3};
		int[] heaters = {1,5};
		System.out.println(findRadius(houses, heaters));
	}
	
	public static int findRadius(int[] houses, int[] heaters) {
        int result = 0;
        int min=0;
        for(int i=0,j=0;i<houses.length&&j<heaters.length;){
        {
        	if(houses[i]<=heaters[j]){
        		System.out.println("less i is "+i+" house[i] "+houses[i]+" j "+j+" heater "+heaters[j]);
        		if(j==0)
                    min = heaters[j]-houses[0];
                else
                {    min = Math.min(heaters[j]-houses[i],houses[i]-heaters[j-1]);
        		System.out.println(heaters[j]-houses[i]);
        		System.out.println(houses[i]-heaters[j-1]);
        		System.out.println(min);}
                i++;
                result = Math.max(min,result);
                System.out.println("result "+result);
            }
            else if(j==heaters.length-1)
                return result = Math.max(result, houses[houses.length-1]-houses[j]);
            else
            {
            	System.out.println("greater i is "+i+" j "+j);
            	j++;
            }	
        	}
        }

        return result;
    }

}
