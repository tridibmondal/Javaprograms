 public class Instance_Block
{
	private int x;
	{
	System.out.println(" x "+ x);
	x=5;
	
	}
Instance_Block()
  {
	System.out.println(x);
  }

	
	{
	x=6;
	System.out.println(" x "+ x);
	
	
	}
   {
	x=7;
	System.out.println(" x "+ x);
	
	
	}
public static void main(String args[])
 {
	Instance_Block obj=new Instance_Block();
	Instance_Block obj1=new Instance_Block();

 }
 }
