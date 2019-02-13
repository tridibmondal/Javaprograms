package tridib;
class A
{
	void f1()
	{
		System.out.println("hello");
	}
	void f2()
	{
		System.out.println("world");
	}
	void f3()
	{
		System.out.println("tridib");
	}			

}
class B extends A
{
	void f3()
	{
		System.out.println("f3");

	}	
	void f4()
	{
		System.out.println("int system");
	}	
}
public class Lucifer
{
public static void main(String args[])
{
A obj=new B();
obj.f1();
obj.f2();
obj.f3();
//obj.f4();

}			
}