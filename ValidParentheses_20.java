package leetcode;

import java.util.Stack;

//Stack; careful about the case "(){}[]"; so I can not put 1/2 length string to stack;
//what I should do is push and check when condition meet ")"||"}"||"]";

public class ValidParentheses_20 {
	
	public static void main(String args[]){
		String s1 = "((";
		System.out.println(isValid(s1));
	}

	public static boolean isValid(String s) {
		int l = s.length();
		if(l==0){
			return true;
		}
		else if(l%2==0){
			Stack myStack = new Stack();
        	for(int i=0;i<l/2;i++){
        		myStack.push(s.charAt(i));
        		
        	}System.out.println(myStack);
        	for(int j=l/2;j<l;j++){
        		char t = (char) myStack.pop();
        		System.out.println("t"+t);
        		boolean flag = false;
        		if(s.charAt(j) == ')'&& t =='(')
        			{flag = true;
        				System.out.println("flag )"+flag);
        			}
        		if(s.charAt(j) == ']'&& t =='[')
        			{flag = true;
        			System.out.println("flag ["+flag);}
        		if(s.charAt(j) == '}'&& t =='{')
        			{flag = true;
        			System.out.println("flag }"+flag);
        			}
        		
        		if(flag == false)
        			return false;
        	}
        	return true;
        }else
        	return false;
    }
	
}
