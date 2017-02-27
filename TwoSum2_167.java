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
	
	public int[] sulotion(int[] numbers, int target){
		int[] result = new int[2];
		int left = 0;
		int right = numbers.length-1;
		while(left<right){
			int v = numbers[left] + numbers[right];
			if(v==target){
				result[0] = left++;
				result[1] = right++;
				return result;
			}else if(v<target)
				left++;
			else
				right--;
		}
		return result;
	}
	
}
