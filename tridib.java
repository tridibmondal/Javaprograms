class Box
{
int length;
int breadth;
int height;
void FetchDimension(int a,int b, int c)
{
a=length;
b=breadth;
c=height;
}

public static void main(String args[])
{
Box obj=new Box()
obj.FetchDimension(10,20,30)
System.out.println("length"+ l);
System.out.println("breadth"+ b);
System.out.println("height"+ h);
}
}