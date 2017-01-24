package com.codingtest;

import java.io.*;

public class TestA2 {
	public static void main (String[] args)
	        throws FileNotFoundException {
		try{
			/*Creates a test text file with a number of lines. 
			Each line should be a simple sentence comprised of few words separated by spaces.*/
			
			FileWriter  writer = new FileWriter("source.txt");
			writer.write("Gym is Best Place for Workout");
			writer.write("\r\n");   // write new line
			writer.write("Learning is Best Hobby");
			writer.close();
			String msg;
			FileReader fr = new FileReader("source.txt"); // Reading the File
            FileWriter fw = new FileWriter("dest.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader buffer = new BufferedReader(fr);
            bw.write("The reversed words are : ");
            bw.write("\r\n"); 
            while((msg =buffer.readLine()) != null)
            {
	            String[] words = msg.split (" ");
	            for(int x = words.length - 1; x >=0; x--) {
	                bw.write(words[x] + " ");  // writing to new file
	            }
	            bw.write("\r\n"); 
            }
            bw.flush() ; // Flushing
            bw.close() ;
            fr.close() ;
            System.out.println("Written to a file");
        } catch (Exception e) {
        		System.out.println(e.getMessage());
        }
	}
	
	
}
