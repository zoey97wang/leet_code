package leetcode;

public class SymmetricTree_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return ChildSymmetric(root.left,root.right);
    }
	
    public boolean ChildSymmetric(TreeNode left, TreeNode right){
        if(left==null&&right==null)
            return true;
        if((left!=null&&right!=null)&&(left.val==right.val))
            return ChildSymmetric(left.left,right.right)&&ChildSymmetric(left.right,right.left);
        return false;
    }

}
