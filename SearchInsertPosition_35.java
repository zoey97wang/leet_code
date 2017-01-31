package leetcode;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,2,2,3};
		System.out.println(searchInsert3(a, 2));
		
	}
	
	public static int searchInsert(int[] nums, int target) {
		int l = nums.length;
        int r = search(nums,target,0,l-1);
        System.out.println(r+"ha");
        return r>-1?r:l;
    }
	
	public static int search(int nums[],int target, int i, int j){
		int index = i+(j-i)/2;
		int result=-1;
		if(index==j){
			System.out.println("roof");
			return result;}
		if(nums[index]<target){
				search(nums,target,index+1,j);
		}else{
			result = index;
			System.out.println(result);
			if(index==0){
				System.out.println("first result "+result);
				return result;
			}else
				search(nums,target,i,index-1);
		}return result;
	}
	
	public static int searchInsert2(int[] nums, int target) {
        int l = nums.length;
        int i = 0;
        int j = l-1;
        while(i<j){
            int index = i + (j-i)/2;
            if(nums[index]==target){
                 return index;
            }
            else if(nums[index]<target)
                i = index+1;
            else
                j = index-1;
        }
        if(nums[i]>=target)
        {
            return i;
        }else
            return i+1;
    }
	
	public static int searchInsert3(int[] nums, int target) {
        int l = nums.length;
        int i = 0;
        int j = l-1;
        while(i<j){
            int index = i + (j-i)/2;
            if(nums[index]==target){
                 int result = index;
                 while(index>-1){
                     if(nums[index]==target)
                        result = index;
                     else break;
                     index--;
                 }
                 return result;
            }
            else if(nums[index]<target)
                i = index+1;
            else
                j = index-1;
        }
        if(nums[i]>=target)
        {
            return i;
        }else
            return i+1;
    }

}
