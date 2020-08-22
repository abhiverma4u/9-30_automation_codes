package pkg1;
import java.util.Scanner;

public class swapbythird 
{

	public void method1(int a, int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Values of a & b after swap using 3rd variable are:"+ "\nValue of a is: "+a +"\nValue of b is: "+b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter values of a & b: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		input.close();
		swapbythird s=new swapbythird();
		s.method1(a, b);
	}
}
