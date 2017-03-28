package leetcode;

import java.util.LinkedList;
import java.util.List;

public class KeyboardRow_500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String[] findWords(String[] words) {
        List<String> l = new LinkedList<String>();
        String r1 = "qwertyuiopQWERTYUIOP";
        String r2 = "asdfghjklASDFGHJKL";
        String r3 = "zxcvbnmZXCVBNM";
        for(int i=0;i<words.length;i++){
            boolean flag = true;
            if(r1.indexOf(words[i].charAt(0))>-1){
                for(int j=0;j<words[i].length();j++){
                    if(r1.indexOf(words[i].charAt(j))==-1)
                       {   flag = false;
                           break;}
                }
            }else if(r2.indexOf(words[i].charAt(0))>-1){
                for(int j=0;j<words[i].length();j++){
                    if(r2.indexOf(words[i].charAt(j))==-1)
                       {   flag = false;
                           break;}
                }
            }else{
                for(int j=0;j<words[i].length();j++){
                    if(r3.indexOf(words[i].charAt(j))==-1)
                       {   flag = false;
                           break;}
                }
            }
            if(flag==true) l.add(words[i]);
        }
        String[] result = new String[l.size()];
        for(int i=0;i<l.size();i++){
            result[i] = l.get(i); 
        }
        return result;
    }
	
}
