package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class MinStack_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class MinStack {

		ArrayList<Integer> al;
		
	    /** initialize your data structure here. */
	    public MinStack() {
	        al = new ArrayList<>();
	    }
	    
	    public void push(int x) {
	        al.add(x);
	    }
	    
	    public void pop() {
	    	if(al.size()>=1)
	        al.remove(al.size()-1);
	    }
	    
	    public int top() {
	        return al.get(al.size()-1);
	    }
	    
	    public int getMin() {
	        int min = 0;
	        for(int i =0; i<al.size(); i++){
	        	if(al.get(i)<min)
	        		min = al.get(i);
	        }
	        return min;
	    }
	}

}


