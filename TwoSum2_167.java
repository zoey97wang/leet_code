package leetcode;

public class TwoSum2_167 {

	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int l = numbers.length;
        for(int i=0;i<l;i++){
            if(numbers[i] == 0 && target!=0)
                i++;
            else
            {
            for(int j=i+1;j<l;j++){
                if(numbers[i]+numbers[j]>target)
                    break;
                else if(numbers[i]+numbers[j]==target)
                {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
            }
        }
        return result;
    }
	
}
