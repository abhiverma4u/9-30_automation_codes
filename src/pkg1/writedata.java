package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class writedata 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Kuldeep Yadav\\Desktop\\myfile2.txt");
		FileWriter fw=new FileWriter(f);
		//fw.write("this is write in the file");
		//fw.close(); //used for saving and closing the file
		BufferedWriter br=new BufferedWriter(fw);
		br.write("This is first line");
		br.newLine();   //for moving on to the new line
		br.write("This is second line data");;
		br.close();  //for saving and closing the file
		
	}
	
	
}
