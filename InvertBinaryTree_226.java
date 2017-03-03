package leetcode;

public class InvertBinaryTree_226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

	public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        else{
            TreeNode temp = new TreeNode(0);
            temp.left = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp.left;
        }
        return root;
    }
	
}
