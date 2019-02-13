import java.util.*;
class Marks
{
public static void main(String args[])
{ 
 int temp,i,j;
 int a[]= new int[10];
 System.out.println("enter the marks");
 for(i=0;i<10;i++)
 {
  Scanner sc=new Scanner(System.in);
  a[i]=sc.nextInt();
 }
for(i=0;i<10;i++)
{
 for(j=0;j<10-i-1;j++)
  {
	if(a[j]>a[j+1])
	{
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
  }
}
for(i=0;i<10;i++)
{
	if(a[i]>=40 && a[i]<=50)
	{
		System.out.println( a[i] + "\t  pass" );
        }
	else if(a[i]>=51 && a[i]<75)
	{
		System.out.println(a[i] + "\t  merit");
	}	
	else if(a[i]>=75 )
	{
		System.out.println(a[i] + "\t  distinction");
	}
}


}
}