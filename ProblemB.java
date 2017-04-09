package codeJam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> result = new LinkedList<String>();
		 
        String infileName = "input.txt";
        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(infileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            String total = bufferedReader.readLine();
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                result.add(helper3(line));
            }   
            
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                infileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + infileName + "'");                  
        }
	    
	    
	    String fileName = "Output.txt";
	    
	    try {
            FileWriter fileWriter =
                new FileWriter(fileName);

            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            int counter = 1;
            for(String s:result){
            	bufferedWriter.write("Case #"+counter);
            	bufferedWriter.write(": ");
            	bufferedWriter.write(s);
            	bufferedWriter.newLine();
            	counter++;
            }

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");

        }
	}
	

	public static String helper3(String in){
		String result = "0";
		char[] a = in.toCharArray();
		boolean flag = false;
		while(flag == false){
			flag = true;
			int len = a.length;
		for(int i=1;i<len;i++){
			if(flag==false){
				a[i]='9';
			}
			else{
				int before = Character.getNumericValue(a[i-1]);
				int after = Character.getNumericValue(a[i]);
				if(before>after){
					int ai = Character.getNumericValue(a[i-1]);
					ai =ai-1;
					a[i-1] = (char) (ai+'0');
					a[i] ='9';
					flag = false;
				}
			}
		}
		String newOne = new String(a);
		long num = Long.parseLong(newOne);
		newOne = num+"";
		if(flag==true)
			return newOne;
		else
			a = newOne.toCharArray();
		}
		return result;
	}

}
