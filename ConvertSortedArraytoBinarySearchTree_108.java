package leetcode;

public class ConvertSortedArraytoBinarySearchTree_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        TreeNode head = getNode(nums,0,nums.length-1);
        return head;
    }
    public TreeNode getNode(int[] nums, int low, int high){
        if(low>high)
            return null;
        int index = (low+high)/2;
        TreeNode result = new TreeNode(nums[index]);
        result.left = getNode(nums,low,index-1);
        result.right = getNode(nums,index+1,high);
        return result;
    }

}
