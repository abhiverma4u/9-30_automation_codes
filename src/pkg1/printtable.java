package pkg1;
import java.util.Scanner;

public class printtable
{

	public void table(int a)
	{
		System.out.println("\nTable of entered number is:");
				
		for(int i=1;i<=10;i++)
		{
			int b=a*i;
			System.out.println(a+" * "+i+" = "+b);
		}
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println("Enter value for table:");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		obj.close();
		
		printtable tab=new printtable();
		tab.table(a);
	}
	
	
}
