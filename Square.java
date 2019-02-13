import java.util.Scanner;
public class Square
{
public static void main(String args[])
{
int[] a=new int[5];
int sum=0;
Scanner sc= new Scanner(System.in);
for(int i=0;i<5;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
	sum=sum+a[i]*a[i];
}
System.out.println(sum);
}
}
