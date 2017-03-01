package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class MyStack {
	    Queue q1,q2;
	    /** Initialize your data structure here. */
	    public MyStack() {
	        q1 = new LinkedList();
	        q2 = new LinkedList();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        if(q1.peek() == null)
	        {   q1.add(x);
	            while(q2.peek()!=null){
	                q1.add(q2.poll());
	            }
	        }
	        else if(q2.peek() == null)
	        {   q2.add(x);
	            while(q1.peek()!=null){
	                q2.add(q1.poll());
	            }
	        }
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        if(q1.peek()!=null)
	            return (Integer)q1.poll();
	        else
	            return (Integer)q2.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        if(q1.peek()!=null)
	        return (Integer)q1.peek();
	        else
	        return (Integer)q2.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return (q1.peek()==null&&q2.peek()==null)?true:false;
	    }
	}
	
}
