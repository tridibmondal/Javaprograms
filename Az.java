class A
{
	public A()
	{	
		System.out.println("hello");
	}
 public A(int x, int y)
	{	
		System.out.println("tridib");
	}
}
class B extends A
{
	 B()
	{ 	
		super(3,5);
		System.out.println("world");
	}
	B(int x)
	{	this();
		System.out.println("to me");
	}
	
}
public class Az
{
	public static void main(String args[])
	{
		B obj=new B();
		A obj1=new A();
	}
}