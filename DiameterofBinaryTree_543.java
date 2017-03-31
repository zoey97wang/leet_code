package leetcode;

public class DiameterofBinaryTree_543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		 }
	
	public class Solution {
	    Integer max = Integer.MIN_VALUE;
	    public int diameterOfBinaryTree(TreeNode root) {
	        if(root == null)
	            return 0;
	        int left = getMax(root.left,0);
	        int right = getMax(root.right,0);
	      //  System.out.println(left+right);
	        max = Math.max(max, left+right);
	        diameterOfBinaryTree(root.left);
	        diameterOfBinaryTree(root.right);
	        return max;
	    }
	    public int getMax(TreeNode root,int len){
	        if(root == null)
	            return len;
	        else{
	            len++;
	        }
	        return Math.max(getMax(root.left,len),getMax(root.right,len));
	    }
	}

}
