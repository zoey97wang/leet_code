package leetcode;

import java.util.LinkedList;
import java.util.List;

import leetcode.DeleteNodeinaLinkedList_237.ListNode;
import leetcode.LowestCommonAnestorofBinarySearchTree_35.TreeNode;

public class BinaryTreePaths_257 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<String>();
        if(root!=null)
        getString("", root, result);
        return result;
    }
    public void getString(String s, TreeNode node, List<String> result){
        if(node.left==null&&node.right==null) result.add(s+node.val);
        if(node.left!=null) getString(s+node.val+"->",node.left,result);
        if(node.right!=null) getString(s+node.val+"->",node.right,result);
    } 
	
}
