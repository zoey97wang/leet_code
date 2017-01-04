package leetcode;

import java.util.Stack;

public class MyQueue232 {
	
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
//    	System.out.println(s2.empty());
    	int l1 = s1.size();
    	for(int i=0;i<l1;i++){
        	s2.push(s1.pop());
        }
//    	System.out.println(s1.empty());
//    	System.out.println(s2.pop());
    	int l2 = s2.size();
    	for(int i=0;i<l2;i++){
        	s1.push(s2.pop());
        }
    }

    // Get the front element.
    public int peek() {
    	int l1 = s1.size();
    	for(int i=0;i<l1;i++){
        	s2.push(s1.pop());
        }
    	int s = s2.peek();
    	int l2 = s2.size();
    	for(int i=0;i<l2;i++){
        	s1.push(s2.pop());
        }
    	return s;
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return s1.empty();
    }
}
