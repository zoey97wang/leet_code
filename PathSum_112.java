package leetcode;

import leetcode.MinimumDepthofBinaryTree_111.TreeNode;

public class PathSum_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left == null&&root.right==null&&sum-root.val==0)
            return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }

}
