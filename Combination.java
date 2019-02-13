import java.util.*;
class Combination
{
public static void main(String args[])
  { 
	int[] a=new int[3];
 	Scanner sc= new Scanner(System.in);
       System.out.println("enter the  number");
	a[0]=sc.nextInt();
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	for(int k=0;k<3;k++)
	{
	if(i!=j && j!=k && k!=i)
  	{
		System.out.println(a[i]+""+a[j]+""+a[k]);
	}

     }
   }
  }
 }
}