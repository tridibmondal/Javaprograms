public  class Dummy
{
 int l;
int b;
int h;
void SetData(int l,int b, int h)
{
 	this.l=l;
	this.b=b;
	this.h=h;
}
void GetData()
{
	System.out.println(l);
	System.out.println(b);
	System.out.println(h);
}
public static void main(String args[])
{
	Dummy obj=new Dummy();
	obj.SetData(10,20,30);
	obj.GetData();
}
}