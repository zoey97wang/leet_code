package leetcode;

public class SameTree_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null)
	    	   return true;
	    if((p!=null&&q!=null)&&(p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right))
	    	   return true;
	    return false;
    }

}
