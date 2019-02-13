class Constructor
{
	int l;
	int b;
	int h;
public Constructor()
   {
	l=10;
	b=15;
	h=30;
   }
public Constructor(int length,int breadth,int height)
 { 
 	l=length;
	b=breadth;
	h=height;
 }
void getdata()
 {
	System.out.println(l);
	System.out.println(b);	
	System.out.println(h);		
 }
public static void main(String args[])
{
       Constructor b1=new Constructor();
       b1.getdata();
       Constructor b2=new Constructor(13,14,15);
       b2.getdata();
}
}