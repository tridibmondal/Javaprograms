package p1;
public class Emp
{
String name;
int Empid;
String dept;
   public void SetData(String n,int x,String d)
	{
		name=n;
		Empid=x;
		dept=d;

	}

public void GetData()
	{
		System.out.println("name"+ name);
		System.out.println("Empid"+ Empid);
		System.out.println("dept"+ dept);
	}
}
