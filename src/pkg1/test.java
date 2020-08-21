package pkg1;

public class test 
{

	int deepak;
	
	public void method1(int a)
	{
		deepak=a;
	}
	
	public static void main(String[] args) 
	{
	test obj=new test();
	obj.method1(5);
	System.out.println(obj.deepak);
	}
}
