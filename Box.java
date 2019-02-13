public class Box
{
int length;
int breadth;
int height;
void FetchDimension(int a,int b, int c)
{
length=a;
breadth=b;
height=c;
}
void GetDimension()
{
System.out.println(" \t length="+length);
System.out.println(" \t breadth="+breadth);
System.out.println(" \t height="+ height);
}

public static void main(String args[])
{
Box obj=new Box();
Box obj1=new Box();
obj.FetchDimension(10,20,30);
obj.GetDimension();
obj1.FetchDimension(15,25,33);
obj1.GetDimension();
}
}