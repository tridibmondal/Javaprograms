public class Multiply
{
public static void main(String args[])
{
	int m=1;
	for(int i=0;i<args.length;i++)
	{
	m=m*Integer.parseInt(args[i]);
	}
	System.out.println(m);
}
}