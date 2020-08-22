package pkg1;

import java.util.Scanner;

public class swapnumbers 
{
	public void m1(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New value of a is: "+a);
		System.out.println("New value of b is: "+b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter values of a & b: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		input.close();
				
		swapnumbers obj=new swapnumbers();
		obj.m1(a,b);
	}
}
