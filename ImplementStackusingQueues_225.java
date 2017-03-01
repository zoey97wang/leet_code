package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class MyStack {
		Queue q;
	    /** Initialize your data structure here. */
	    public MyStack() {
	        q = new LinkedList();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        q.add(x);
	        for(int i=0;i<q.size()-1;i++){
	            q.add(q.poll());
	        }
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        return (Integer)q.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return (Integer)q.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return (q.peek()==null)?true:false;
	    }
	}
	
}
