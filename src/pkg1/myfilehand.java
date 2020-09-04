package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;





public class myfilehand
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Kuldeep Yadav\\Desktop\\myfile.txt");
		FileReader fr=new FileReader(f);
		
		//Read data character by character
		/*int a;
		while((a=fr.read())!=-1)   //-1 means end of the file
		{
			System.out.println((char)a);
		}*/
		
		//Read data Line by Line
		BufferedReader br= new BufferedReader(fr);
		
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}
