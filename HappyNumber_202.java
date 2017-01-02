package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HappyNumber_202 {

	public static void main(String[] args){
		Boolean a = isHappy(7);
		//boolean b = true;
		System.out.println(a);
	}
	
	public static Boolean isHappy(int n) {
		HashSet<Integer> a = new HashSet<>();
		int temp;
		while(a.add(n)){
			int sum = 0;
			while(n>0){
				temp = n%10;
			//	System.out.println("temp"+temp);
				sum = sum+temp*temp;
				n/=10;
			}
		//	System.out.println("sum"+sum);
			if(sum==1){
				return true;
			}else
				n=sum;
		}
        return false;
    }
	
}
