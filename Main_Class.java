class Person
{
private String name;
String gender;
int age;
void setData(String n,String g,int a)
{
	name=n;
	gender=g;
	age=a;
}
void getData()
{
System.out.println(name+" "+age+" "+gender);
}
}
class Student extends Person
{
int rollNo;
String branch;
void set(int r,String b)
{
	rollNo=r;
	branch=b;
}
void get()
{
System.out.println(rollNo+" "+branch);
}
}
public class Main_Class
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData("khcbdhk","male",21);
s1.getData();
s1.set(101,"CCVT");
s1.get();
}
}