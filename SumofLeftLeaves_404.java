package leetcode;

public class SumofLeftLeaves_404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	 public int sumOfLeftLeaves(TreeNode root) {
	        if(root==null||root.left==null)
	            return 0;
	        int result = 0;
	        if(root.left.left==null&&root.left.right==null)
	            result = result + root.left.val;
	        result = result + sumOfLeftLeaves(root.left);
	        result = result + sumOfLeftLeaves(root.right);
	        return result;
	    }

}
