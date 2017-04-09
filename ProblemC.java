package codeJam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ProblemC {

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
                String[] s = line.split(" ");
                int room = Integer.parseInt(s[0]);
                int people = Integer.parseInt(s[1]);
                result.add(helper(room,people));
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
            	String[] a = s.split(" ");
                int left = Integer.parseInt(a[0]);
                int right = Integer.parseInt(a[1]);    
            	bufferedWriter.write("Case #"+counter);
            	bufferedWriter.write(": ");
            	bufferedWriter.write(left+"");
            	bufferedWriter.write(" ");
            	bufferedWriter.write(right+"");
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

	private static String helper(int room, int people) {
		// TODO Auto-generated method stub
		int[] a = new int[room];
		while(people>0){
		int left = 0;
		for(int i:a){
			if(i==0)
				left++;
			else
				break;
		}
		int right = 0;
		for(int i=a.length;i>=0;i--){
			if(i==0)
				left++;
			else
				break;
		}
		int index = Math.max(left/2, right/2);
		if(people>1){
			a[index] = 1;
			people--;
		}else if(people==0)
		{
			int l = Math.max(left/2, right/2);
			int s = Math.min(left/2, right/2);
			return l+" "+s;
		}
		
	}
		return null;
	
	
	}
}
