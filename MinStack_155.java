package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class MinStack_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class MinStack {

		ArrayList<Integer> al;
	    ArrayList<Integer> min;
			
		    /** initialize your data structure here. */
		    public MinStack() {
		        al = new ArrayList<>();
		        min = new ArrayList<>();
		    }
		    
		    public void push(int x) {
		        al.add(x);
		        if(min.size()==0||x<=min.get(min.size()-1))
		            min.add(x);
		    }
		    
		    public void pop() {
		    	if(al.size()>=1){
		    	    if(min.get(min.size()-1)>=al.get(al.size()-1))
		    	        min.remove(min.size()-1);
		            al.remove(al.size()-1);
		    	}
		    }
		    
		    public int top() {
		        return al.get(al.size()-1);
		    }
		    
		    public int getMin() {
		        return min.get(min.size()-1);
		    }
	}

}


