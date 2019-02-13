class Student
{
String name;
int rollno;
int sapid;
String branch;
void SetAttribute (String n,int x,int y, String m)
{
	name=n;
	rollno=x;
	sapid=y;
	branch=m;
}
void GetAttribute()
{
	System.out.println("name "+ name);
	System.out.println("rollno "+ rollno);
	System.out.println("sapid "+ sapid);
	System.out.println("branch "+ branch);

}
public static void main(String args[])
{
	Student obj=new Student();
	obj.SetAttribute("Tridib",46,500063110,"cse ogi");
	obj.GetAttribute();
}
}