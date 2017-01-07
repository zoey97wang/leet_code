package leetcode;

import java.util.HashSet;

public class BullsandCows_299 {

	public static void main(String[] args){
		//String s1 = "s";
		//String s2 = "d";
		//System.out.println(s1.contains(s2));
		System.out.println(getHint("1807", "7810"));
	}
	
	public static String getHint(String secret, String guess) {
		String result;
        int bulls = 0;
        int cow = 0;
        int[] bullarray = new int[10];
        int[] cowarray = new int[10];
        for(int i=0;i<secret.length();i++){
        	if(i>=guess.length())
        		return "0A0B";
        	if(secret.charAt(i)==guess.charAt(i))
        		bulls++;
        	else{
        		bullarray[secret.charAt(i)-'0']++;
        		cowarray[guess.charAt(i)-'0']++;
        	}
        }
        for(int j=0;j<10;j++){
        	cow=cow+Math.min(bullarray[j], cowarray[j]);
        }
        result = bulls+"A"+cow+"B";
        return result;
    }
	
}
