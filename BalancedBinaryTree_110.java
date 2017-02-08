package leetcode;

public class BalancedBinaryTree_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean isBalanced(TreeNode root) {
        int max = getMaxDepth(root);
        int min = getMinDepth(root);
        System.out.println(max+""+min);
        if((max-min)>1)
            return false;
        return true;
    }
	
    public int getMaxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
    }
    public int getMinDepth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.min(getMinDepth(root.left),getMinDepth(root.right));
    }

    public boolean isBalanced2(TreeNode root) {
        if(balance(root)==-1)
            return false;
        return true;
    }
    
    public int balance(TreeNode t){
    	if(t==null)
    		return 0;
    	int l = balance(t.left);
    	if(l==-1){
    		return -1;
    	}
    	int r = balance(t.right);
    	if(r==-1){
    		return -1;
    	}
    	if(Math.abs(r-l)>1)
    		return -1;
    	else
    		return 1+Math.max(r, l);
    }
}
