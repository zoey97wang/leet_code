package leetcode;

import java.util.LinkedList;

public class NumberComplement_476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        int result=0;
        int count=0;
        while(num>1){
           l.add(num%2);
           num=num/2;
        }
        l.add(num);
        for(Integer i:l){
        	System.out.println(i);
        }
        for(int i=l.size()-1;i>-1;i--){
        	if(l.get(i)==0)
        	{
        		l2.add(1);
        		count++;
        	}
        	else if(count>0)
        		l2.add(0);
        }
        for(Integer i:l2){
        	System.out.println("this is l2");
        	System.out.println(i);
        }
 //       for(int i=l2.size()-1;i>-1;i--){
   //         result=result*2+l2.get(i);
     //   }
        for(Integer i:l2)
        	result = result*2+i;
        return result;
    }
	
}
