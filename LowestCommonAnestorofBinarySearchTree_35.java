package leetcode;

import leetcode.InvertBinaryTree_226.TreeNode;

public class LowestCommonAnestorofBinarySearchTree_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		while(true){
			if(x>3)
				System.out.println(x = x-1);
			else
			break;
		}
		System.out.println("hello");
	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val&&root.val>q.val)
            return lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val&&root.val<q.val)
            return lowestCommonAncestor(root.right,p,q);
        else
            return root;
    }
	
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		while(true)
		{	if(root.val>p.val&&root.val>q.val)
            	root = root.left;
        	else if(root.val<p.val&&root.val<q.val)
        		root = root.right;
        	else
        		return root;
		}
    }

}
