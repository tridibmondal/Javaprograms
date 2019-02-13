class Calculator
{
	public static void main(String args[])
	{	int s=0,sub=0,mul=1,div=1;
		int l=args.length;
		
		for(int i=0;i<l;i++)
		{
			if(args[l-1].equals("sum"))
			{
				for(int j=0;j<l-1;j++)
				{	
				
					s=s+Integer.parseInt(args[j]);
				}
			System.out.println(s);
			break;
			}
			
			
			else if(args[l-1].equals("sub"))
			{
				for(int j=0;j<l-1;j++)
				{	
				
					sub=
sub-Integer.parseInt(args[j]);
				}
				System.out.println(sub);
				break;
			}
			
		
			else if(args[l-1].equals("mul"))
			{
				for(int j=0;j<l-1;j++)
				{	
				
					mul=mul*Integer.parseInt(args[j]);
				}
				System.out.println(mul);
				break;
		
			}
			
		

			else if(args[l-1].equals("div"))
			{
				for(int j=0;j<l-1;j++)
				{	
				
					div=div/Integer.parseInt(args[j]);
				}
				System.out.println(div);
				break;
			}
			
		}
		


	}

}