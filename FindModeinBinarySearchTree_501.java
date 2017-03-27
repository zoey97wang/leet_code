package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindModeinBinarySearchTree_501 {

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
		    Map<Integer, Integer> m; 
		    int max = 0;
		    public int[] findMode(TreeNode root) {
		        if(root==null)
		            return new int[0];
		        this.m = new HashMap<>();
		        List<Integer> l = new LinkedList<Integer>();
		        traverse(root);
		        for(int key: m.keySet()){
		        	if((int) m.get(key) == max) l.add(key);
		        }
		        int len = l.size();
		        int[] result = new int[len];
		        for(int i=0;i<len;i++){
		            result[i] = l.get(i);
		        }
		        return result;
		    }
		    
		    public void traverse(TreeNode root){
		        m.put(root.val, (int) m.getOrDefault(root.val, 0)+1);
		        max = Math.max(max, (int) m.get(root.val));
		        if(root.left!=null) traverse(root.left);
		        if(root.right!=null) traverse(root.right);
		    }
		}

}
