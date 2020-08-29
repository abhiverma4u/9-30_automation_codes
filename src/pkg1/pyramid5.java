package pkg1;

import java.util.Scanner;

public class pyramid5
{
	public static void main(String[] args) 
	{
		
	System.out.print("Enter number of rows for pyramid: ");
	Scanner obj=new Scanner(System.in);
	int num=obj.nextInt();
	obj.close();
	
	
	for (int n=0; n<num; n++) 
	{ 
		for (int m=0; m<num-n; m++) 
		{ 
			System.out.print(" "); 
		} 
		for (int k=0; k<=n; k++) 
		{ 
			System.out.print("*"); 
		} 
		
		System.out.println(); }

		
}
}
