class Fibonacii
{
	
public static void main(String args[])
{
      int f=0;
	int s =1;
	int sum=0;
	int l=args.length;

	System.out.println(f);
	System.out.println(s);

	for(int i=0; i<l;i++)
	{
	sum=f+s;
         f=s;
	s=sum;
	System.out.println(sum);
	}
		
}
}

	

