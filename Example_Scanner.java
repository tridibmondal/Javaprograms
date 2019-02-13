import java.util.*;
class Example_Scanner
 {
 void calculate()
{	System.out.println("enter the number");
	int n;

	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
System.out.println(f);
}
public static void main(String args[])
   {
	Example_Scanner s1=new Example_Scanner();
	s1.calculate();
   }
}