package pkg1;

public class Assignmethod 
{
	public void method0()
	{
		this.method3();
		System.out.println("This is Default method");
	}
	
	public void method1()
	{
		this.method0();
		System.out.println("This is method 1");
	}
	
	public void method2()
	{
		this.method1();
		System.out.println("This is method 2");
	}
	
	public void method3()
	{
		System.out.println("This is method 3");
	}
	
	public void method4()
	{
		this.method2();
		System.out.println("This is method 4");
	}
	
	public static void main(String[] args) 
	{
		Assignmethod obj=new Assignmethod();
		obj.method4();
	}
}
