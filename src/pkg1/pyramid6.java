package pkg1;

import java.util.Scanner;

public class pyramid6 
{

	
	public static void main(String[] args) 
	{
		
	System.out.print("Enter number of rows for pyramid: ");
	Scanner obj=new Scanner(System.in);
	int num=obj.nextInt();
	obj.close();
	
	for (int a=0; a<num; a++) 
	{ 
		for (int b=0; b<num-a; b++) 
		{ 
			System.out.print(" "); 
		} 
		for (int c=0; c<=a; c++) 
		{ 
			System.out.print("* "); 
		} 
		
		System.out.println(); 
	}
	}
}
