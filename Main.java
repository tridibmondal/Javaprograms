class A
{
	int x=11;

}
class B extends A
{
	 int x=12;
	public void f1()
	{
	int x=10;
	System.out.println(this.x);
	System.out.println(super.x);
	System.out.println(x);
	}
}
 public class Main
{
public static void main(String args[])
{
	B obj=new B();
	obj.f1();

}
}