package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class writedatanew
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Kuldeep Yadav\\Desktop\\myfile2.txt");
		FileWriter fw=new FileWriter(f,true); //true places curson at end of the file
		fw.write("This is new data in old file");
		fw.close();
	}
	
	
}
