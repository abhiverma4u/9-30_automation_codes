package pkg1;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		obj.close();
		
		int input=num, add=0;
		while(num>0)
		{
			int bal=num%10;
			add= add*10+bal;
			num=num/10;
		}
		if(input==add)
		{
			System.out.println(input+" is palindrome number");
		}
		else
		{
			System.out.println(input+" is not palindrome number");
		}
		
	}
}
