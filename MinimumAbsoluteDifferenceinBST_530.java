package leetcode;

import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST_530 {

	public class Solution {
	    int min = Integer.MAX_VALUE;
	    Integer pre = null;
	    public int getMinimumDifference(TreeNode root) {
	        if(root == null)
	            return min;
	        getMinimumDifference(root.left);
	        if(pre!=null){
	            min = Math.min(min, root.val - pre);
	        }
	        pre = root.val;
	        getMinimumDifference(root.right);
	        return min;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }

	    int min = Integer.MAX_VALUE;
	    List<Integer> l = new LinkedList<>();
	    public int getMinimumDifference(TreeNode root) {
	        helper(root);
	        int len = l.size();
	        int[] a = new int[len];
	        for(int i=0;i<len;i++){
	            a[i] = l.get(i);
	        }
	        for(int j=0;j<len;j++){
	            for(int x=j+1;x<len;x++){
	                int d = a[j]-a[x];
	                min = Math.min(min,Math.abs(d));
	            }
	        }
	        return min;
	    }
	    public void helper(TreeNode root) {
	        if(root == null)
	            return;
	        l.add(root.val);
	        helper(root.left);
	        helper(root.right);
	    }

}
