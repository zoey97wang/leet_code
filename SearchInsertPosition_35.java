package leetcode;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return l;
    }

}
